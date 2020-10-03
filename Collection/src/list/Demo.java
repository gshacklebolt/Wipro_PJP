package list;

import java.util.*;
import java.io.*;
public class Demo {

	public static void main(String[] args) throws IOException{

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0,new Integer(42));
		int total=list.get(0).intValue();
		System.out.println(total);
		
	}

}
