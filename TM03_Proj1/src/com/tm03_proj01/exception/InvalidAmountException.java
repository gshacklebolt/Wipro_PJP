package com.tm03_proj01.exception;

@SuppressWarnings("serial")
public class InvalidAmountException extends Exception {
	public InvalidAmountException() {
		super("Invalid Amount. Please enter non-negative values.");
	}
}
