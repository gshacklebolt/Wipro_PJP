package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentReport {
	public String findGrade(Student studentObject){
		int total=0;
		int marks[]=studentObject.getMarks();
		for(int i=0;i<marks.length;i++){
			if(marks[i]<35){
				return "F";
			}else{
				total+=marks[i];
			}
		}
		if(total<=150){
			return "D";
		}
		else if(total<=200){
			return "C";
		}
		else if(total<=250){
			return "B";
		}
		else if(total>250 && total<=300){
			return "A";
		}else
		{
			return "";
		}
	}
	
	public String validate(Student studentObject)throws NullStudentException,NullNameException,NullMarksArrayException{
		if(studentObject==null){
			throw new NullStudentException();
		}
		else if(studentObject.getName()==null){
			throw new NullNameException();
		}
		else if(studentObject.getMarks()==null){
			throw new NullMarksArrayException();
		}else{
			return findGrade(studentObject);
		}
	}
}
