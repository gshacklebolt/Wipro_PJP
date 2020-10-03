package set;

import java.util.*;
import java.io.*;

public class Test {
	public static void main(String[] args) {
		TreeSet treeset=new TreeSet();
		treeset.add(new Student(1,"Ajay",66));
		treeset.add(new Student(2,"Abhi",96));
		treeset.add(new Student(3,"Sanjai",45));
		
		Iterator it=treeset.iterator();
		while(it.hasNext())
		{
			Student st=(Student)it.next();
			System.out.println(st.rollNo+":"+st.name+":"+st.marks);
		}
		
	}
}
