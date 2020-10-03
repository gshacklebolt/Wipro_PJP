package Assignment8;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception {
	private int age;
	public InvalidAgeException(int age) {
		super();		
		this.age=age;
	}
	
	public String toString() {
		String retVal=super.toString();
		if(age<18)
			retVal+=": Age less than 18";
		else if(age>60)
			retVal+=": Age more than 60";
		
		return retVal;
	}
	
}
