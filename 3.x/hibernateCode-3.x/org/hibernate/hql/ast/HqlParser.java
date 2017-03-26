// $Id: HqlParser.java,v 1.31 2005/09/23 16:51:56 pgmjsd Exp $
package org.hibernate.hql.ast;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringReader;

import antlr.ASTPair;
import antlr.MismatchedTokenException;
import antlr.RecognitionException;
import antlr.Token;
import antlr.TokenStream;
import antlr.TokenStreamException;
import antlr.collections.AST;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.hql.antlr.HqlBaseParser;
import org.hibernate.hql.antlr.HqlTokenTypes;
import org.hibernate.hql.ast.util.ASTPrinter;
import org.hibernate.hql.ast.util.ASTUtil;
import org.hibernate.QueryException;

/**
 * Implements the semantic action methods defined in the HQL base parser to keep the grammar
 * source file a little cleaner.  Extends the parser class generated by ANTLR.
 *
 * @author Joshua Davis (pgmjsd@sourceforge.net)
 */
public final class HqlParser extends HqlBaseParser {
	/**
	 * A logger for this class.
	 */
	private static final Log log = LogFactory.getLog( HqlParser.class );

	private ParseErrorHandler parseErrorHandler;
	private ASTPrinter printer = getASTPrinter();

	private static ASTPrinter getASTPrinter() {
		return new ASTPrinter( org.hibernate.hql.antlr.HqlTokenTypes.class );
	}

	public static HqlParser getInstance(String hql) {
        // [jsd] The fix for HHH-558...
        HqlLexer lexer = new HqlLexer( new StringReader( hql ) );
		return new HqlParser( lexer );
	}

	private HqlParser(TokenStream lexer) {
		super( lexer );
		initialize();
	}

	public void reportError(RecognitionException e) {
		parseErrorHandler.reportError( e ); // Use the delegate.
	}

	public void reportError(String s) {
		parseErrorHandler.reportError( s ); // Use the delegate.
	}

	public void reportWarning(String s) {
		parseErrorHandler.reportWarning( s );
	}

	public ParseErrorHandler getParseErrorHandler() {
		return parseErrorHandler;
	}

	/**
	 * Overrides the base behavior to retry keywords as identifiers.
	 *
	 * @param token The token.
	 * @param ex    The recognition exception.
	 * @return AST - The new AST.
	 * @throws antlr.RecognitionException if the substitution was not possible.
	 * @throws antlr.TokenStreamException if the substitution was not possible.
	 */
	public AST handleIdentifierError(Token token, RecognitionException ex) throws RecognitionException, TokenStreamException {
		// If the token can tell us if it could be an identifier...
		if ( token instanceof HqlToken ) {
			HqlToken hqlToken = ( HqlToken ) token;
			// ... and the token could be an identifer and the error is
			// a mismatched token error ...
			if ( hqlToken.isPossibleID() && ( ex instanceof MismatchedTokenException ) ) {
				MismatchedTokenException mte = ( MismatchedTokenException ) ex;
				// ... and the expected token type was an identifier, then:
				if ( mte.expecting == HqlTokenTypes.IDENT ) {
					// Use the token as an identifier.
					reportWarning( "Keyword  '"
							+ token.getText()
							+ "' is being interpreted as an identifier due to: " + mte.getMessage() );
					// Add the token to the AST.
					ASTPair currentAST = new ASTPair();
					token.setType( HqlTokenTypes.WEIRD_IDENT );
					astFactory.addASTChild( currentAST, astFactory.create( token ) );
					consume();
					AST identifierAST = currentAST.root;
					return identifierAST;
				}
			} // if
		} // if
		// Otherwise, handle the error normally.
		return super.handleIdentifierError( token, ex );
	}

