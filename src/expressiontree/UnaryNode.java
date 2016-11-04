package expressiontree;

public class UnaryNode extends Component{
	Component right;
	
	public UnaryNode(Component right){
		this.right = right;
	}
	
	public Component right(){
		return right;
	}


}
