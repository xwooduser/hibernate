//$Id: JDBCTransactionFactory.java,v 1.7 2005/08/30 03:38:42 oneovthafew Exp $
package org.hibernate.transaction;

import java.util.Properties;

import org.hibernate.ConnectionReleaseMode;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.jdbc.JDBCContext;

/**
 * Factory for <tt>JDBCTransaction</tt>.
 * @see JDBCTransaction
 * @author Anton van Straaten
 */
public final class JDBCTransactionFactory implements TransactionFactory {

	public ConnectionReleaseMode getDefaultReleaseMode() {
		return ConnectionReleaseMode.AFTER_TRANSACTION;
	}

	public Transaction createTransaction(JDBCContext jdbcContext, Context transactionContext) 
	throws HibernateException {
		return new JDBCTransaction( jdbcContext, transactionContext );
	}

	public void configure(Properties props) throws HibernateException {}

	public boolean isTransactionManagerRequired() {
		return false;
	}

}
