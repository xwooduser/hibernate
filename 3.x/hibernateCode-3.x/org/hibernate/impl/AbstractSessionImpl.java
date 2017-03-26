//$Id: AbstractSessionImpl.java,v 1.2 2005/08/19 23:40:24 epbernard Exp $
package org.hibernate.impl;

import org.hibernate.MappingException;
import org.hibernate.Query;
import org.hibernate.engine.NamedQueryDefinition;
import org.hibernate.engine.NamedSQLQueryDefinition;
import org.hibernate.engine.SessionImplementor;

/**
 * Functionality common to stateless and stateful sessions
 * 
 * @author Gavin King
 */
public abstract class AbstractSessionImpl implements SessionImplementor {
	protected transient SessionFactoryImpl factory;
	
	protected AbstractSessionImpl(SessionFactoryImpl factory) {
		this.factory = factory;
	}
	
	public Query getNamedQuery(String queryName) throws MappingException {
		NamedQueryDefinition nqd = factory.getNamedQuery(queryName);
		final Query query;
		if ( nqd != null ) {
			String queryString = nqd.getQueryString();
			QueryImpl query1 = new QueryImpl(queryString, nqd.getFlushMode(), this);
			query = query1;
			query.setComment("named HQL query " + queryName);
		}
		else {
			NamedSQLQueryDefinition nsqlqd = factory.getNamedSQLQuery( queryName );
			if (nsqlqd==null) {
				throw new MappingException("Named query not known: " + queryName);
			}
			query = new SQLQueryImpl(nsqlqd, this);
			query.setComment("named native SQL query " + queryName);
			nqd = nsqlqd;
		}
		initQuery(query, nqd );
		return query;
	}

	public Query getNamedSQLQuery(String queryName) throws MappingException {
		NamedSQLQueryDefinition nsqlqd = factory.getNamedSQLQuery( queryName );
		if (nsqlqd==null) {
			throw new MappingException("Named SQL query not known: " + queryName);
		}
		Query query = new SQLQueryImpl(nsqlqd, this);
		query.setComment("named native SQL query " + queryName);
		initQuery( query, nsqlqd );
		return query;
	}

	private void initQuery(Query query, NamedQueryDefinition nqd) {
		query.setCacheable( nqd.isCacheable() );
		query.setCacheRegion( nqd.getCacheRegion() );
		if ( nqd.getTimeout()!=null ) query.setTimeout( nqd.getTimeout().intValue() );
		if ( nqd.getFetchSize()!=null ) query.setFetchSize( nqd.getFetchSize().intValue() );
		if ( nqd.getCacheMode() != null ) query.setCacheMode( nqd.getCacheMode() );
		query.setReadOnly( nqd.isReadOnly() );
		if ( nqd.getComment() != null ) query.setComment( nqd.getComment() );
	}
	
}
