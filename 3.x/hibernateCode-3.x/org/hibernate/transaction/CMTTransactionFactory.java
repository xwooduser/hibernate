//$Id: CMTTransactionFactory.java,v 1.5 2005/08/30 03:38:42 oneovthafew Exp $
package org.hibernate.transaction;

import java.util.Properties;

import org.hibernate.ConnectionReleaseMode;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.jdbc.JDBCContext;

/**
 * Factory for <tt>CMTTransaction</tt>.
 *
 * @see CMTTransaction
 * @author Gavin King
 */
public class CMTTransactionFactory implements TransactionFactory {

	public ConnectionReleaseMode getDefaultReleaseMode() {
		return ConnectionReleaseMode.AFTER_STATEMENT;
	}

	public void configure(Properties props) throws HibernateException {}

	public Transaction createTransaction(JDBCContext jdbcContext, Context transactionContext) 
	throws HibernateException {
		return new CMTTransaction(jdbcContext, transactionContext);
	}

	public boolean isTransactionManagerRequired() {
		return true;
	}
}
