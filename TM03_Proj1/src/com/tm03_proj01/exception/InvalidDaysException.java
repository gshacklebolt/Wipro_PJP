package com.tm03_proj01.exception;

@SuppressWarnings("serial")
public class InvalidDaysException extends Exception {
	public InvalidDaysException() {
		super("Invalid Number of days. Please enter non-negative values.");
	}
}
