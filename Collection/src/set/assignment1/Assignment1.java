package set.assignment1;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment1 {
	HashSet<String> H1=new HashSet<String>();
	
	public HashSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> itr=H1.iterator();
		while(itr.hasNext()) 
		{
			String country=(String)itr.next();
			if(country.equals(CountryName))
				return country;
		}
		return null;
	}

	public static void main(String[] args) {
		Assignment1 countryObj=new Assignment1();
		countryObj.saveCountryNames("India");
		countryObj.saveCountryNames("Denmark");
		countryObj.saveCountryNames("Sweden");
		countryObj.saveCountryNames("Norway");
		countryObj.saveCountryNames("Finland");
		countryObj.saveCountryNames("Iceland");
		System.out.println("Japan: "+countryObj.getCountry("Japan"));
		System.out.println("Norway: "+countryObj.getCountry("Norway"));
		
	}

}
