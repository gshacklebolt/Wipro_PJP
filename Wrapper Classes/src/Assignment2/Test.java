package Assignment2;

public class Test {

	public static void main(String[] args) {
		int input=Integer.parseInt(args[0]);
		System.out.println("Given number :"+input);
		System.out.println("Binary equivalent :"+Integer.toBinaryString(input));
		System.out.println("Octal equivalent :"+Integer.toOctalString(input));
		System.out.println("Hexadecimal equivalent :"+Integer.toHexString(input));
	}

}
