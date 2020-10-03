//13. Write a program to print prime numbers between 10 and 99.
package Flow_Control_Statements;

public class Assignment13 {

	public static void main(String[] args) {
		int num,flag;
		
		for(num=10;num<100;num++) {
			flag=0;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					flag=1;
					break;
				}
			}
			
			if(flag==0)
				System.out.println(num);
		}
	}

}
