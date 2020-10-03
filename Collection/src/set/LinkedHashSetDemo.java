package set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		
		System.out.println("Contents of treeset: ");
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			Object o1=it.next();
			System.out.print(o1+"\t");
		}
	}

}
