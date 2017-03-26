//$Id: ArithmeticNode.java,v 1.2 2005/07/19 16:41:11 oneovthafew Exp $
package org.hibernate.hql.ast.tree;

import org.hibernate.Hibernate;
import org.hibernate.hql.ast.util.ColumnHelper;
import org.hibernate.type.Type;

import antlr.SemanticException;
import antlr.collections.AST;

/**
 * @author Gavin King
 */
public class ArithmeticNode extends AbstractSelectExpression {
	
	/**
	 * Figure out the type of the binary expression by looking at
	 * the types of the operands. Sometimes we don't know both types,
	 * if, for example, one is a parameter.
	 */
	public Type getDataType() {
		AST first = getFirstChild();
		AST second = getFirstChild().getNextSibling();
		if ( !( second instanceof SelectExpression ) ) {
			if ( first instanceof SelectExpression ) {
				//we only know the type of the first
				return ( (SelectExpression) first ).getDataType();
			}
			else {
				return Hibernate.DOUBLE; //BLIND GUESS!
			}
		}
		else {
			if ( first instanceof SelectExpression) {
				//both have known type
				Type x = ( (SelectExpression) first ).getDataType();
				Type y = ( (SelectExpression) second ).getDataType();
				if ( x==Hibernate.DOUBLE || y==Hibernate.DOUBLE ) return Hibernate.DOUBLE;
				if ( x==Hibernate.FLOAT || y==Hibernate.FLOAT ) return Hibernate.FLOAT;
				if ( x==Hibernate.BIG_DECIMAL || y==Hibernate.BIG_DECIMAL ) return Hibernate.BIG_DECIMAL;
				if ( x==Hibernate.BIG_INTEGER || y==Hibernate.BIG_INTEGER ) return Hibernate.BIG_INTEGER;
				if ( x==Hibernate.LONG || y==Hibernate.LONG ) return Hibernate.LONG;
				if ( x==Hibernate.INTEGER || y==Hibernate.INTEGER ) return Hibernate.INTEGER;
				return x;
			}
			else {
				//we only know the type of the second
				return ( (SelectExpression) second ).getDataType();
			}
		}
	}

	public void setScalarColumnText(int i) throws SemanticException {
		ColumnHelper.generateSingleScalarColumn( this, i );
	}

}
