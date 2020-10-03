package Assignment3;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sizeOfArray;
		int[] arr;
		int key;
		
		try {
			System.out.println("Enter the number of elements in the array");
			sizeOfArray=sc.nextInt();
			arr=new int[sizeOfArray];
			
			System.out.println("Enter the elements in the array");
			for(int i=0;i<sizeOfArray;i++) {
				arr[i]=Integer.parseInt(sc.next());
			}
			
			System.out.println("Enter the index of the array element you want to access");
			key=sc.nextInt();
			
			System.out.println("The array element at index "+key+" = "+arr[key]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException|NumberFormatException e) {
			System.out.println(e.getClass().getCanonicalName());
		}
		finally {
			sc.close();
		}
	}

}
