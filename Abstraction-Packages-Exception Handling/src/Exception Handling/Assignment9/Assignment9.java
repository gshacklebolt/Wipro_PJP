package Assignment9;

import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=0;
		
		try {
			System.out.println("Enter the 2 numbers");
			a=Integer.parseInt(sc.nextLine());
			b=Integer.parseInt(sc.nextLine());
			int quotient=a/b;
			
			System.out.println("The quotient of "+a+"/"+b+" = "+quotient);
		}
		catch(ArithmeticException e) {	
			System.out.println("DivideByZeroException caught");
		}
		catch(NumberFormatException e) {
			System.out.println("Number Format Exception Occurred");
		}
		finally {
			System.out.println("Inside finally block");
			sc.close();
		}
	}

}
