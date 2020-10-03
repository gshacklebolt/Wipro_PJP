package list.assignment4;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment4 {

	public static void main(String[] args) {
		
		//Numbers is a user-defined class
		ArrayList<Numbers> arrList=new ArrayList<Numbers>();
		
		try {
			arrList.add(new Numbers(1));
			arrList.add(new Numbers(1.2f));
			arrList.add(new Numbers(2.5D));
			
			arrList.add(new Numbers('a'));
			arrList.add(new Numbers("Hello"));
			
		}catch(ClassCastException e) {
			System.out.println("Exception occured: Invalid data type - "+e.getMessage());
		}
		
		Iterator<Numbers> it=arrList.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
