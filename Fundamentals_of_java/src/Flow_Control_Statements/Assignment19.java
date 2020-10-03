//19. Write a program to print first 5 values which are divisible by 2, 3, and 5
package Flow_Control_Statements;

public class Assignment19 {

	public static void main(String[] args) {
		int i=0;
		int num=1;
		
		while(i<5) {
			if((num%2==0) && (num%3==0) && (num%5==0)) {
				System.out.println(num);
				i++;
			}
			num++;
		}
	}
}
