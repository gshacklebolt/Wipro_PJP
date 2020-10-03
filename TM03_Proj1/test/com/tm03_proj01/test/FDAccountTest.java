package com.tm03_proj01.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tm03_proj01.bean.FDAccount;
import com.tm03_proj01.exception.InvalidAgeException;
import com.tm03_proj01.exception.InvalidAmountException;
import com.tm03_proj01.exception.InvalidDaysException;

public class FDAccountTest {
	static FDAccount fda;
	
	
	@BeforeClass
	public static void before() throws InvalidAmountException, InvalidDaysException, InvalidAgeException {
		fda=new FDAccount(10000,9,65);
	}
	
	@Test
	public void testCalculateInterest() {
		assertEquals(500,fda.calculateInterest(),0.0);
	}

}
