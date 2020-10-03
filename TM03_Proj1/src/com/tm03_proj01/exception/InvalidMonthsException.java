package com.tm03_proj01.exception;

@SuppressWarnings("serial")
public class InvalidMonthsException extends Exception {
	public InvalidMonthsException() {
		super("Invalid number of months. Please enter non-negative values.");
	}
}
