//$Id: Queryable.java,v 1.8 2005/08/13 23:03:35 oneovthafew Exp $
package org.hibernate.persister.entity;

/**
 * Extends the generic <tt>EntityPersister</tt> contract to add
 * operations required by the Hibernate Query Language
 *
 * @author Gavin King
 */
public interface Queryable extends Loadable, PropertyMapping, Joinable {

	/**
	 * Is this an abstract class?
	 */
	public boolean isAbstract();
	/**
	 * Is this class explicit polymorphism only?
	 */
	public boolean isExplicitPolymorphism();
	/**
	 * Get the class that this class is mapped as a subclass of -
	 * not necessarily the direct superclass
	 */
	public String getMappedSuperclass();
	/**
	 * Get the discriminator value for this particular concrete subclass,
	 * as a string that may be embedded in a select statement
	 */
	public String getDiscriminatorSQLValue();

	/**
	 * Given a query alias and an identifying suffix, render the intentifier select fragment.
	 */
	public String identifierSelectFragment(String name, String suffix);
	/**
	 * Given a query alias and an identifying suffix, render the property select fragment.
	 */
	public String propertySelectFragment(String alias, String suffix, boolean allProperties);

	/**
	 * Get the names of columns used to persist the identifier
	 */
	public String[] getIdentifierColumnNames();

	/**
	 * Is the inheritence hierarchy described by this persister contained across
	 * multiple tables?
	 *
	 * @return True if the inheritence hierarchy is spread across multiple tables; false otherwise.
	 */
	public boolean isMultiTable();

	/**
	 * Get the names of all tables used in the hierarchy (up and down) ordered such
	 * that deletes in the given order would not cause contraint violations.
	 *
	 * @return The ordered array of table names.
	 */
	public String[] getConstraintOrderedTableNameClosure();

	/**
	 * For each table specified in {@link #getConstraintOrderedTableNameClosure()}, get
	 * the columns that define the key between the various hierarchy classes.
	 * <p/>
	 * The first dimension here corresponds to the table indexes returned in
	 * {@link #getConstraintOrderedTableNameClosure()}.
	 * <p/>
	 * The second dimension should have the same length across all the elements in
	 * the first dimension.  If not, that'd be a problem ;)
	 *
	 * @return
	 */
	public String[][] getContraintOrderedTableKeyColumnClosure();

	/**
	 * Get the name of the temporary table to be used to (potentially) store id values
	 * when performing bulk update/deletes.
	 *
	 * @return The appropriate temporary table name.
	 */
	public String getTemporaryIdTableName();

	/**
	 * Get the appropriate DDL command for generating the temporary table to
	 * be used to (potentially) store id values when performing bulk update/deletes.
	 *
	 * @return The appropriate temporary table creation command.
	 */
	public String getTemporaryIdTableDDL();

	/**
	 * Given a property name, determine the number of the table which contains the column
	 * to which this property is mapped.
	 * <p/>
	 * Note that this is <b>not</b> relative to the results from {@link #getConstraintOrderedTableNameClosure()}.
	 * It is relative to the subclass table name closure maintained internal to the persister (yick!).
	 * It is also relative to the indexing used to resolve {@link #getSubclassTableName}...
	 *
	 * @param propertyPath The name of the property.
	 * @return The nunber of the table to which the property is mapped.
	 */
	public int getSubclassPropertyTableNumber(String propertyPath);

	/**
	 * Get the name of the table with the given index from the internal
	 * array.
	 *
	 * @param number The index into the internal array.
	 * @return
	 */
	public String getSubclassTableName(int number);
	
	/**
	 * Is the version property included in insert statements?
	 */
	public boolean isVersionPropertyInsertable();
}
