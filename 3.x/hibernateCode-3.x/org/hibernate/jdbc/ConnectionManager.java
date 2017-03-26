// $Id: ConnectionManager.java,v 1.13 2005/09/20 19:14:32 oneovthafew Exp $
package org.hibernate.jdbc;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.ConnectionReleaseMode;
import org.hibernate.HibernateException;
import org.hibernate.Interceptor;
import org.hibernate.engine.SessionFactoryImplementor;
import org.hibernate.exception.JDBCExceptionHelper;
import org.hibernate.util.JDBCExceptionReporter;

/**
 * Encapsulates JDBC Connection management logic needed by Hibernate.
 * <p/>
 * The lifecycle is intended to span a logical series of interactions with the
 * database.  Internally, this means the the lifecycle of the Session.
 *
 * @author Steve Ebersole
 */
public class ConnectionManager implements Serializable {

	// TODO : would love to remove dependence on SF here, and make this a general purpose thing.
	//  The SF is only really needed to "pass along" to batcher.
	//  Everything we obtain here from factory can (and was) passed in directly.

	private static final Log log = LogFactory.getLog( ConnectionManager.class );

	public static interface Callback {
		public void connectionOpened();
		public void connectionCleanedUp();
	}

	private transient SessionFactoryImplementor factory;
	private final Callback callback;

	private final ConnectionReleaseMode releaseMode;
	private transient Connection connection;

	private final boolean wasConnectionSupplied;
	private transient boolean shouldObtainConnection;
	private transient Batcher batcher;
	private transient Interceptor interceptor;
 
	/**
	 * Constructs a ConnectionManager.
	 * <p/>
	 * This is the form used internally.
	 * 
	 * @param factory The SessionFactory.
	 * @param callback An observer for internal state change.
	 * @param releaseMode The mode by which to release JDBC connections.
	 * @param connection An externally supplied connection.
	 */ 
	public ConnectionManager(
	        SessionFactoryImplementor factory,
	        Callback callback,
	        ConnectionReleaseMode releaseMode,
	        Connection connection,
	        Interceptor interceptor) {
		this.factory = factory;
		this.callback = callback;

		this.interceptor = interceptor;
		this.batcher = factory.getSettings().getBatcherFactory().createBatcher( this, interceptor );

		this.releaseMode = releaseMode;

		this.connection = connection;
		wasConnectionSupplied = ( connection != null );
		shouldObtainConnection = !wasConnectionSupplied;
	}

	/**
	 * The session factory.
	 *
	 * @return the session factory.
	 */
	public SessionFactoryImplementor getFactory() {
		return factory;
	}

	/**
	 * The batcher managed by this ConnectionManager.
	 *
	 * @return The batcher.
	 */
	public Batcher getBatcher() {
		return batcher;
	}

	/**
	 * Retrieves the connection currently managed by this ConnectionManager.
	 * <p/>
	 * Note, that we may need to obtain a connection to return here if a
	 * connection has either not yet been obtained (non-UserSuppliedConnectionProvider)
	 * or has previously been aggressively released (if supported in this environment).
	 *
	 * @return The current Connection.
	 *
	 * @throws HibernateException Indicates a connection is currently not
	 * available (we are currently manually disconnected).
	 */
	public Connection getConnection() throws HibernateException {
		if ( connection == null ) {
			if ( shouldObtainConnection ) {
				openConnection();
			}
			else {
				throw new HibernateException( "Not able to obtain connection" );
			}
		}
		return connection;
	}

	/**
	 * Is the connection considered "auto-commit"?
	 *
	 * @return True if we either do not have a connection, or the connection
	 * really is in auto-commit mode.
	 *
	 * @throws SQLException Can be thrown by the Connection.isAutoCommit() check.
	 */
	public boolean isAutoCommit() throws SQLException {
		return connection == null || connection.getAutoCommit();
	}
	
	public boolean isAggressiveRelease() {
		return releaseMode==ConnectionReleaseMode.AFTER_STATEMENT;
	}

	/**
	 * Is this ConnectionManager instance "logically" connected.  Meaning
	 * do we either have a cached connection available or do we have the
	 * ability to obtain a connection on demand.
	 *
	 * @return True if logically connected; false otherwise.
	 */
	public boolean isLogicallyConnected() {
		return connection != null || shouldObtainConnection;
	}

	/**
	 * Is theis ConnectionManager instance "physically" connection.  Meaning
	 * do have currently actually have a cached connection.
	 *
	 * @return True if physically connected; false otherwise.
	 */
	public boolean isPhysicallyConnected() {
		return connection != null;
	}

	/**
	 * To be called after execution of each JDBC statement.  Used to
	 * conditionally release the JDBC connection aggressively if
	 * the configured release mode indicates.
	 */
	public void afterStatement() {
		if ( isAggressiveRelease() ) {
			if ( batcher.hasOpenResources() ) {
				log.info( "Skipping aggresive-release due to open resources on batcher" );
			}
			else {
				aggressiveRelease();
			}
		}
	}

	/**
	 * To be called after local transaction completion.  Used to conditionally
	 * release the JDBC connection aggressively if the configured release mode
	 * indicates.
	 */
	public void afterTransaction() {
		if ( isAfterTransactionRelease() ) {
			// TODO : also consider the case where after_statement did not release due to open resources;
			//      do we want to close eveything here?
			aggressiveRelease();
		}
		batcher.unsetTransactionTimeout();
	}

	private boolean isAfterTransactionRelease() {
		return releaseMode == ConnectionReleaseMode.AFTER_TRANSACTION;
	}

