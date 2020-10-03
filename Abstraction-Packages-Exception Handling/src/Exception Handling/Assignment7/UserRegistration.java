package Assignment7;

public class UserRegistration {
	
	void registerUser(String username,String userCountry) throws InvalidCountryException {
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}
		else {
			throw new InvalidCountryException("User Outside India  cannot be registered");
		}
	}
	
	public static void main(String[] args) {
		UserRegistration user=new UserRegistration();
		
		try {
			user.registerUser("Mickey","US");
			
			//user.registerUser("Mini", "India");
			
		}catch(InvalidCountryException ex) {
			System.out.println(ex.toString());
		}
	}

}
