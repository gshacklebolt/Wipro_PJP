package map.assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ContactList {
	HashMap<String,Integer> map=new HashMap<String,Integer>();
	
	public void addContact(String name,Integer number) {
		map.put(name, number);
	}
	
	public void removeContact(String name) {
		map.remove(name);
	}
	
	public boolean checkContactExists(String key) {
		return map.containsKey(key);
	}
	
	public boolean checkNumberExists(Integer value) {
		return map.containsValue(value);
	}
	
	public void listAllContacts() {
		Set<Entry<String,Integer>> set=map.entrySet();
		Iterator<Entry<String,Integer>> itr=set.iterator();
		
		while(itr.hasNext()) {
			Entry<String,Integer> entry=itr.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
