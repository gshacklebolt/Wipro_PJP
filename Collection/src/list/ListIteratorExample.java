package list;

import java.util.*;
import java.io.*;
public class ListIteratorExample {

	public static void main(String[] args) throws IOException{
		ArrayList<String> value=new ArrayList<String>();
		
		value.add("Zara");
		value.add("Mahnaz");
		value.add("Ayan");
		
		value.add("Ava");
		value.add("Babu");
		value.add("Car");
		
		ArrayList<String> key=new ArrayList<String>();
		for(int i=1;i<=value.size();i++)
		{
			key.add("category"+i);
		}
		System.out.println("Keys:   "+key);
		System.out.println("Values: "+value);
		
		Map<ArrayList<String>,ArrayList<String>> map=Collections.singletonMap(key, value);
		
		System.out.println(map.values());
	}

}
