package map.assignment3;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Assignment3 {

	public static void main(String[] args) {
		Properties prop=new Properties();
		
		prop.setProperty("Bihar", "Patna");
		prop.setProperty("Karnataka", "Bengaluru");
		prop.setProperty("Maharashtra", "Mumbai");
		prop.setProperty("Madhya Pradesh", "Bhopal");
		
		Set<Entry<Object,Object>> set=prop.entrySet();
		Iterator<Entry<Object,Object>> itr=set.iterator();
		
		while(itr.hasNext()) {
			Entry<Object,Object> entry=itr.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
