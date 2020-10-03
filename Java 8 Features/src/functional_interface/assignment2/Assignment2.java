package functional_interface.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Assignment2 {

	public static void main(String[] args) {
		Integer []nums={45,357,33,75,24,97,434,3532,574,32};
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(nums));
		
		
		//Function to calculate the sum of all the elements in the ArrayList
		Function<ArrayList<Integer>,Integer> function=input->{
			
			int sum=0;
			for(int i:input) {
				sum+=i;
			}
			return sum;
		}; //Alternatively we can do: input.stream().reduce(0,Integer::sum);
		
		System.out.println(function.apply(arr));
		
	}
}
