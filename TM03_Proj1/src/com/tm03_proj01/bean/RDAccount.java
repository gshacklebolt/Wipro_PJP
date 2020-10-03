package com.tm03_proj01.bean;

import com.tm03_proj01.exception.*;

public class RDAccount extends Account {
	private double interestRate;
	private double amount;
	private int noOfMonths;
	private double monthlyAmount;
	private int ageOfACHolder;
	
	public RDAccount(double monthlyAmount, int noOfMonths, int ageOfACHolder) 
					throws InvalidAmountException, InvalidMonthsException, InvalidAgeException {
		
		if(monthlyAmount>=0)
			this.monthlyAmount=monthlyAmount;
		else
			throw new InvalidAmountException();
		
		if(noOfMonths>=0)
			this.noOfMonths=noOfMonths;
		else
			throw new InvalidMonthsException();
		
		if(ageOfACHolder>=0)
			this.ageOfACHolder=ageOfACHolder;
		else
			throw new InvalidAgeException();
		
		setInterest();
	}
	
	private void setInterest() {
		if(noOfMonths==6)
			interestRate=(ageOfACHolder<60)?7.50:8.00;
		
		else if(noOfMonths==9)
			interestRate=(ageOfACHolder<60)?7.75:8.25;
		
		else if(noOfMonths==12)
			interestRate=(ageOfACHolder<60)?8.00:8.50;
		
		else if(noOfMonths==15)
			interestRate=(ageOfACHolder<60)?8.25:8.75;
		
		else if(noOfMonths==18)
			interestRate=(ageOfACHolder<60)?8.50:9.00;
		
		else if(noOfMonths==21)
			interestRate=(ageOfACHolder<60)?8.75:9.25;
	}
	
	@Override
	public double calculateInterest() {
		/*
		Formula to calculate RD taken from https://www.onemint.com/2012/investments/how-to-calculate-interest-on-recurring-deposits/
		Assumption: Compounded Quarterly
		*/
		amount=0;
		for(int i=noOfMonths;i>0;i--) {
			amount+=monthlyAmount*Math.pow(1+(interestRate/(4*100)), (4*i)/(double)12);
		}
		
		return amount-(noOfMonths*monthlyAmount);
	}

}
