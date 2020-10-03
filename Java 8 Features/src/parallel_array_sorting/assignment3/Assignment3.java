package parallel_array_sorting.assignment3;

import java.util.Arrays;

public class Assignment3 {

	public static void main(String[] args) {
		
		//Initialize an integer array with 10 elements.
		int arr[]=new int [] {789846,54,1892,3546,4,1,6546,98,156,849};		
		
		/*
		Sort only the first 5 elements in this array using parallelSort() method and
		display  the sorted array.
		*/
		
		Arrays.parallelSort(arr, 0, 5);
		Arrays.stream(arr).forEach(System.out::println);
	}

}
