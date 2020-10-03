package intro;

import java.util.*;
import java.io.*;

public class HashSetDemo {

	public static void main(String[] args) throws IOException {
		TreeSet<String> arr=new TreeSet<String>();
		arr.add("One");
		arr.add("Two");
		arr.add("Three");
		arr.add("Four");
		arr.add("Two");
		arr.add("Five");
		
		
		Iterator<String> it=arr.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
