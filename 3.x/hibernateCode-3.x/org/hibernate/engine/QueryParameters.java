//$Id: QueryParameters.java,v 1.19 2005/08/10 05:06:40 oneovthafew Exp $
package org.hibernate.engine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.hibernate.HibernateException;
import org.hibernate.QueryException;
import org.hibernate.ScrollMode;
import org.hibernate.dialect.Dialect;
import org.hibernate.hql.classic.ParserHelper;
import org.hibernate.pretty.Printer;
import org.hibernate.type.Type;
import org.hibernate.util.ArrayHelper;

/**
 * @author Gavin King
 */
public final class QueryParameters {
	private static final Log log = LogFactory.getLog(QueryParameters.class);

	private Type[] positionalParameterTypes;
	private Object[] positionalParameterValues;
	private Map namedParameters;
	private Map lockModes;
	private RowSelection rowSelection;
	private boolean cacheable;
	private String cacheRegion;
	private String comment;
	private ScrollMode scrollMode;
	private Serializable[] collectionKeys;
	private Object optionalObject;
	private String optionalEntityName;
	private Serializable optionalId;
	private boolean readOnly;
	private boolean callable = false;
	private boolean isNaturalKeyLookup;
	
	private String processedSQL;
	private Type[] processedPositionalParameterTypes;
	private Object[] processedPositionalParameterValues;
	
	public QueryParameters() {
		this( ArrayHelper.EMPTY_TYPE_ARRAY, ArrayHelper.EMPTY_OBJECT_ARRAY );
	}

	public QueryParameters(Type type, Object value) {
		this( new Type[] {type}, new Object[] {value} );
	}

	public QueryParameters(
		final Type[] positionalParameterTypes,
		final Object[] postionalParameterValues,
		final Object optionalObject,
		final String optionalEntityName,
		final Serializable optionalObjectId
	) {
		this(positionalParameterTypes, postionalParameterValues);
		this.optionalObject = optionalObject;
		this.optionalId = optionalObjectId;
		this.optionalEntityName = optionalEntityName;

	}

	public QueryParameters(
		final Type[] positionalParameterTypes,
		final Object[] postionalParameterValues
	) {
		this(
			positionalParameterTypes,
			postionalParameterValues, 
			null, 
			null, 
			false, 
			null, 
			null,
			false
		);
	}

	public QueryParameters(
		final Type[] positionalParameterTypes,
		final Object[] postionalParameterValues,
		final Serializable[] collectionKeys
	) {
		this(
			positionalParameterTypes,
			postionalParameterValues,
			null,
			collectionKeys
		);
	}

	public QueryParameters(
			final Type[] positionalParameterTypes,
			final Object[] postionalParameterValues,
			final Map namedParameters,
			final Serializable[] collectionKeys
		) {
			this(
				positionalParameterTypes,
				postionalParameterValues,
				namedParameters,
				null,
				null,
				false,
				false,
				null, 
				null,
				collectionKeys
			);
		}

	public QueryParameters(
		final Type[] positionalParameterTypes,
		final Object[] positionalParameterValues,
		final Map lockModes,
		final RowSelection rowSelection,
		final boolean cacheable,
		final String cacheRegion,
		//final boolean forceCacheRefresh,
		final String comment,
		final boolean isLookupByNaturalKey
	) {
		this(
			positionalParameterTypes,
			positionalParameterValues,
			null,
			lockModes,
			rowSelection,
			false,
			cacheable,
			cacheRegion, 
			comment,
			null
		);
		isNaturalKeyLookup = isLookupByNaturalKey;
	}

	public QueryParameters(
			final Type[] positionalParameterTypes,
			final Object[] positionalParameterValues,
			final Map namedParameters,
			final Map lockModes,
			final RowSelection rowSelection,
			final boolean readOnly,
			final boolean cacheable,
			final String cacheRegion,
			//final boolean forceCacheRefresh,
			final String comment,
			final Serializable[] collectionKeys
	) {
		this.positionalParameterTypes = positionalParameterTypes;
		this.positionalParameterValues = positionalParameterValues;
		this.namedParameters = namedParameters;
		this.lockModes = lockModes;
		this.rowSelection = rowSelection;
		this.cacheable = cacheable;
		this.cacheRegion = cacheRegion;
		//this.forceCacheRefresh = forceCacheRefresh;
		this.comment = comment;
		this.collectionKeys = collectionKeys;
		this.readOnly = readOnly;
	}
	
	public QueryParameters(
		final Type[] positionalParameterTypes,
		final Object[] positionalParameterValues,
		final Map namedParameters,
		final Map lockModes,
		final RowSelection rowSelection,
		final boolean readOnly,
		final boolean cacheable,
		final String cacheRegion,
		//final boolean forceCacheRefresh,
		final String comment,
		final Serializable[] collectionKeys,
		final Object optionalObject,
		final String optionalEntityName,
		final Serializable optionalId
	) {
		this(
			positionalParameterTypes, 
			positionalParameterValues, 
			namedParameters, 
			lockModes, 
			rowSelection, 
			readOnly, 
			cacheable, 
			cacheRegion,
			comment,
			collectionKeys
		);
		this.optionalEntityName = optionalEntityName;
		this.optionalId = optionalId;
		this.optionalObject = optionalObject;
	}

	public boolean hasRowSelection() {
		return rowSelection!=null;
	}

	public Map getNamedParameters() {
		return namedParameters;
	}

	public Type[] getPositionalParameterTypes() {
		return positionalParameterTypes;
	}

