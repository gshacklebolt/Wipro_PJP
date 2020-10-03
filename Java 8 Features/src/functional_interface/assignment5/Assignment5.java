package functional_interface.assignment5;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment5 {

	public static void main(String[] args) {
		Predicate<Integer> predicate=input->{
			double root=Math.sqrt(input);
			return root==Math.floor(root);
		};
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(7);
		arr.add(9);
		arr.add(15);
		arr.add(16);
		
		arr.stream().filter(predicate).forEach(System.out::println);
	}

}
