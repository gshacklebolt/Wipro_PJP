package com.tm03_proj01.main;

import com.tm03_proj01.bean.*;
import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account ac;
		double amount;
		int period;
		int ageOfACHolder;
		int option;
		
		do {
			System.out.println("\nMAIN MENU");
			System.out.println("---------");
			System.out.printf("%31s","1. Interest Calculator - SB\n");
			System.out.printf("%31s","2. Interest Calculator - FD\n");
			System.out.printf("%31s","3. Interest Calculator - RD\n");
			System.out.printf("%11s","4. Exit\n");
			System.out.print("Enter your option (1..4): ");
			option=sc.nextInt();
				
			try {
				switch(option) {
				case 1:
					System.out.print("Enter the Average amount in your account: ");
					amount=sc.nextDouble();
					ac=new SBAccount(amount);
					System.out.printf("Interest gained: Rs. %.2f\n",ac.calculateInterest());
					break;
						
				case 2:
					System.out.print("Enter the FD amount: ");
					amount=sc.nextDouble();
					System.out.print("Enter the number of days: ");
					period=sc.nextInt();
					System.out.print("Enter your age: ");
					ageOfACHolder=sc.nextInt();

					ac=new FDAccount(amount,period,ageOfACHolder);
					System.out.printf("Interest gained is: Rs. %.2f\n",ac.calculateInterest());
					break;

				case 3:
					System.out.print("Enter the RD amount: ");
					amount=sc.nextDouble();
					System.out.print("Enter the number of months: ");
					period=sc.nextInt();
					System.out.print("Enter your age: ");
					ageOfACHolder=sc.nextInt();
					ac=new RDAccount(amount,period,ageOfACHolder);
					System.out.printf("Interest gained is: Rs. %.2f\n",ac.calculateInterest());
					break;
					}
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
			
		}while(option!=4);
			
		System.out.println("Exiting...!! Thanks for using the application.");
		sc.close();
	}

}
