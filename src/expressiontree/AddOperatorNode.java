package expressiontree;

public class AddOperatorNode extends BinaryNode{
	
	public AddOperatorNode(Component left, Component right){
		super(left, right);
	}
	
	public int item(){
		return '+';
	}
}
