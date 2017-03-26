package org.hibernate.param;

/**
 * @author <a href="mailto:steve@hibernate.org">Steve Ebersole </a>
 */
public abstract class AbstractExplicitParameterSpecification implements ExplicitParameterSpecification {

	private final int sourceLine;
	private final int sourceColumn;

	protected AbstractExplicitParameterSpecification(int sourceLine, int sourceColumn) {
		this.sourceLine = sourceLine;
		this.sourceColumn = sourceColumn;
	}

	public int getSourceLine() {
		return sourceLine;
	}

	public int getSourceColumn() {
		return sourceColumn;
	}
}
