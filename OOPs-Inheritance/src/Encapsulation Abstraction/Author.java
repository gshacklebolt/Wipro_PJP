
public class Author {
	private String name;
	private String email;
	private char gender;
	
	//Parameterized Constructor
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	
	//Getters and Setters for all the member variables
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public char getGender() {
		return gender;
	}
}
