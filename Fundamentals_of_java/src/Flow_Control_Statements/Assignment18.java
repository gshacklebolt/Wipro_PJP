//18. Write a Java program to find if the given number is palindrome or not
package Flow_Control_Statements;

public class Assignment18 {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]); //Number to be reversed
		int reverseOfNum=0; //initially set reverseOfNum to 0
		int numCopy=num; //Create a copy of num
		
		//Find reverse of given number
		while(numCopy>0) {
			reverseOfNum=(reverseOfNum*10)+(numCopy%10);
			numCopy=numCopy/10;
		}
		
		
		//Compare both the original number and it's reverse
		if(num==reverseOfNum) {
			System.out.print(num+" is a palindrome");
		}
		else
		{
			System.out.print(num+" is not a palindrome");
		}
	}

}
