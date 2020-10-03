package parallel_array_sorting.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input,output;
		char[] charString;
		
		//a. Take any string as a input from the user. And convert this into character array
		input=sc.next();
		charString=input.toCharArray();
		
		//b. Sort this array using parallelSort() method. After sorting convert this character array
		//   into a String and display this String as a result.
		Arrays.parallelSort(charString);
		output=String.valueOf(charString);
		System.out.println(output);
		
		sc.close();
	}

}
