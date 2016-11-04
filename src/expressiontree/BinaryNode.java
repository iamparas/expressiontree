package expressiontree;

public class BinaryNode extends UnaryNode{
	Component left;
	
	public BinaryNode(Component left, Component right){
		super(right);
		this.left = left;
	}
	
	public Component left(){
		return left;
	}
}
