package com.mile1.exception;

public class NullStudentException extends Exception {
	public NullStudentException() {
		super();
	}
	
	public String toString() {
		return ("\"NullStudentException occurred\" inside the toString() function.");
	}
}
