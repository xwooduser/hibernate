// $Id: ConnectionReleaseMode.java,v 1.2 2005/05/03 23:44:14 oneovthafew Exp $
package org.hibernate;

import java.io.Serializable;

/**
 * Defines the various policies by which Hibernate might release its underlying
 * JDBC connection.
 *
 * @author Steve Ebersole
 */
public class ConnectionReleaseMode  implements Serializable {

	/**
	 * Indicates that JDBC connection should be aggressively released after each 
	 * SQL statement is executed. In this mode, the application <em>must</em>
	 * explicitly close all iterators and scrollable results. This mode may
	 * only be used with a JTA datasource.
	 */
	public static final ConnectionReleaseMode AFTER_STATEMENT = new ConnectionReleaseMode( "after_statement" );

	/**
	 * Indicates that JDBC connections should be released after each transaction 
	 * ends (works with both JTA-registered synch and HibernateTransaction API).
	 * This mode may not be used with an application server JTA datasource.
	 */
	public static final ConnectionReleaseMode AFTER_TRANSACTION = new ConnectionReleaseMode( "after_transaction" );

	/**
	 * Indicates that connections should only be released when the Session is explicitly closed 
	 * or disconnected; this is the default and legacy behavior.
	 */
	public static final ConnectionReleaseMode ON_CLOSE = new ConnectionReleaseMode( "on_close" );


	private String name;

	private ConnectionReleaseMode(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public static ConnectionReleaseMode parse(String modeName) {
		if ( AFTER_STATEMENT.name.equals( modeName ) ) {
			return AFTER_STATEMENT;
		}
		else if ( AFTER_TRANSACTION.name.equals( modeName ) ) {
			return AFTER_TRANSACTION;
		}
		// default is to release connections on close of the session (legacy behaviour).
		return ON_CLOSE;
	}

	private Object readResolve() {
		return parse( name );
	}
}
