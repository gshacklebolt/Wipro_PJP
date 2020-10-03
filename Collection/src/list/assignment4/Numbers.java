package list.assignment4;

public class Numbers{
	Object i;
	
	
	public Numbers(Object i) {
		if(i instanceof Integer || i instanceof Float || i instanceof Double) {
			this.i=i;
		}
		else {
			throw new ClassCastException(i.getClass().toString());
		}
	}
	
	public String toString() {
		return i.toString();
	}
}
