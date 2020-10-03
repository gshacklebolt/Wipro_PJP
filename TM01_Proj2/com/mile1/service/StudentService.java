package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	public int findNumberOfNullMarks(Student data[])
	{
		int val=0;
		for (int i = 0; i < data.length; i++) 
		{
			if((data[i]!=null)&&(data[i].getMarks()==null)) {
				val++;
			}
		}
		return val;
	}
	
	public int findNumberOfNullNames (Student data [])
	{
		int val=0;
		for (int i = 0; i < data.length; i++) 
		{
			if((data[i]!=null)&&(data[i].getName()==null)) {
				val++;
			}
		}
		return val;
	}
	
	public int findNumberOfNullObjects(Student data [])
	{
		int val=0;
		for (int i = 0; i < data.length; i++) 
		{
			if(data[i]==null) {
				val++;
			}
		}
		return val;
	}
}
