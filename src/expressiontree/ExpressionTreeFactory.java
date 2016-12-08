package expressiontree;

public class ExpressionTreeFactory {
    /** 
     * Create a new @a ExpressionTree object that encapsulates the @a
     * componentNodeRoot that's passed as a parameter.
     */
    public ExpressionTree makeExpressionTree(Component componentNodeRoot) {
        return new ExpressionTree(componentNodeRoot);
    }
}
	