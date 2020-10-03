package generics;

import java.util.*;

public class ToDelete {
	
	public static <A> void printArray(A[] arr) {
		for(A val:arr) {
			System.out.printf("%s", val);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray= {1.1,2.2,3.3,4.4};
		Character[] charArray= {'H','E','L','L','O'};
		
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
	}

}
