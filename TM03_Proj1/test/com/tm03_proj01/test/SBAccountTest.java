package com.tm03_proj01.test;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.BeforeClass;

import com.tm03_proj01.bean.SBAccount;
import com.tm03_proj01.exception.InvalidAmountException;

public class SBAccountTest {
	static SBAccount sba;
	
	
	@BeforeClass
	public static void before() throws InvalidAmountException {
		sba=new SBAccount(10000);
	}
	
	@Test
	public void testCalculateInterest() {
		assertEquals(400,sba.calculateInterest(),0.0);
	}

}
