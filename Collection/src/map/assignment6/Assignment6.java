package map.assignment6;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment6 {
	private Hashtable<String,String> M1;
	
	//Constructor
	public Assignment6() {
		M1=new Hashtable<String,String>();
	}
	
	//This method adds the passed country and capital as key/value in the map M1 and return the Map (M1)
	public Hashtable<String,String> saveCountryCapital(String CountryName,String capital) {
		M1.put(CountryName, capital);
		return M1;
	}
	
	//getCapital() returns the capital for the country passed from the map M1
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	//getCountry() returns the country for the Capital name passed from the map M1
	public String getCountry(String capitalName) {
		for(String CountryName:M1.keySet()) {
			if(capitalName.equals(M1.get(CountryName)))
				return CountryName;
		}
		return null;
	}
	
	//createOppositeMap() iterates through the map M1 and creates another map M2 with
	//Capital as key and Country as value, and returns map M2
	public Hashtable<String,String> createOppositeMap(){
		
		Hashtable<String,String> M2=new Hashtable<String,String>();
		
		Set<Entry<String,String>> set=M1.entrySet();
		Iterator<Entry<String,String>> itr=set.iterator();
		
		while(itr.hasNext()) {
			Entry<String,String> entry=itr.next();
			M2.put(entry.getValue(), entry.getKey());
		}
		return M2;
	}
	
	//createArrayList() iterates through the map M1 and creates 
	//an ArraList with all country names stored as keys
	public ArrayList<String> createArrayList(){
		ArrayList<String> arr=new ArrayList<String>();
		
		Set<Entry<String,String>> set=M1.entrySet();
		Iterator<Entry<String,String>> itr=set.iterator();
		
		while(itr.hasNext()) {
			Entry<String,String> entry=itr.next();
			arr.add(entry.getKey());
		}
		return arr;
	}

	public static void main(String[] args) {
		Assignment6 obj=new Assignment6();
		
		obj.saveCountryCapital("India", "Delhi");
		obj.saveCountryCapital("Pakistan", "Islamabad");
		obj.saveCountryCapital("USA", "Washington DC");
		obj.saveCountryCapital("Japan", "Tokyo");
		
		System.out.println(obj.getCapital("India"));
		
		System.out.println(obj.getCountry("Tokyo"));
		
		System.out.println(obj.createOppositeMap());
		
		System.out.println(obj.createArrayList());
	}
}
