/*
 16. Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

*/
package Flow_Control_Statements;

public class Assignment16 {

	public static void main(String[] args) {
		int len=args.length;
		if(len==0) {
			System.out.print("Please enter an integer number");
		}
		else {
			int n=Integer.parseInt(args[0]);
			for(int i=0;i<n;i++) {
				int j=0;
				while(j<=i) {
					System.out.print("*  ");
					j++;
				}
				System.out.print("\n");
			}
		}
	}
}