	/**
	 * To be called after Session completion.  Used to release the JDBC
	 * connection.
	 *
	 * @return The connection mantained here at time of close.  Null if
	 * there was no connection cached internally.
	 */
	public Connection close() {
		if ( connection==null ) {
			shouldObtainConnection = false;
			return null;
		}
		else {
			return cleanup();
		}
	}

	/**
	 * Manually disconnect the underlying JDBC Connection.  The assumption here
	 * is that the manager will be reconnected at a later point in time.
	 *
	 * @return The connection mantained here at time of disconnect.  Null if
	 * there was no connection cached internally.
	 */
	public Connection manualDisconnect() {
		return cleanup();
	}

	/**
	 * Manually reconnect the underlying JDBC Connection.  Should be called at
	 * some point after manualDisconnect().
	 * <p/>
	 * This form is used for ConnectionProvider-supplied connections.
	 */
	public void manualReconnect() {
		if ( isLogicallyConnected() ) {
			throw new HibernateException( "Already connected" );
		}

		shouldObtainConnection = true;
	}

	/**
	 * Manually reconnect the underlying JDBC Connection.  Should be called at
	 * some point after manualDisconnect().
	 * <p/>
	 * This form is used for user-supplied connections.
	 */
	public void manualReconnect(Connection suppliedConnection) {
		if ( isLogicallyConnected() ) {
			throw new HibernateException( "Already connected" );
		}

		this.connection = suppliedConnection;
	}

	/**
	 * Releases the Connection and cleans up any resources associated with
	 * that Connection.  This leaves the internal state such that a Connection
	 * cannot be re-obtained.  This is intended for use:
	 * 1) at the end of the session
	 * 2) on a manual disconnect of the session
	 *
	 * @return The released connection.
	 * @throws HibernateException
	 */
	private Connection cleanup() throws HibernateException {
		try {
			if ( shouldObtainConnection ) {
				// the connection was previously released; nothing to do...
				shouldObtainConnection = false;
				return null;
			}
			else {
				if (connection==null) {
					throw new HibernateException( "Already disconnected" );
				}

				batcher.closeStatements();
				Connection c = null;
				if ( !wasConnectionSupplied ) {
					closeConnection();
				}
				else {
					c = connection;
				}
				connection = null;
				return c;
			}
		}
		finally {
			callback.connectionCleanedUp();
		}
	}

	/**
	 * Performs actions required to perform an aggressive release of the
	 * JDBC Connection.
	 */
	private void aggressiveRelease() {
		if ( !wasConnectionSupplied ) {
			log.debug( "aggressively releasing JDBC connection" );
			if ( connection != null ) {
				closeConnection();
			}
			shouldObtainConnection = true;
		}
	}

	/**
	 * Pysically opens a JDBC Connection.
	 *
	 * @throws HibernateException
	 */
	private void openConnection() throws HibernateException {
		log.debug("opening JDBC connection");
		try {
			connection = factory.getConnectionProvider().getConnection();
		}
		catch (SQLException sqle) {
			throw JDBCExceptionHelper.convert(
					factory.getSQLExceptionConverter(),
					sqle,
					"Cannot open connection"
				);
		}

		shouldObtainConnection = false;
		callback.connectionOpened(); // register synch; stats.connect()
	}

	/**
	 * Physically closes the JDBC Connection.
	 */
	private void closeConnection() {
		if ( log.isDebugEnabled() ) {
			log.debug(
					"closing JDBC connection [" +
					batcher.openResourceStatsAsString() + "]"
				);
		}

		try {
			if ( !connection.isClosed() ) {
				JDBCExceptionReporter.logAndClearWarnings( connection );
			}
			factory.getConnectionProvider().closeConnection( connection );
			connection = null;
		}
		catch (SQLException sqle) {
			throw JDBCExceptionHelper.convert( 
					factory.getSQLExceptionConverter(), 
					sqle, 
					"Cannot close connection" 
				);
		}
	}

	/**
	 * Used during serialization.
	 *
	 * @param oos The stream to which we are being written.
	 * @throws IOException Indicates an I/O error writing to the stream
	 */
	private void writeObject(ObjectOutputStream oos) throws IOException {
		if ( isPhysicallyConnected() ) {
			throw new IllegalStateException( "Cannot serialize a ConnectionManager while connected" );
		}

		oos.writeObject( factory );
		oos.writeObject( interceptor );
		oos.defaultWriteObject();
	}

	/**
	 * Used during deserialization.
	 *
	 * @param ois The stream from which we are being read.
	 * @throws IOException Indicates an I/O error reading the stream
	 * @throws ClassNotFoundException Indicates resource class resolution.
	 */
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		factory = (SessionFactoryImplementor) ois.readObject();
		//interceptor = factory.getInterceptor();
		interceptor = (Interceptor) ois.readObject();
		ois.defaultReadObject();

		this.batcher = factory.getSettings().getBatcherFactory().createBatcher( this, interceptor );
	}

	/**
	 * Just in case user forgot to commit()/cancel() or close()
	 */
	protected void finalize() throws Throwable {

		log.debug( "running Session.finalize()" );

		if ( connection != null ) {
			if ( connection.isClosed() ) {
				log.warn( "finalizing with closed connection" );
			}
			else {
				log.warn("unclosed connection, forgot to call close() on your session?");
				// TODO : Should we also call batcher.closeStatements() from here?
				if ( !wasConnectionSupplied ) {
					connection.close();
				}
			}
		}
	}

}
