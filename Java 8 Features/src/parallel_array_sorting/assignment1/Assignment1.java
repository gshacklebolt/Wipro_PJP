package parallel_array_sorting.assignment1;

import java.util.Arrays;

public class Assignment1 {

	public static void main(String[] args) {
		//a. Initialize an integer array with 10 elements
		int arr[]=new int [] {789846,54,1892,3546,4,1,6546,98,156,849};
		
		//b. Sort this array using parallelSort() method
		Arrays.parallelSort(arr);
		
		//c. And display the sum of min and max values of this array as result
		System.out.println("Sum of min and max: "+(arr[0]+arr[arr.length-1]));
	}

}
