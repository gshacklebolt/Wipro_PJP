package map;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Double> hm=new HashMap<String,Double>();
		
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Tod Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));
		
		Set<Entry<String,Double>> set=hm.entrySet();
		Iterator<Entry<String,Double>> itr=set.iterator();
		
		while(itr.hasNext()) {
			Entry<String,Double> me=itr.next();
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		
		Double balance=((Double)hm.get("John Doe")).doubleValue();
		hm.put("John Doe", new Double(balance+1000));
		
		System.out.println("John Doe's new balance: "+hm.get("John Doe"));
	}

}
