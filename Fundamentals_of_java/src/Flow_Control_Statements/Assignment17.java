//17.  Write a program to reverse a given number and print
package Flow_Control_Statements;

public class Assignment17 {

	public static void main(String[] args) {
		int num=1004; //Number to be reversed
		int rev=0,temp;
		while(num>0) {
			temp=num%10;
			num=num/10;
			rev=(rev*10)+temp;
		}
		System.out.print(rev);
	}

}
