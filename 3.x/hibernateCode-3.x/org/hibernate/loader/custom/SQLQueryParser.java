//$Id: SQLQueryParser.java,v 1.7 2005/07/03 19:42:43 maxcsaucdk Exp $
package org.hibernate.loader.custom;

import org.hibernate.QueryException;
import org.hibernate.hql.classic.ParserHelper;
import org.hibernate.persister.collection.SQLLoadableCollection;
import org.hibernate.persister.entity.SQLLoadable;
import org.hibernate.util.StringHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Gavin King, Max Andersen
 */
public class SQLQueryParser {

	private final String sqlQuery;

	private final Map entityPersisterByAlias;
	private final String[] aliases;
	private final String[] suffixes;
	
	private final SQLLoadableCollection[] collectionPersisters;
	private final String[] collectionAliases;
	private final String[] collectionSuffixes;

	private int parameterCount = 0;
	private final Map namedParameters = new HashMap();
	private final Map returnByAlias;
	
	private long aliasesFound = 0;
	public SQLQueryParser(String sqlQuery,
						  Map alias2Persister,
						  Map alias2Return, 
						  String[] aliases,
						  String[] collectionAliases,
						  SQLLoadableCollection[] collectionPersisters,
						  String[] suffixes,
	                      String[] collectionSuffixes) {
		this.sqlQuery = sqlQuery;
		this.entityPersisterByAlias = alias2Persister;
		this.returnByAlias = alias2Return; // TODO: maybe just fieldMaps ?
		this.collectionAliases = collectionAliases;
		this.collectionPersisters = collectionPersisters;
		this.suffixes = suffixes;
		this.aliases = aliases;
		this.collectionSuffixes = collectionSuffixes;
	}

	private SQLLoadable getPersisterByResultAlias(String aliasName) {
		return (SQLLoadable) entityPersisterByAlias.get(aliasName);
	}
	
	private Map getPropertyResultByResultAlias(String aliasName) {
		SQLQueryReturn sqr = (SQLQueryReturn) returnByAlias.get(aliasName);
		return sqr.getPropertyResultsMap();				
	}
	
	private boolean isEntityAlias(String aliasName) {
		return entityPersisterByAlias.containsKey(aliasName);
	}

	private int getPersisterIndex(String aliasName) {
		for ( int i = 0; i < aliases.length; i++ ) {
			if ( aliasName.equals( aliases[i] ) ) {
				return i;
			}
		}
		return -1;
	}

	public String process() {
		return substituteParams( substituteBrackets() );
	}

	// TODO: should "record" how many properties we have reffered to - and if we 
	//       don't get'em'all we throw an exception! Way better than trial and error ;)
	private String substituteBrackets() throws QueryException {

		StringBuffer result = new StringBuffer( sqlQuery.length() + 20 );
		int left, right;

		// replace {....} with corresponding column aliases
		for ( int curr = 0; curr < sqlQuery.length(); curr = right + 1 ) {
			if ( ( left = sqlQuery.indexOf( '{', curr ) ) < 0 ) {
				// No additional open braces found in the string, append the
				// rest of the string in its entirty and quit this loop
				result.append( sqlQuery.substring( curr ) );
				break;
			}

			// apend everything up until the next encountered open brace
			result.append( sqlQuery.substring( curr, left ) );

			if ( ( right = sqlQuery.indexOf( '}', left + 1 ) ) < 0 ) {
				throw new QueryException( "Unmatched braces for alias path", sqlQuery );
			}

			String aliasPath = sqlQuery.substring( left + 1, right );
			int firstDot = aliasPath.indexOf( '.' );
			if ( firstDot == -1 ) {
				if ( isEntityAlias(aliasPath) ) {
					// it is a simple table alias {foo}
					result.append(aliasPath);
					aliasesFound++;
				} 
				else {
					// passing through anything we do not know to support jdbc escape sequences HB-898
					result.append( '{' ).append(aliasPath).append( '}' );					
				}
			}
			else {
				String aliasName = aliasPath.substring(0, firstDot);
				int collectionIndex = Arrays.binarySearch(collectionAliases, aliasName);
				boolean isCollection = collectionIndex>-1;
				boolean isEntity = isEntityAlias(aliasName);
				
				if (isCollection) {
					// The current alias is referencing the collection to be eagerly fetched
					String propertyName = aliasPath.substring( firstDot + 1 );
					result.append(resolveCollectionProperties(aliasName, 
												propertyName, 
												getPropertyResultByResultAlias(aliasName), 
												getPersisterByResultAlias(aliasName),
												collectionPersisters[collectionIndex],
												collectionSuffixes[collectionIndex],
												suffixes[getPersisterIndex(aliasName)]) );
					aliasesFound++;
				} 
				else if (isEntity) {
					// it is a property reference {foo.bar}
					String propertyName = aliasPath.substring( firstDot + 1 );
					result.append(resolveProperties( 
							aliasName, 
							propertyName, 
							getPropertyResultByResultAlias(aliasName), 
							getPersisterByResultAlias(aliasName), suffixes[getPersisterIndex(aliasName)] // TODO: guard getPersisterIndex
						) );
					aliasesFound++;
				}
				
				if ( !isEntity && !isCollection ) {
					// passing through anything we do not know to support jdbc escape sequences HB-898
					result.append( '{' ).append(aliasPath).append( '}' );
				}
	
			}
		}

		// Possibly handle :something parameters for the query ?

		return result.toString();
	}	

