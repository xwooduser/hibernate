// $Id: SyntheticAndFactory.java,v 1.1 2005/07/12 20:27:22 steveebersole Exp $
package org.hibernate.hql.ast.util;

import java.util.Map;

import org.hibernate.hql.antlr.HqlSqlTokenTypes;
import org.hibernate.hql.ast.tree.FromElement;
import org.hibernate.hql.ast.tree.QueryNode;
import org.hibernate.hql.ast.tree.RestrictableStatement;
import org.hibernate.hql.ast.tree.SqlFragment;
import org.hibernate.persister.entity.Queryable;
import org.hibernate.sql.JoinFragment;
import org.hibernate.util.StringHelper;

import antlr.ASTFactory;
import antlr.collections.AST;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Creates synthetic and nodes based on the where fragment part of a JoinSequence.
 *
 * @author josh Dec 5, 2004 12:25:20 PM
 */
public class SyntheticAndFactory implements HqlSqlTokenTypes {
	private static final Log log = LogFactory.getLog( SyntheticAndFactory.class );

	private ASTFactory astFactory;
	private AST thetaJoins;
	private AST filters;

	public SyntheticAndFactory(ASTFactory astFactory) {
		this.astFactory = astFactory;
	}

	public void addWhereFragment(JoinFragment joinFragment, String whereFragment, QueryNode query, FromElement fromElement) {

		if ( whereFragment != null ) {
			whereFragment = whereFragment.trim();
		}
		if ( StringHelper.isEmpty( whereFragment ) ) {
			return;
		}
		else if ( !fromElement.useWhereFragment() && !joinFragment.hasThetaJoins() ) {
			return;
		}

		// Forcefully remove leading ands from where fragments; the grammar will
		// handle adding them
		if ( whereFragment.startsWith( "and" ) ) {
			whereFragment = whereFragment.substring( 4 );
		}

		if ( log.isDebugEnabled() ) log.debug( "Using WHERE fragment [" + whereFragment + "]" );

		SqlFragment fragment = ( SqlFragment ) ASTUtil.create( astFactory, SQL_TOKEN, whereFragment );
		fragment.setJoinFragment( joinFragment );
		fragment.setFromElement( fromElement );

		// Filter conditions need to be inserted before the HQL where condition and the
		// theta join node.  This is because org.hibernate.loader.Loader binds the filter parameters first,
		// then it binds all the HQL query parameters, see org.hibernate.loader.Loader.processFilterParameters().
		if ( fragment.getFromElement().isFilter() || fragment.hasFilterCondition() ) {
			if ( filters == null ) {
				// Find or create the WHERE clause
				AST where = query.getWhereClause();
				// Create a new FILTERS node as a parent of all filters
				filters = astFactory.create( FILTERS, "{filter conditions}" );
				// Put the FILTERS node before the HQL condition and theta joins
				ASTUtil.insertChild( where, filters );
			}
			
			// add the current fragment to the FILTERS node
			filters.addChild( fragment );
		}
		else {
			if ( thetaJoins == null ) {
				// Find or create the WHERE clause
				AST where = query.getWhereClause();
				// Create a new THETA_JOINS node as a parent of all filters
				thetaJoins = astFactory.create( THETA_JOINS, "{theta joins}" );
				// Put the THETA_JOINS node before the HQL condition, after the filters.
				if (filters==null) {
					ASTUtil.insertChild( where, thetaJoins );
				}
				else {
					ASTUtil.insertSibling( where, thetaJoins );
				}
			}
			
			// add the current fragment to the THETA_JOINS node
			thetaJoins.addChild(fragment);
		}

	}

	public void addDiscriminatorWhereFragment(RestrictableStatement statement, Queryable persister, Map enabledFilters, String alias) {
		String whereFragment = persister.filterFragment( alias, enabledFilters ).trim();
		if ( "".equals( whereFragment ) ) {
			return;
		}
		if ( whereFragment.startsWith( "and" ) ) {
			whereFragment = whereFragment.substring( 4 );
		}

		// Need to parse off the column qualifiers; this is assuming (which is true as of now)
		// that this is only used from update and delete HQL statement parsing
		whereFragment = StringHelper.replace( whereFragment, alias + ".", "" );

// Simply creating the SQL_TOKEN directly breaks the sql-gen phase; however,
// manually building the "eq fragment to subtree" will (in all likelihood) break
// if a discriminator is needed *and* a where attribute has been specified.
//
// The only real solution is to parse the resulting where Fragment using a
// "real" SQL grammar/parser into our SQL AST representation

//		AST discrimNode = astFactory.create( SQL_TOKEN, whereFragment );
		AST discrimNode = parseEqFragmentToSubtree( whereFragment );

		if ( statement.getWhereClause().getNumberOfChildren() == 0 ) {
			statement.getWhereClause().setFirstChild( discrimNode );
		}
		else {
			AST and = astFactory.create( AND, "{and}" );
			AST currentFirstChild = statement.getWhereClause().getFirstChild();
			and.setFirstChild( discrimNode );
			and.addChild( currentFirstChild );
			statement.getWhereClause().setFirstChild( and );
		}
	}

	private AST parseEqFragmentToSubtree(String whereFragment) {
		int chunkPos = whereFragment.lastIndexOf( "=" );
		String check = whereFragment.substring( 0, chunkPos ).trim();
		String test = whereFragment.substring( chunkPos + 1 ).trim();
		AST eq = astFactory.create( EQ, "{discriminator}" );
		eq.setFirstChild( astFactory.create( IDENT, check ) );
		eq.addChild( astFactory.create( SQL_TOKEN, test ) );
		return eq;
	}
}
