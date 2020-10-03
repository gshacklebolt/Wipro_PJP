//15. Write a program to print the sum of all the digits of a given number.
package Flow_Control_Statements;

public class Assignment15 {

	public static void main(String[] args) {
		int num=876432;
		int sum=0;
		for(int i=num;i>0;i=i/10) {
			sum=sum+(i%10);
		}
		System.out.print(sum);
	}
}
