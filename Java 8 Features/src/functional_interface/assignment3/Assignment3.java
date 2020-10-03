package functional_interface.assignment3;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment3 {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Madam");
		arr.add("Leopard");
		arr.add("Anvil");
		arr.add("Otto");
		arr.add("Racecar");
		arr.add("Digits");
		arr.add("Malayalam");
		arr.add("Equator");
		arr.add("Aeroplane");
		arr.add("Redivider");
		
		Predicate<String> predicate=(str)->{
			return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
		};
		
		arr.stream().filter(predicate).forEach(System.out::println);
	}

}
