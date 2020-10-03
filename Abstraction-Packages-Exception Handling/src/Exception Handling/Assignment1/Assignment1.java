package Assignment1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		int input;
		String inputString;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		inputString=sc.nextLine();
		
		try {
			input=Integer.parseInt(inputString);
			System.out.println("The square value is "+(input*input));
			System.out.println("The work has been done successfully");
		}
		catch(NumberFormatException ex) {
			System.out.println("Entered input is not a valid format for an integer.");
		}
		finally {
			sc.close();
		}
	}

}
