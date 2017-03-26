//$Id: JACCPermissions.java,v 1.1 2005/07/21 04:56:17 oneovthafew Exp $
package org.hibernate.secure;

import java.lang.reflect.UndeclaredThrowableException;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.Policy;
import java.security.Principal;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.ProtectionDomain;
import java.util.Set;

import javax.security.auth.Subject;
import javax.security.jacc.EJBMethodPermission;
import javax.security.jacc.PolicyContext;
import javax.security.jacc.PolicyContextException;

/**
 * Copied from JBoss org.jboss.ejb3.security.JaccHelper and org.jboss.ejb3.security.SecurityActions
 * 
 * @author <a href="mailto:kabir.khan@jboss.org">Kabir Khan</a>
 */
public class JACCPermissions {

	public static void checkPermission(Class clazz, EJBMethodPermission methodPerm)
			throws SecurityException {
		CodeSource ejbCS = clazz.getProtectionDomain().getCodeSource();
		
		try {
			Policy policy = Policy.getPolicy();
			// Get the caller
			Subject caller = getContextSubject();

			Principal[] principals = null;
			if ( caller != null ) {
				// Get the caller principals
				Set principalsSet = caller.getPrincipals();
				principals = new Principal[ principalsSet.size() ];
				principalsSet.toArray( principals );
			}

			ProtectionDomain pd = new ProtectionDomain( ejbCS, null, null, principals );
			if ( policy.implies( pd, methodPerm ) == false ) {
				String msg = "Denied: " + methodPerm + ", caller=" + caller;
				SecurityException e = new SecurityException( msg );
				throw e;
			}
		}
		catch (PolicyContextException e) {
			throw new RuntimeException( e );
		}
	}

	interface PolicyContextActions {
		/** The JACC PolicyContext key for the current Subject */
		static final String SUBJECT_CONTEXT_KEY = "javax.security.auth.Subject.container";
		PolicyContextActions PRIVILEGED = new PolicyContextActions() {
			private final PrivilegedExceptionAction exAction = new PrivilegedExceptionAction() {
				public Object run() throws Exception {
					return (Subject) PolicyContext.getContext( SUBJECT_CONTEXT_KEY );
				}
			};

			public Subject getContextSubject() throws PolicyContextException {
				try {
					return (Subject) AccessController.doPrivileged( exAction );
				}
				catch (PrivilegedActionException e) {
					Exception ex = e.getException();
					if ( ex instanceof PolicyContextException ) {
						throw (PolicyContextException) ex;
					}
					else throw new UndeclaredThrowableException( ex );
				}
			}
		};

		PolicyContextActions NON_PRIVILEGED = new PolicyContextActions() {
			public Subject getContextSubject() throws PolicyContextException {
				return (Subject) PolicyContext.getContext( SUBJECT_CONTEXT_KEY );
			}
		};

		Subject getContextSubject() throws PolicyContextException;
	}

	static Subject getContextSubject() throws PolicyContextException {
		if ( System.getSecurityManager() == null ) {
			return PolicyContextActions.NON_PRIVILEGED.getContextSubject();
		}
		else {
			return PolicyContextActions.PRIVILEGED.getContextSubject();
		}
	}

}
