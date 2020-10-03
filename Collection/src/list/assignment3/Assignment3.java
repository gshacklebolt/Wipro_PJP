package list.assignment3;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment3 {
	
	public static void printAll(ArrayList<String> list) {
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<String>();
		
		arrList.add("Looking for Alaska");
		arrList.add("An Abundance of Katherines");
		arrList.add("Paper Towns");
		arrList.add("Will Grayson, Will Grayson");
		arrList.add("The Fault in Our Stars");
		arrList.add("Turtles All the Way Down");
		
		printAll(arrList);
	}

}
