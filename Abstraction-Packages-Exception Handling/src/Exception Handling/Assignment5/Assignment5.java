package Assignment5;

public class Assignment5 {
	public int divide(int num1,int num2) throws ArithmeticException{
		int quotient;
		quotient=num1/num2;
		
		return quotient;
	}
	
	public static void main(String[] args) {
		Assignment5 obj=new Assignment5();
		int a=10;
		int b=0;
		int res;
		
		try {
			res=obj.divide(a,b);
			System.out.println(a+"/"+b+" = "+res);
		}
		catch(ArithmeticException e) {
			System.out.print("Division by 0 not allowed");
		}
	}

}
