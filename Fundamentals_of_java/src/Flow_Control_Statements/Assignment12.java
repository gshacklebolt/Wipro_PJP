//12. Write a program to check if a given number is prime or not.
package Flow_Control_Statements;

public class Assignment12 {

	public static void main(String[] args) {
		int num=12; //Number to be checked
		int flag=0;

		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.print("Given number is a prime number.");
		else
			System.out.print("Given number is not a prime number.");
	}
}
