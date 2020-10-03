//1. Write a program to initialize an integer array and print the sum and average of the array.
package Arrays;

public class Assignment1 {

	public static void main(String[] args) {
		int sum=0;
		float avg=0;
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avg=(float)sum/arr.length;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
		System.out.println("Hi");
	}
}
