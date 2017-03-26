// $Id: StatementExecutor.java,v 1.1 2005/07/12 20:27:16 steveebersole Exp $
package org.hibernate.hql.ast.exec;

import org.hibernate.HibernateException;
import org.hibernate.engine.QueryParameters;
import org.hibernate.engine.SessionImplementor;

/**
 * Encapsulates the strategy required to execute various types of update, delete,
 * and insert statements issued through HQL.
 *
 * @author Steve Ebersole
 */
public interface StatementExecutor {

	/**
	 * Execute the sql managed by this executor using the given parameters.
	 *
	 * @param parameters Essentially bind information for this processing.
	 * @param session The session originating the request.
	 * @return The number of entities updated/deleted.
	 * @throws HibernateException
	 */
	public int execute(QueryParameters parameters, SessionImplementor session) throws HibernateException;

}
