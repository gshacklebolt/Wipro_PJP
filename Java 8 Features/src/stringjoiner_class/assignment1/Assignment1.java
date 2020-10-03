package stringjoiner_class.assignment1;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Assignment1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ghazali");
		list.add("Ayush");
		list.add("Nasrul");
		list.add("Aditya");
		list.add("Sandeep");
		
		StringJoiner names=new StringJoiner(",","{","}");
		
		list.forEach(x->names.add(x));
		
		System.out.println(names);
	}

}
