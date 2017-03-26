// $Id: JACCPreLoadEventListener.java,v 1.10 2005/08/12 17:48:28 epbernard Exp $
package org.hibernate.secure;

import javax.security.jacc.EJBMethodPermission;

import org.hibernate.event.PreLoadEvent;
import org.hibernate.event.PreLoadEventListener;

/**
 * Check security before any load
 * 
 * @author <a href="mailto:kabir.khan@jboss.org">Kabir Khan</a>
 * @version $Revision: 1.10 $
 */
public class JACCPreLoadEventListener implements PreLoadEventListener {
	public void onPreLoad(PreLoadEvent event) {

		EJBMethodPermission loadPermission = new EJBMethodPermission( 
				event.getPersister().getEntityName(), 
				HibernatePermission.READ, 
				null, 
				null 
			);

		JACCPermissions.checkPermission( event.getEntity().getClass(), loadPermission );

	}

}
