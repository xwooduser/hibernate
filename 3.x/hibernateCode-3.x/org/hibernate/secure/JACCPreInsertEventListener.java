//$Id: JACCPreInsertEventListener.java,v 1.10 2005/08/12 17:48:28 epbernard Exp $
package org.hibernate.secure;

import javax.security.jacc.EJBMethodPermission;

import org.hibernate.event.PreInsertEvent;
import org.hibernate.event.PreInsertEventListener;

/**
 * Check security before an insertion
 * 
 * @author <a href="mailto:kabir.khan@jboss.org">Kabir Khan</a>
 */
public class JACCPreInsertEventListener implements PreInsertEventListener {
	public boolean onPreInsert(PreInsertEvent event) {

		EJBMethodPermission insertPermission = new EJBMethodPermission( 
				event.getPersister().getEntityName(), 
				HibernatePermission.INSERT, 
				null, 
				null 
			);

		JACCPermissions.checkPermission( event.getEntity().getClass(), insertPermission );

		return false;
	}

}
