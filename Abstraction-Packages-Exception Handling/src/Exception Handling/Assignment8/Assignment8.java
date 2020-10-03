package Assignment8;

public class Assignment8 {

	public static void main(String[] args) {
		String name;
		int age;
		
		try {
			name=args[0];
			age=Integer.parseInt(args[1]);
			
			if(age>=18 && age<60)
				System.out.println("Name: "+name+", Age: "+age);
			else
				throw new InvalidAgeException(age);
		}
		catch(InvalidAgeException ex) {
			System.out.println(ex.toString());
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
