package com.tm03_proj01.exception;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super("Invalid age. Please enter non-negative values.");
	}
}
