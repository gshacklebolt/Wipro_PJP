package functional_interface.assignment7;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Assignment7 {

	public static void main(String[] args) {
		Consumer<Integer> consumer=input->{
			if(input%2==0) {
				System.out.println(input+" even");
			}else {
				System.out.println(input+" odd");
			}
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
		
		arr.forEach(n->consumer.accept(n));
	}

}
