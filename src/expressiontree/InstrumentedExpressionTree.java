package expressiontree;

import java.util.Iterator;

public class InstrumentedExpressionTree extends ExpressionTree {
    /** A factory class capable of creating iterators dynamically. */
    IteratorFactory treeIteratorFactory
        = new IteratorFactory();

    /**
     * Ctor that takes a @a Node * that contains all the nodes in the
     * expression tree.
     */
    public InstrumentedExpressionTree(Component root) {
        super(root);
    }

    /** Returns whether a the tree is null. */
    public boolean isNull() {
        System.out.println("starting isNull() call");
        boolean temp = super.isNull();
        System.out.println("finished isNull() call");
        return temp;
    }

    /** Returns root. */
    public Component getRoot() {
        System.out.println("starting getRoot() call");
        Component temp = root;
        System.out.println("finished getRoot() call");
        return temp;
    }

    /** Returns the root item. */
    public int item() throws Exception {
        System.out.println("starting left() call");
        int temp = super.item();
        System.out.println("finished left() call");
        return temp;
    }

    /** Returns the tree's left node. */
    public ExpressionTree left() {
        System.out.println("starting left() call");
        ExpressionTree temp = super.left();
        System.out.println("finished right() call");
        return temp;
    }

    /** Returns the tree's right node. */
    public ExpressionTree right() {
        System.out.println("starting right() call");
        ExpressionTree temp = super.right();
        System.out.println("finished right() call");
        return temp;
    }

    /** Accepts a @a visitor. */
    public void accept(Visitor visitor) {
        System.out.println("starting accept() call");
        super.accept(visitor);
        System.out.println("finished accept() call");
    }

    /** 
     * Returns the designated iterator after requesting it from
     * factory method. 
     */
    public Iterator<ExpressionTree> makeIterator(String traversalOrder) {
        System.out.println("starting makeIterator() call");
        Iterator<ExpressionTree> temp =
            treeIteratorFactory.makeIterator(this,
                                             traversalOrder);
        System.out.println("finished makeIterator() call");
        return temp;
    }
}