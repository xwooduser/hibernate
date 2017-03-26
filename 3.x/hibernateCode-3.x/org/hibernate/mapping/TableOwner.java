//$Id: TableOwner.java,v 1.1 2004/10/06 23:24:14 epbernard Exp $
package org.hibernate.mapping;

/**
 * Interface allowing to differenciate SubClasses
 * from Classes, JoinedSubClasses and UnionSubClasses
 * The first one has not its own table while the others have
 * 
 * @author Emmanuel Bernard
 */
public interface TableOwner {
	void setTable(Table table);
}
