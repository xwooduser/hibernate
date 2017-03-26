//$Id: JACCPreUpdateEventListener.java,v 1.10 2005/08/12 17:48:28 epbernard Exp $
package org.hibernate.secure;

import javax.security.jacc.EJBMethodPermission;

import org.hibernate.event.PreUpdateEvent;
import org.hibernate.event.PreUpdateEventListener;

/**
 * Check security before any update
 * 
 * @author <a href="mailto:kabir.khan@jboss.org">Kabir Khan</a>
 * @version $Revision: 1.10 $
 */
public class JACCPreUpdateEventListener implements PreUpdateEventListener {
	public boolean onPreUpdate(PreUpdateEvent event) {

		EJBMethodPermission updatePermission = new EJBMethodPermission( 
				event.getPersister().getEntityName(), 
				HibernatePermission.UPDATE, 
				null, 
				null 
			);

		JACCPermissions.checkPermission( event.getEntity().getClass(), updatePermission );

		return false;
	}

}
