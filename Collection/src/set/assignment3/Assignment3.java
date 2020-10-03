package set.assignment3;

import java.util.TreeSet;
import java.util.NavigableSet;
import java.util.Iterator;

public class Assignment3 {

	public static void main(String[] args) {
		TreeSet<String> treeset=new TreeSet<String>();
		
		treeset.add("Ajay");
		treeset.add("Abhi"); 
		treeset.add("Sanjai");
		treeset.add("Ghazali");
		treeset.add("Ajit");
		treeset.add("Sujeet");
		
		//a) Reverse the elements of the Collection
		NavigableSet<String> reverseTreeSet=treeset.descendingSet();
		
		//b) Iterate the elements of the TreeSet using iterator
		Iterator<String> itr=reverseTreeSet.iterator();
		while(itr.hasNext()) {
			String next=itr.next();
			System.out.println(next);
		}
		
		//c) Check if a particular element exists or not
		System.out.println("Kashif: "+treeset.contains("Kashif"));
		System.out.println("Ghazali: "+treeset.contains("Ghazali"));
	}

}
