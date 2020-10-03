//Write a Program to accept two integers as command line arguments and print the sum of the two numbers
package Language_Basics;

public class Assignment3 {

	public static void main(String[] args) {
		int num1;
		int num2;
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		System.out.println("The sum of "+num1+" and "+num2+" is "+(num1+num2));
	}

}
