package com.tm03_proj01.bean;

import com.tm03_proj01.exception.*;

public class FDAccount extends Account {
	private double interestRate;
	private double amount;
	private int noOfDays;
	private int ageOfACHolder;
	
	public FDAccount(double amount,int noOfDays,int ageOfACHolder) 
					throws InvalidAmountException,InvalidDaysException,InvalidAgeException{
		if(amount>=0)
			this.amount=amount;
		else
			throw new InvalidAmountException();
		
		if(noOfDays>=0)
			this.noOfDays=noOfDays;
		else
			throw new InvalidDaysException();
		
		if(ageOfACHolder>=0)
			this.ageOfACHolder=ageOfACHolder;
		else
			throw new InvalidAgeException();
		
		setInterest();
	}
	
	private void setInterest() {
		if(amount<10000000) {
			if(noOfDays>=7 && noOfDays<=14)
				interestRate=(ageOfACHolder<60)?4.50:5.00;
			
			else if(noOfDays>=15 && noOfDays<=29)
				interestRate=(ageOfACHolder<60)?4.75:5.25;
			
			else if(noOfDays>=30 && noOfDays<=45)
				interestRate=(ageOfACHolder<60)?5.50:6.00;
			
			//if noOfDays=45 the above condition will be executed, not the one below
			else if(noOfDays>=45 && noOfDays<=60)
				interestRate=(ageOfACHolder<60)?7.00:7.50;
			
			else if(noOfDays>=61 && noOfDays<=184)
				interestRate=(ageOfACHolder<60)?7.50:8.00;
			
			else if(noOfDays>=185 && noOfDays<=365)
				interestRate=(ageOfACHolder<60)?8.00:8.50;
		}
		else 
		{
			if(noOfDays>=7 && noOfDays<=14)
				interestRate=6.50;
			
			else if(noOfDays>=15 && noOfDays<=29)
				interestRate=6.75;
			
			else if(noOfDays>=30 && noOfDays<=45)
				interestRate=6.75;
			
			else if(noOfDays>=45 && noOfDays<=60)
				interestRate=8.00;
			
			else if(noOfDays>=61 && noOfDays<=184)
				interestRate=8.50;
			
			else if(noOfDays>=185 && noOfDays<=365)
				interestRate=10.00;
		}
	}
	
	@Override
	public double calculateInterest() {
		return amount*(interestRate/100);
	}

}
