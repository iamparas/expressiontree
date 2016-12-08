package expressiontree;

public class NegateOperatorNode extends UnaryNode {
	    /** Ctor */
	    public NegateOperatorNode(Component right) {
	        super(right);
	    }

	    /** Return the printable character stored in the node. */
	    public int item() {
	        return '-';
	    }

	    /** 
	     * Define the @a accept() operation used for the Visitor pattern
	     * to accept the @a visitor.
	     */
	    public void accept(Visitor visitor) {
	        visitor.visit(this);
	    }
	}

