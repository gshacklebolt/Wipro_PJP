package map.assignment2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment2 {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<String,String>();
		
		map.put("1", "One");
		map.put("2", "Two");
		map.put("3", "Three");
		map.put("4", "Four");
		
		//a) Check if a particular key exists or not.
		System.out.println(map.containsKey("3"));
		
		//b) Check if a particular value exists or not.
		System.out.println(map.containsValue("Four"));
		
		//c) Use iterator to loop through the map
		Set<Entry<String,String>> set=map.entrySet();
		Iterator<Entry<String,String>> itr=set.iterator();
		
		while(itr.hasNext()) {
			Entry<String,String> entry=itr.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
