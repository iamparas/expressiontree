package expressiontree;

import java.util.Iterator;
import java.util.Stack;

public class PreOrderIterator implements Iterator<ExpressionTree> {

	 private Stack <ExpressionTree> stack =
     new Stack<ExpressionTree>();
	
 /** Ctor */
	public PreOrderIterator(ExpressionTree tree) {
     if (!tree.isNull()) 
         stack.push(tree);
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ExpressionTree next() {
		// TODO Auto-generated method stub
		return null;
	}

}