	/**
	 * Returns an equivalent tree for (NOT (a relop b) ), for example:<pre>
	 * (NOT (GT a b) ) => (LE a b)
	 * </pre>
	 *
	 * @param x The sub tree to transform, the parent is assumed to be NOT.
	 * @return AST - The equivalent sub-tree.
	 */
	public AST negateNode(AST x) {
//		if ( log.isDebugEnabled() )
//			log.debug( printer.showAsString( x, "negateNode()") );
		switch ( x.getType() ) {
			case OR:
				x.setType(AND);
				x.setText("{and}");
				negateNode( x.getFirstChild() );
				negateNode( x.getFirstChild().getNextSibling() );
				return x;
			case AND:
				x.setType(OR);
				x.setText("{or}");
				negateNode( x.getFirstChild() );
				negateNode( x.getFirstChild().getNextSibling() );
				return x;
			case EQ:
				x.setType( NE );
				x.setText( "{not}" + x.getText() );
				return x;	// (NOT (EQ a b) ) => (NE a b)
			case NE:
				x.setType( EQ );
				x.setText( "{not}" + x.getText() );
				return x;	// (NOT (NE a b) ) => (EQ a b)
			case GT:
				x.setType( LE );
				x.setText( "{not}" + x.getText() );
				return x;	// (NOT (GT a b) ) => (LE a b)
			case LT:
				x.setType( GE );
				x.setText( "{not}" + x.getText() );
				return x;	// (NOT (LT a b) ) => (GE a b)
			case GE:
				x.setType( LT );
				x.setText( "{not}" + x.getText() );
				return x;	// (NOT (GE a b) ) => (LT a b)
			case LE:
				x.setType( GT );
				x.setText( "{not}" + x.getText() );
				return x;	// (NOT (LE a b) ) => (GT a b)
			case LIKE:
				x.setType( NOT_LIKE );
				x.setText( "{not}" + x.getText() );
				return x;	// (NOT (LIKE a b) ) => (NOT_LIKE a b)
			case NOT_LIKE:
				x.setType( LIKE );
				x.setText( "{not}" + x.getText() );
				return x;	// (NOT (NOT_LIKE a b) ) => (LIKE a b)
			case IS_NULL:
				x.setType( IS_NOT_NULL );
				x.setText( "{not}" + x.getText() );
				return x;	// (NOT (IS_NULL a b) ) => (IS_NOT_NULL a b)
			case IS_NOT_NULL:
				x.setType( IS_NULL );
				x.setText( "{not}" + x.getText() );
				return x;	// (NOT (IS_NOT_NULL a b) ) => (IS_NULL a b)
			case BETWEEN:
				x.setType( NOT_BETWEEN );
				x.setText( "{not}" + x.getText() );
				return x;	// (NOT (BETWEEN a b) ) => (NOT_BETWEEN a b)
			case NOT_BETWEEN:
				x.setType( BETWEEN );
				x.setText( "{not}" + x.getText() );
				return x;	// (NOT (NOT_BETWEEN a b) ) => (BETWEEN a b)
/* This can never happen because this rule will always eliminate the child NOT.
			case NOT:
				return x.getFirstChild();			// (NOT (NOT x) ) => (x)
*/
			default:
				return super.negateNode( x );		// Just add a 'not' parent.
		}
	}

	/**
	 * Post process equality expressions, clean up the subtree.
	 *
	 * @param x The equality expression.
	 * @return AST - The clean sub-tree.
	 */
	public AST processEqualityExpression(AST x) {
		if ( x == null ) {
			log.warn( "processEqualityExpression() : No expression to process!" );
			return null;
		}

		int type = x.getType();
		if ( type == EQ || type == NE ) {
			boolean negated = type == NE;
			if ( x.getNumberOfChildren() == 2 ) {
				AST a = x.getFirstChild();
				AST b = a.getNextSibling();
				// (EQ NULL b) => (IS_NULL b)
				if ( a.getType() == NULL && b.getType() != NULL ) {
					return createIsNullParent( b, negated );
				}
				// (EQ a NULL) => (IS_NULL a)
				else if ( b.getType() == NULL && a.getType() != NULL ) {
					return createIsNullParent( a, negated );
				}
				else if ( b.getType() == EMPTY ) {
					return processIsEmpty( a, negated );
				}
				else {
					return x;
				}
			}
			else {
				return x;
			}
		}
		else {
			return x;
		}
	}