	private String resolveCollectionProperties(String aliasName,
			String propertyName,
			Map fieldResults, SQLLoadable elementPersister, SQLLoadableCollection currentPersister, String suffix, String persisterSuffix) {
		
		if ( "*".equals( propertyName ) ) {
			if( !fieldResults.isEmpty() ) {
				throw new QueryException("Using return-propertys together with * syntax is not supported.");
			}
			
			String selectFragment = currentPersister.selectFragment( aliasName, suffix );
			aliasesFound++;
			return new String(selectFragment 
						+ ", " 
						+ resolveProperties(aliasName, propertyName, fieldResults, elementPersister, persisterSuffix ) );
		}
		else if ( "element.*".equals( propertyName ) ) {
			return resolveProperties(aliasName, "*", fieldResults, elementPersister, persisterSuffix);
			
		}
		else {
					
			String[] columnAliases;
			
//			Let return-propertys override whatever the persister has for aliases.
			columnAliases = (String[]) fieldResults.get(propertyName);
			if(columnAliases==null) {
				columnAliases = currentPersister.getCollectionPropertyColumnAliases( propertyName, suffix );				
			}
			
			if ( columnAliases == null || columnAliases.length == 0 ) {
				throw new QueryException( "No column name found for property [" +
						propertyName +
						"] for alias [" + aliasName + "]",
						sqlQuery );
			}
			if ( columnAliases.length != 1 ) {
//				TODO: better error message since we actually support composites if names are explicitly listed.
				throw new QueryException( "SQL queries only support properties mapped to a single column - property [" +
						propertyName +
						"] is mapped to " +
						columnAliases.length +
						" columns.",
						sqlQuery );
			}
			aliasesFound++;
			return columnAliases[0];
		
		}
	}
	private String resolveProperties(String aliasName,
								   String propertyName,
								   Map fieldResults, SQLLoadable currentPersister, String suffix) {
		/*int currentPersisterIndex = getPersisterIndex( aliasName );

		if ( !aliasName.equals( aliases[currentPersisterIndex] ) ) {
			throw new QueryException( "Alias [" +
					aliasName +
					"] does not correspond to return alias " +
					aliases[currentPersisterIndex],
					sqlQuery );
		}*/

		if ( "*".equals( propertyName ) ) {
			if( !fieldResults.isEmpty() ) {
				throw new QueryException("Using return-propertys together with * syntax is not supported.");
			}			
			aliasesFound++;
			return currentPersister.selectFragment( aliasName, suffix ) ;
		}
		else {

			String[] columnAliases;

			// Let return-propertys override whatever the persister has for aliases.
			columnAliases = (String[]) fieldResults.get(propertyName);
			if(columnAliases==null) {
				columnAliases = currentPersister.getSubclassPropertyColumnAliases( propertyName, suffix );
			}

			if ( columnAliases == null || columnAliases.length == 0 ) {
				throw new QueryException( "No column name found for property [" +
						propertyName +
						"] for alias [" + aliasName + "]",
						sqlQuery );
			}
			if ( columnAliases.length != 1 ) {
				// TODO: better error message since we actually support composites if names are explicitly listed.
				throw new QueryException( "SQL queries only support properties mapped to a single column - property [" +
						propertyName +
						"] is mapped to " +
						columnAliases.length +
						" columns.",
						sqlQuery );
			}			
			aliasesFound++;
			return columnAliases[0];
		}
	}


	private String substituteParams(String sqlString) {

		StringBuffer result = new StringBuffer( sqlString.length() );
		int left, right;

		// Replace :... with ? and record the parameter. Naively just replaces ALL occurences of :... 
		// including whatever is BEFORE FROM. Do not "fast-forward" to the first or last FROM as 
		// "weird" sql might have parameters in places we do not know of, right ? ;)
		for ( int curr = 0; curr < sqlString.length(); curr = right + 1 ) {
			if ( ( left = sqlString.indexOf( ParserHelper.HQL_VARIABLE_PREFIX, curr ) ) < 0 ) {
				result.append( sqlString.substring( curr ) );
				break;
			}

			result.append( sqlString.substring( curr, left ) );

			// Find first place of a HQL_SEPERATOR char
			right = StringHelper.firstIndexOfChar( sqlString, ParserHelper.HQL_SEPARATORS, left + 1 );

			// did we find a HQL_SEPERATOR ?
			boolean foundSeperator = right > 0;
			int chopLocation = -1;
			if ( right < 0 ) {
				chopLocation = sqlString.length();
			}
			else {
				chopLocation = right;
			}

			String param = sqlString.substring( left + 1, chopLocation );
			addNamedParameter( param );
			result.append( "?" );
			if ( foundSeperator ) {
				result.append( sqlString.charAt( right ) );
			}
			else {
				break;
			}
		}
		return result.toString();
	}

	// NAMED PARAMETER SUPPORT, copy/pasted from QueryTranslator!
	private void addNamedParameter(String name) {
		Integer loc = new Integer( parameterCount++ );
		Object o = namedParameters.get( name );
		if ( o == null ) {
			namedParameters.put( name, loc );
		}
		else if ( o instanceof Integer ) {
			ArrayList list = new ArrayList( 4 );
			list.add( o );
			list.add( loc );
			namedParameters.put( name, list );
		}
		else {
			( ( List ) o ).add( loc );
		}
	}

	public Map getNamedParameters() {
		return namedParameters;
	}

	public boolean queryHasAliases() {
		return aliasesFound>0;
	}

}
