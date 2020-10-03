/* 
7. Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.
*/
package Flow_Control_Statements;

public class Assignment7 {

	public static void main(String[] args) {
		char var='A';
		String newVar=String.valueOf(var); //Convert char to string
		if(var>=65 && var<=90) {
			System.out.print(newVar.toLowerCase());
		}else if(var>=97 && var<=122) {
			System.out.print(newVar.toUpperCase());
		}
	}

}