	private AST createIsNullParent(AST node, boolean negated) {
		node.setNextSibling( null );
		int type = negated ? IS_NOT_NULL : IS_NULL;
		String text = negated ? "is not null" : "is null";
		return ASTUtil.createParent( astFactory, type, text, node );
	}

	private AST processIsEmpty(AST node, boolean negated) {
		node.setNextSibling( null );
		// NOTE: Because we're using ASTUtil.createParent(), the tree must be created from the bottom up.
		// IS EMPTY x => (EXISTS (QUERY (SELECT_FROM (FROM x) ) ) )
		AST ast = createSubquery( node );
		ast = ASTUtil.createParent( astFactory, EXISTS, "exists", ast );
		// Add NOT if it's negated.
		if ( !negated ) {
			ast = ASTUtil.createParent( astFactory, NOT, "not", ast );
		}
		return ast;
	}

	private AST createSubquery(AST node) {
		AST ast = ASTUtil.createParent( astFactory, RANGE, "RANGE", node );
		ast = ASTUtil.createParent( astFactory, FROM, "from", ast );
		ast = ASTUtil.createParent( astFactory, SELECT_FROM, "SELECT_FROM", ast );
		ast = ASTUtil.createParent( astFactory, QUERY, "QUERY", ast );
		return ast;
	}

	public void showAst(AST ast, PrintStream out) {
		showAst( ast, new PrintWriter( out ) );
	}

	private void showAst(AST ast, PrintWriter pw) {
		printer.showAst( ast, pw );
	}

	private void initialize() {
		// Initialize the error handling delegate.
		parseErrorHandler = new ErrorCounter();
		setASTFactory(new HqlASTFactory());	// Create nodes that track line and column number.
	}

	public void weakKeywords() throws TokenStreamException {

		int t = LA( 1 );
		switch ( t ) {
			case ORDER:
			case GROUP:
                // Case 1: Multi token keywords GROUP BY and ORDER BY
				// The next token ( LT(2) ) should be 'by'... otherwise, this is just an ident.
				if ( LA( 2 ) != LITERAL_by ) {
					LT( 1 ).setType( IDENT );
					if ( log.isDebugEnabled() ) {
						log.debug( "weakKeywords() : new LT(1) token - " + LT( 1 ) );
					}
				}
				break;
			default:
                // Case 2: The current token is after FROM and before '.'.
                if (LA(0) == FROM && t != IDENT && LA(2) == DOT) {
                    HqlToken hqlToken = (HqlToken)LT(1);
                    if (hqlToken.isPossibleID()) {
                        hqlToken.setType(IDENT);
                        if ( log.isDebugEnabled() ) {
                            log.debug( "weakKeywords() : new LT(1) token - " + LT( 1 ) );
                        }
                    }
                }
				break;
		}
	}

    public void handleDotIdent() throws TokenStreamException {
        // This handles HHH-354, where there is a strange property name in a where clause.
        // If the lookahead contains a DOT then something that isn't an IDENT...
        if (LA(1) == DOT && LA(2) != IDENT) {
            // See if the second lookahed token can be an identifier.
            HqlToken t = (HqlToken)LT(2);
            if (t.isPossibleID())
            {
                // Set it!
                LT( 2 ).setType( IDENT );
                if ( log.isDebugEnabled() ) {
                    log.debug( "handleDotIdent() : new LT(2) token - " + LT( 1 ) );
                }
            }
        }
    }

	public void processMemberOf(Token n, AST p, ASTPair currentAST) {
		AST inAst = n == null ? astFactory.create( IN, "in" ) : astFactory.create( NOT_IN, "not in" );
		astFactory.makeASTRoot( currentAST, inAst );
		AST ast = createSubquery( p );
		ast = ASTUtil.createParent( astFactory, IN_LIST, "inList", ast );
		inAst.addChild( ast );
	}

	static public void panic() {
		//overriden to avoid System.exit
		throw new QueryException("Parser: panic");
	}
}
