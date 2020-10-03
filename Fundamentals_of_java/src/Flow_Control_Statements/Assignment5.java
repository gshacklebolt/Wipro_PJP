/*
5. Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.
*/
package Flow_Control_Statements;

public class Assignment5 {

	public static void main(String[] args) {
		char var='$';
		
		if((var>=65 && var<=90) || (var>=97 && var<=122)) {
			System.out.print("Alphabhet");
		}
		else if(var>=48 && var<=57) {
			System.out.print("Digit");
		}
		else {
			System.out.print("Special Character");
		}
	}

}
