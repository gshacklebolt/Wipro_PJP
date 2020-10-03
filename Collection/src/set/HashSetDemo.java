package set;

import java.util.Iterator;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> ts=new HashSet<String>();
		ts.add("One");
		ts.add("Two");
		ts.add("Three");
		ts.add("Four");
		ts.add("Five");
		
		System.out.println("Contents of treeset: ");
		Iterator<String> it=ts.iterator();
		while(it.hasNext()) {
			Object o1=it.next();
			System.out.print(o1+"\t");
		}
	}

}
