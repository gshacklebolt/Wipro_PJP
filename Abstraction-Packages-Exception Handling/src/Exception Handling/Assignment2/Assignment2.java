package Assignment2;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sizeOfArray;
		int[] arr;
		int key;
		
		System.out.println("Enter the number of elements in the array");
		sizeOfArray=sc.nextInt();
		arr=new int[sizeOfArray];
		
		System.out.println("Enter the elements in the array");
		for(int i=0;i<sizeOfArray;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the index of the array element you want to access");
		key=sc.nextInt();
		
		try {
			System.out.println("The array element at index "+key+" = "+arr[key]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getClass().getCanonicalName());
		}
		finally {
			sc.close();
		}
		
	}

}
