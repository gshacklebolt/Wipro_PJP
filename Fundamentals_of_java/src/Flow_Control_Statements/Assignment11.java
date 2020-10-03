//11. Write a program to print even numbers between 23 and 57. Each number should be printed in a separate row.
package Flow_Control_Statements;

public class Assignment11 {

	public static void main(String[] args) {
		int i;
		for(i=23;i<=57;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
