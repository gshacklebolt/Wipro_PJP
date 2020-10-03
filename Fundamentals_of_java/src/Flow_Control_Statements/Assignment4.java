//4. Initialize two character variables in a program and display the characters in alphabetical order.
package Flow_Control_Statements;

public class Assignment4 {

	public static void main(String[] args) {
		char first='a';
		char second='e';

		if(first<second) {
			System.out.println(first+","+second);
		}else{
			System.out.println(second+","+first);
		}
	}

}
