package expressiontree;

public class MultiplicationOperatorNode extends BinaryNode{
	
	public MultiplicationOperatorNode(Component left, Component right){
		super(left, right);
	}
	
	public int item(){
		return '*';
	}

}
