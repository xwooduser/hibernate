//$Id: JBossTransactionManagerLookup.java,v 1.2 2005/09/09 19:22:52 oneovthafew Exp $
package org.hibernate.transaction;

/**
 * A <tt>TransactionManager</tt> lookup strategy for JBoss
 * @author Gavin King
 */
public final class JBossTransactionManagerLookup extends JNDITransactionManagerLookup {

	protected String getName() {
		return "java:/TransactionManager";
	}

	public String getUserTransactionName() {
		return "java:comp/UserTransaction";
	}

}






