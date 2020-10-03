package set.assignment4;

import java.util.TreeSet;
import java.util.Iterator;

public class Assignment4 {
	TreeSet<String> H1=new TreeSet<String>();
	
	public TreeSet<String> saveCountryNames(String CountryName) {
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
		Assignment4 countryObj=new Assignment4();
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
