package functional_interface.assignment6;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Assignment6 {

	public static void main(String[] args) {
		Consumer<ArrayList<String>> consumer1=(input)->{
			for(int i=0;i<input.size();i++) {
				input.set(i, new StringBuffer(input.get(i)).reverse().toString());
			}
		};
		
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
		
		consumer1.accept(arr);
		
		arr.forEach(System.out::println);
	}

}
