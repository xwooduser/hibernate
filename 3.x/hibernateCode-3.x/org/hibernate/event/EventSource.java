//$Id: EventSource.java,v 1.2 2005/07/15 03:35:18 oneovthafew Exp $
package org.hibernate.event;

import java.io.Serializable;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.engine.ActionQueue;
import org.hibernate.engine.EntityEntry;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.persister.entity.EntityPersister;

/**
 * @author Gavin King
 */
public interface EventSource extends SessionImplementor, Session {
	
	/**
	 * Get the ActionQueue for this session
	 */
	public ActionQueue getActionQueue();

	/**
	 * Instantiate an entity instance, using either an interceptor,
	 * or the given persister
	 */
	public Object instantiate(EntityPersister persister, Serializable id) throws HibernateException;

	/**
	 * Force an immediate flush
	 */
	public void forceFlush(EntityEntry e) throws HibernateException;

	/**
	 * Cascade merge an entity instance
	 */
	public void merge(String entityName, Object object, Map copiedAlready) throws HibernateException;
	/**
	 * Cascade persist an entity instance
	 */
	public void persist(String entityName, Object object, Map createdAlready) throws HibernateException;
	/**
	 * Cascade refesh an entity instance
	 */
	public void refresh(Object object, Map refreshedAlready) throws HibernateException;
	/**
	 * Cascade copy an entity instance
	 */
	public void saveOrUpdateCopy(String entityName, Object object, Map copiedAlready) throws HibernateException;
	
	/**
	 * Cascade delete an entity instance
	 */
	public void delete(String entityName, Object child, boolean isCascadeDeleteEnabled);

}
