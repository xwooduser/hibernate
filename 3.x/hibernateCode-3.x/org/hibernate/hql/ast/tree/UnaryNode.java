//$Id: UnaryNode.java,v 1.1 2005/07/12 20:27:17 steveebersole Exp $
package org.hibernate.hql.ast.tree;

import org.hibernate.hql.ast.util.ColumnHelper;
import org.hibernate.type.Type;

import antlr.SemanticException;

public class UnaryNode extends AbstractSelectExpression {

	public Type getDataType() {
		return ( (SelectExpression) getFirstChild() ).getDataType();
	}

	public void setScalarColumnText(int i) throws SemanticException {
		ColumnHelper.generateSingleScalarColumn( this, i );
	}

}
