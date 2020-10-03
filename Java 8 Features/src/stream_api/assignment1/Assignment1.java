package stream_api.assignment1;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(254);
		list.add(12);
		list.add(-78);
		list.add(-191);
		list.add(0);
		list.add(987);
		list.add(-4);
		list.add(-590);
		list.add(-13);

		// 1. Filter the negative even numbers from an ArrayList
		Stream<Integer> streamObj = list.stream().filter(x -> (x < 0) && (x % 2 == 0));

		// 2. Store them into a new ArrayList
		ArrayList<Integer> newList = (ArrayList<Integer>) streamObj.collect(Collectors.toList());

		// 3. Print the ArrayList elements
		newList.forEach(System.out::println);
	}

}
