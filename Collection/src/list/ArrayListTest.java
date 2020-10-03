package list;

import java.util.*;

public class ArrayListTest {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		List<String> test=new ArrayList<String>();
		String s="hi";
		
		test.add("string");
		test.add(s);
		test.add(s+s);
		
		System.out.println(test.size());
		System.out.println(test.contains(42));
		System.out.println(test.contains("hihi"));
		System.out.println(test.remove("hi"));
		System.out.println(test.size());
	}
}
