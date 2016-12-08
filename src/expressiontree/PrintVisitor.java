package expressiontree;

public class PrintVisitor implements Visitor {
    /** Ctor */
    public PrintVisitor() {    
    }

    /** Visits a @a LeafNode and prints it contents. */
    public void visit(NumberNode node) {
        Platform.instance().addString(node.item() + " ");
    }

    /** Visit a @a NegateNode and prints its contents. */
    public void visit(NegateOperatorNode node) {
        Platform.instance().addString("-");
    }

    /** Visit a @a AddNode and prints its contents. */
    public void visit(AddOperatorNode node) {
        Platform.instance().addString("+ ");
    }

    /** Visit a @a SubtractNode and prints its contents. */
    public void visit(SubtractOperatorNode node) {
        Platform.instance().addString("- ");
    }

    /** Visit a @a DivideNode and prints its contents. */
    public void visit(DivisonOperatorNode node) {
        Platform.instance().addString("/ ");
    }

    /** Visit a @a MultiplyNode and print its contents. */
    public void visit(MultiplicationOperatorNode node) {
        Platform.instance().addString("* ");
    }
}