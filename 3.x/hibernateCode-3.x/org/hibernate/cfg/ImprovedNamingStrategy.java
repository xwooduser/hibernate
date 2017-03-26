//$Id: ImprovedNamingStrategy.java,v 1.3 2005/08/11 16:42:04 oneovthafew Exp $
package org.hibernate.cfg;

import java.io.Serializable;

import org.hibernate.util.StringHelper;

/**
 * An improved naming strategy that prefers embedded
 * underscores to mixed case names
 * @see DefaultNamingStrategy the default strategy
 * @author Gavin King
 */
public class ImprovedNamingStrategy implements NamingStrategy, Serializable {

	/**
	 * A convenient singleton instance
	 */
	public static final NamingStrategy INSTANCE = new ImprovedNamingStrategy();

	/**
	 * Return the unqualified class name, mixed case converted to
	 * underscores
	 */
	public String classToTableName(String className) {
		return addUnderscores( StringHelper.unqualify(className) );
	}
	/**
	 * Return the full property path with underscore seperators, mixed
	 * case converted to underscores
	 */
	public String propertyToColumnName(String propertyName) {
		return addUnderscores(propertyName);
	}
	/**
	 * Convert mixed case to underscores
	 */
	public String tableName(String tableName) {
		return addUnderscores(tableName);
	}
	/**
	 * Convert mixed case to underscores
	 */
	public String columnName(String columnName) {
		return addUnderscores(columnName);
	}
	/**
	 * Return the full property path prefixed by the unqualified class
	 * name, with underscore seperators, mixed case converted to underscores
	 */
	public String propertyToTableName(String className, String propertyName) {
		return classToTableName(className) + '_' + propertyToColumnName(propertyName);
	}

	private static String addUnderscores(String name) {
		StringBuffer buf = new StringBuffer( name.replace('.', '_') );
		for (int i=1; i<buf.length()-1; i++) {
			if (
				Character.isLowerCase( buf.charAt(i-1) ) &&
				Character.isUpperCase( buf.charAt(i) ) &&
				Character.isLowerCase( buf.charAt(i+1) )
			) {
				buf.insert(i++, '_');
			}
		}
		return buf.toString().toLowerCase();
	}

}
