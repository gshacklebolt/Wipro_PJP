package com.tm02_proj01.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result res=JUnitCore.runClasses(UnitTester.class);
		
		for(Failure failure:res.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("--------------------------------------------------------------------");
		System.out.println("TM04 'Test of Video Rental Inventory System' was successful: "+res.wasSuccessful());
	}
}