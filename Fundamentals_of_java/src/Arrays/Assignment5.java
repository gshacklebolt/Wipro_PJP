//5. Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
package Arrays;

import java.util.Arrays;
public class Assignment5 {

	public static void main(String[] args) {
		int[] arr=new int[] {27,34,12,87,45,2,6,1,99,20};
		int length=arr.length;
		
		//Sort the array so that the smallest numbers come at beginning of array and largest numbers go to the end of the array.
		Arrays.sort(arr);
		
		System.out.println("Largest 2 numbers: "+arr[length-1]+" "+arr[length-2]);
		System.out.println("Smallest 2 numbers: "+arr[0]+" "+arr[1]);
	}

}