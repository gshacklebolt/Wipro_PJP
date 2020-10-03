package com.tm03_proj01.bean;

import com.tm03_proj01.exception.*;

public class SBAccount extends Account {
	private double interestRate;
	private double amount;
	
	public SBAccount(double amount) throws InvalidAmountException {
		if(amount>=0)
			this.amount=amount;
		else
			throw new InvalidAmountException();
		
		//How to pass this info is not specified in question
		//Set accountType as Normal or NRI from here
		String accountType="Normal";
		setInterest(accountType);
	}
	
	@Override
	public double calculateInterest() {
		
		return amount*(interestRate/100);
	}
	
	private void setInterest(String accountType) {
		if(accountType.equals("Normal")) {
			interestRate=4.00;
		}
		
		else if(accountType.equals("NRI")) {
			interestRate=6.00;
		}
	}

}
