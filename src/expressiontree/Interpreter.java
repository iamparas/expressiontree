package expressiontree;

import java.util.Stack;

public class Interpreter {
	abstract class Symbol{
		protected int precedence = 0;
		protected Symbol left;
		public Symbol(Symbol left){
			this.left = left;
		}
	}
	ExpressionTree interpret(String inputExpression){
		Stack<Symbol> parseTree = buildParseTree(inputExpression);
		
		if(!parseTree.isEmpty()){
			optimizeParseTree(parseTree);
			return buildExpressionTree(parseTree);
		}
	}
	
	Stack<Symbol> buildParseTree(String inputExpression){
		
	}
	
	void optimizeParseTree(Stack<Symbol> parseTree){
		
	}
	
	ExpressionTree buildExpressionTree(Stack<Symbol> parseTree){
		
	}
	
	
}
