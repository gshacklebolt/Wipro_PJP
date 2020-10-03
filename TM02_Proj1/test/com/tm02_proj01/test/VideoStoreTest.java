package com.tm02_proj01.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tm02_proj01.bean.VideoStore;

public class VideoStoreTest {
	static VideoStore vs;
	
	@Before
	public void before() {
		vs=new VideoStore();
	}
	
	@Test
	public void testAddVideo() {
		vs.addVideo("Matrix");
		assertEquals("Matrix",vs.store[0].getName());
		
		vs.addVideo("Harry Potter");
		assertEquals("Harry Potter",vs.store[1].getName());
		
		vs.addVideo("Ironman");
		assertEquals("Ironman",vs.store[2].getName());
	}

	@Test
	public void testDoCheckout() {
		vs.addVideo("Matrix");
		vs.addVideo("Harry Potter");
		vs.addVideo("Ironman");
		
		vs.doCheckout("Matrix");
		vs.doCheckout("Ironman");
		
		assertTrue(vs.store[0].getCheckout());
		assertFalse(vs.store[1].getCheckout());
		assertTrue(vs.store[2].getCheckout());
	}

	@Test
	public void testDoReturn() {
		vs.addVideo("Matrix");
		vs.addVideo("Harry Potter");
		vs.addVideo("Ironman");
		
		vs.doCheckout("Matrix");
		vs.doCheckout("Ironman");
		vs.doReturn("Ironman");
		
		assertTrue(vs.store[0].getCheckout());
		assertFalse(vs.store[1].getCheckout());
		assertFalse(vs.store[2].getCheckout());
	}

	@Test
	public void testReceiveRating() {
		vs.addVideo("Matrix");
		vs.addVideo("Harry Potter");
		vs.addVideo("Ironman");
		
		vs.receiveRating("Matrix",9);
		vs.receiveRating("Harry Potter",10);
		vs.receiveRating("Ironman",8);
		
		assertEquals(9,vs.store[0].getRating());
		assertEquals(10,vs.store[1].getRating());
		assertEquals(8,vs.store[2].getRating());
	}

	@Test
	public void testListInventory() {
		try {
			vs.listInventory();
			assertFalse(false);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

}
