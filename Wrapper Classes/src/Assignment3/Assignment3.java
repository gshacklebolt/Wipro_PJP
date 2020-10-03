package Assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		int num;
		String binary;
		Scanner sc=new Scanner(System.in);
		
		try {
			num=sc.nextInt();
			
			binary=String.format("%8s", Integer.toBinaryString(num));
			binary=binary.replace(" ", "0");
			
			System.out.println(binary);
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}

}
