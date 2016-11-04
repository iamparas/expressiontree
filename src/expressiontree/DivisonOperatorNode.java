package expressiontree;

public class DivisonOperatorNode extends BinaryNode{
	
	public DivisonOperatorNode(Component left, Component right){
		super(left, right);
	}
	
	public int item(){
		return '/';
	}
	
	public static void main(String[] args){
		Component plus = new AddOperatorNode(new NumberNode(3), new NumberNode(4));
		Component minus = new SubtractOperatorNode(new NumberNode(5));;
		Component mult = new MultiplicationOperatorNode(minus, plus);
	}

}
