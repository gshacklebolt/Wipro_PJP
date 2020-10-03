package com.tm03_proj01.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.tm03_proj01.bean.RDAccount;
import com.tm03_proj01.exception.InvalidAgeException;
import com.tm03_proj01.exception.InvalidAmountException;
import com.tm03_proj01.exception.InvalidMonthsException;

public class RDAccountTest {
static RDAccount rda;
	
	
	@BeforeClass
	public static void before() throws InvalidAmountException, InvalidMonthsException, InvalidAgeException {
		rda=new RDAccount(10000,9,65);
	}
	
	@Test
	public void testCalculateInterest() {
		assertEquals(3129.35,rda.calculateInterest(),0.1);
	}

}
