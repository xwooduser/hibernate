//$Id: JACCPreDeleteEventListener.java,v 1.10 2005/08/12 17:48:28 epbernard Exp $
package org.hibernate.secure;

import javax.security.jacc.EJBMethodPermission;

import org.hibernate.event.PreDeleteEvent;
import org.hibernate.event.PreDeleteEventListener;

/**
 * Check security before any deletion
 * 
 * @author <a href="mailto:kabir.khan@jboss.org">Kabir Khan</a>
 */
public class JACCPreDeleteEventListener implements PreDeleteEventListener {
	public boolean onPreDelete(PreDeleteEvent event) {

		EJBMethodPermission deletePermission = new EJBMethodPermission( 
				event.getPersister().getEntityName(), 
				HibernatePermission.DELETE, 
				null, 
				null 
			);

		JACCPermissions.checkPermission( event.getEntity().getClass(), deletePermission );

		return false;
	}

}
