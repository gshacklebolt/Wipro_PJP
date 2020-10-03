/*
8. Write a program to receive a color code from the user (an Alphabhet). 

The program should then print the color name, based on the color code given. 

The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 

If color code provided by the user is not valid then print "Invalid Code". 
*/
package Flow_Control_Statements;

public class Assignment8 {

	public static void main(String[] args) {
		char colorCode;
		colorCode=args[0].charAt(0);
		
		switch(colorCode) {
			case 'R': 
				System.out.print("Red");
				break;
				
			case 'B': 
				System.out.print("Blue");
				break;
				
			case 'G': 
				System.out.print("Green");
				break;
				
			case 'O': 
				System.out.print("Orange");
				break;
				
			case 'Y': 
				System.out.print("Yellow");
				break;
				
			case 'W': 
				System.out.print("White");
				break;
				
			default:
				System.out.print("Invalid Code");
		}
	}
}
