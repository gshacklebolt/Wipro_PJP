package set;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
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
