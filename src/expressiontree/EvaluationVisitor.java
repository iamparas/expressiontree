package expressiontree;

import java.util.Stack;


public class EvaluationVisitor implements Visitor {

	private Stack<Integer> stack = new Stack<Integer>();


	public EvaluationVisitor() {
	}


	public void visit1(NumberNode node) {
		stack.push(node.item());
	}
	public void visit1(NegateOperatorNode node) {
		if (stack.size() >= 1)
			stack.push(-stack.pop());

	public void visit1(AddOperatorNode node) {
		if (stack.size() >= 2)
			stack.push(stack.pop() + stack.pop());
	}


	public void visit1(SubtractOperatorNode node) {
		if (stack.size() >= 2) {
			int rhs = stack.pop();
			stack.push(stack.pop() - rhs);
		}
	}

	public void visit1(DivisonOperatorNode node) {
		if (stack.size() >= 2) {
			if (stack.peek() != 0) {
				int rhs = stack.pop();
				stack.push(stack.pop() / rhs);
			} else {
				Platform platform = Platform.instance();
				platform.errorLog("EvaluationVisitor", "\n\n**: Division by zero is not allowed. ");
				platform.errorLog("EvaluationVisitor", "Resetting evaluation visitor.\n\n");
				reset();
			}
		}
	}


	public void visit1(MultiplicationOperatorNode node) {
		if (stack.size() >= 2)
			stack.push(stack.pop() * stack.pop());
	}


	public int total() {
		if (!stack.isEmpty())
			return stack.peek();
		else
			return 0;
	}


	public void reset() {
		stack.clear();
	}

	@Override
	public void visit(NumberNode node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(NegateOperatorNode node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(AddOperatorNode node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(SubtractOperatorNode node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(DivisonOperatorNode node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(MultiplicationOperatorNode node) {
		// TODO Auto-generated method stub

	}
}
