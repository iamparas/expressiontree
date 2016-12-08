package expressiontree;

public abstract class Component {
	String val;
	public int item(){
		throw new UnsupportedOperationException();
	}
	public Component right(){
		return null;
	}
	
	public Component left(){
		return null;
	}
	
	void accept(Visitor visitor){
		throw new UnsupportedOperationException();         
	}
}
