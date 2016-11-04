package expressiontree;

public class SubtractOperatorNode extends BinaryNode{
	public SubtractOperatorNode(Component left, Component right){
		super(left, right);
	}
	
	public SubtractOperatorNode(Component right){
		super(null, right);
	}
	public int item(){
		return '-';
	}
}
