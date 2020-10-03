package map;

import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		
		tm.put("Suresh", new Double(15357.75));
		tm.put("Meenu", new Float(18345.50));
		tm.put("Viren", new Integer(2000));
		tm.put("Avinash", new Double(19900.25));
		tm.put("Priya", new Integer(12000));
		tm.put("Zakir", new Float(16500.90));
		tm.put("Nirav", new Double(22000));
		tm.put("Jayesh", new Integer(15000));
		tm.put("Poorva", "Zero");
		
		Set salary=tm.entrySet();
		Iterator itr=salary.iterator();
		
		while(itr.hasNext()) {
			Entry e=(Entry)itr.next();
			System.out.println(e.getKey()+" : is "+e.getValue());
		}
		
	}

}
