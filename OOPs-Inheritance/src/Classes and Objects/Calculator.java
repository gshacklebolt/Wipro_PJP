
public class Calculator {
	
	public static double powerInt(int num1,int num2) {
		 return Math.pow(num1, num2);
	}
	
	public static double powerDouble(double num1,int num2) {
		return Math.pow(num1, num2);
	}

	public static void main(String[] args) {
		System.out.println("powerInt: "+powerInt(2,5));
		System.out.println("powerDouble: "+powerDouble(2,5));
	}

}
