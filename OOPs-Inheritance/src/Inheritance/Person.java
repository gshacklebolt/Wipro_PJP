
public class Person {
	String name;
	
	Person(String name){
		this.name=name;
	}
	
	public void setPersonDetails(String name){
		this.name=name;
	}
	
	public void getPersonDetails() {
		System.out.println("Name: "+this.name);
	}
}
