package set.assignment2;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment2 {

	public static void main(String[] args) {
		HashSet<String> employee=new HashSet<String>();
		employee.add("Ajay");
		employee.add("Abhi");
		employee.add("Sanjai");
		
		for(Iterator<String> itr=employee.iterator();itr.hasNext();) {
			System.out.println(itr.next());
		}
		
	}

}
