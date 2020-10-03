package generics;

import java.util.HashMap;
import java.io.*;

class Animal{
	
	String category;
	public Animal(String category) {
		this.category=category;
	}
	
	public String toString() {
		return category;
	}
}

public class Maps {
	public static void main(String args[]) throws IOException{
		HashMap<String,String> map=new HashMap<String,String>();
		map.put(null, null);
		map.put("Mammal","Dog");
		map.put("Reptile","Lizard");
		map.put("Bird","Ostrich");
		map.put("Amphibians","Salamander");
		map.put("Invertibrates","Insect");
		map.put("Fish","Salmon");
		
		
	}
}
