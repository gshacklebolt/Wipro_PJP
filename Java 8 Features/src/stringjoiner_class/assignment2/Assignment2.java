package stringjoiner_class.assignment2;

import java.util.StringJoiner;

public class Assignment2 {

	public static void main(String[] args) {
		StringJoiner s1=new StringJoiner("-");
		s1.add("Delhi");s1.add("Mumbai");s1.add("Kolkata");s1.add("Chennai");
		
		StringJoiner s2=new StringJoiner("-");
		s2.add("Bengaluru");s2.add("Hyderabad");s2.add("Mangalore");s2.add("Mysuru");
		
		s1.merge(s2);
		System.out.println("s1: "+s1);
		
		s2.merge(s1);
		System.out.println("s2: "+s2);
	}

}