	public Object[] getPositionalParameterValues() {
		return positionalParameterValues;
	}

	public RowSelection getRowSelection() {
		return rowSelection;
	}

	public void setNamedParameters(Map map) {
		namedParameters = map;
	}

	public void setPositionalParameterTypes(Type[] types) {
		positionalParameterTypes = types;
	}

	public void setPositionalParameterValues(Object[] objects) {
		positionalParameterValues = objects;
	}

	public void setRowSelection(RowSelection selection) {
		rowSelection = selection;
	}

	public Map getLockModes() {
		return lockModes;
	}

	public void setLockModes(Map map) {
		lockModes = map;
	}

	public void traceParameters(SessionFactoryImplementor factory) throws HibernateException {
		Printer print = new Printer(factory);
		if (positionalParameterValues.length!=0) {
			log.trace(
					"parameters: " + 
					print.toString(positionalParameterTypes, positionalParameterValues) 
				);
		}
		if (namedParameters!=null) {
			log.trace( "named parameters: " + print.toString(namedParameters) );
		}
	}

	public boolean isCacheable() {
		return cacheable;
	}

	public void setCacheable(boolean b) {
		cacheable = b;
	}

	public String getCacheRegion() {
		return cacheRegion;
	}

	public void setCacheRegion(String cacheRegion) {
		this.cacheRegion = cacheRegion;
	}

	public void validateParameters() throws QueryException {
		int types = positionalParameterTypes==null ? 0 : positionalParameterTypes.length;
		int values = positionalParameterValues==null ? 0 : positionalParameterValues.length;
		if (types!=values) {
			throw new QueryException(
					"Number of positional parameter types:" + types + 
					" does not match number of positional parameters: " + values
				);
		}
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public ScrollMode getScrollMode() {
		return scrollMode;
	}

	public void setScrollMode(ScrollMode scrollMode) {
		this.scrollMode = scrollMode;
	}

	public Serializable[] getCollectionKeys() {
		return collectionKeys;
	}

	public void setCollectionKeys(Serializable[] collectionKeys) {
		this.collectionKeys = collectionKeys;
	}

	public String getOptionalEntityName() {
		return optionalEntityName;
	}

	public void setOptionalEntityName(String optionalEntityName) {
		this.optionalEntityName = optionalEntityName;
	}

	public Serializable getOptionalId() {
		return optionalId;
	}

	public void setOptionalId(Serializable optionalId) {
		this.optionalId = optionalId;
	}

	public Object getOptionalObject() {
		return optionalObject;
	}

	public void setOptionalObject(Object optionalObject) {
		this.optionalObject = optionalObject;
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	public void setCallable(boolean callable) {
		this.callable = callable;		
	}

	public boolean isCallable() {
		return callable;
	}

	public void processFilters(String sql, SessionImplementor session) {
		
		if ( session.getEnabledFilters().size()==0 || sql.indexOf(ParserHelper.HQL_VARIABLE_PREFIX)<0 ) {
			// HELLA IMPORTANT OPTIMIZATION!!!
			processedPositionalParameterValues = getPositionalParameterValues();
			processedPositionalParameterTypes = getPositionalParameterTypes();
			processedSQL = sql;
		}
		else {
			
			Dialect dialect = session.getFactory().getDialect();
			String symbols = new StringBuffer().append( ParserHelper.HQL_SEPARATORS )
					.append( dialect.openQuote() )
					.append( dialect.closeQuote() )
					.toString();
			StringTokenizer tokens = new StringTokenizer( sql, symbols, true );
			StringBuffer result = new StringBuffer();
		
			List parameters = new ArrayList();
			List parameterTypes = new ArrayList();
		
			while ( tokens.hasMoreTokens() ) {
				final String token = tokens.nextToken();
				if ( token.startsWith( ParserHelper.HQL_VARIABLE_PREFIX ) ) {
					String filterParameterName = token.substring( 1 );
					Object value = session.getFilterParameterValue( filterParameterName );
					Type type = session.getFilterParameterType( filterParameterName );
					if ( value != null && Collection.class.isAssignableFrom( value.getClass() ) ) {
						Iterator itr = ( ( Collection ) value ).iterator();
						while ( itr.hasNext() ) {
							Object elementValue = itr.next();
							result.append( '?' );
							parameters.add( elementValue );
							parameterTypes.add( type );
							if ( itr.hasNext() ) {
								result.append( ", " );
							}
						}
					}
					else {
						result.append( '?' );
						parameters.add( value );
						parameterTypes.add( type );
					}
				}
				else {
					result.append( token );
				}
			}
			parameters.addAll( Arrays.asList( getPositionalParameterValues() ) );
			parameterTypes.addAll( Arrays.asList( getPositionalParameterTypes() ) );
			processedPositionalParameterValues = parameters.toArray();
			processedPositionalParameterTypes = ( Type[] ) parameterTypes.toArray( new Type[0] );
			processedSQL = result.toString();
			
		}
	}

	public String getFilteredSQL() {
		return processedSQL;
	}

	public Object[] getFilteredPositionalParameterValues() {
		return processedPositionalParameterValues;
	}

	public Type[] getFilteredPositionalParameterTypes() {
		return processedPositionalParameterTypes;
	}

	public boolean isNaturalKeyLookup() {
		return isNaturalKeyLookup;
	}

	public void setNaturalKeyLookup(boolean isNaturalKeyLookup) {
		this.isNaturalKeyLookup = isNaturalKeyLookup;
	}
		
}
