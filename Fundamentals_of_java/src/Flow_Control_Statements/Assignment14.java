//14.  Write a Java program to find if the given number is prime or not.
package Flow_Control_Statements;

public class Assignment14 {

	public static void main(String[] args) {
		int len=args.length;
		if(len==0)
		{
			System.out.print("Please enter an integer number ");
		}
		else 
		{
			int num=Integer.parseInt(args[0]); //Number to be checked
			int flag=0;
			
			if(num==1 || num==0) 
			{
				System.out.print(num+" is neither prime nor composite");
			}
			else 
			{
				for(int i=2;i<=num/2;i++) 
				{
					if(num%i==0) {
						flag=1;
						break;
					}
				}
				
				if(flag==0)
					System.out.print(num+" is a prime number");
				else
					System.out.print(num+" is not a prime number");
			}
		}	
	}

}
