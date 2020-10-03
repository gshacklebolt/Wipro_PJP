package map;

import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Enumeration;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String,Double> balance=new Hashtable<String,Double>();

		balance.put("John Doe", new Double(3434.34));
		balance.put("Tom Smith", new Double(123.22));
		balance.put("Jane Baker", new Double(1378.00));
		balance.put("Tod Hall", new Double(99.22));
		balance.put("Ralph Smith", new Double(-19.08));
		
		Enumeration names;
		String str;
		
		names=balance.keys();
		while(names.hasMoreElements()) {
			str=(String)names.nextElement();
			System.out.println(str+" : "+balance.get(str));
		}
	}

}
