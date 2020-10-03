//Write a Program that accepts two Strings as command line arguments and generate the output in the required format. 
package Language_Basics;

public class Assignment1 {

	public static void main(String[] args) {
		if(args[0].equals("Wipro") && args[1].equals("Bangalore"))
			System.out.println("Wipro Technologies Bangalore");
		else if(args[0].equals("ABC") && args[1].equals("Mumbai"))
			System.out.println("ABC Technologies Mumbai");
	}

}
