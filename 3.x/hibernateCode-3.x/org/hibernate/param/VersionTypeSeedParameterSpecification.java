// $Id: VersionTypeSeedParameterSpecification.java,v 1.2 2005/08/03 20:00:19 steveebersole Exp $
package org.hibernate.param;

import org.hibernate.engine.QueryParameters;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.type.VersionType;
import org.hibernate.param.ParameterSpecification;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Implementation of VersionTypeSeedParameterSpecification.
 *
 * @author Steve Ebersole
 */
public class VersionTypeSeedParameterSpecification implements ParameterSpecification {

	private VersionType type;

	public VersionTypeSeedParameterSpecification(VersionType type) {
		this.type = type;
	}

	/**
	 * @see org.hibernate.param.ParameterSpecification#bind
	 */
	public int bind(PreparedStatement statement, QueryParameters qp, SessionImplementor session, int position)
	        throws SQLException {
		type.nullSafeSet( statement, type.seed( session ), position, session );
		return 1;
	}
}
