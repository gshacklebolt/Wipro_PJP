package com.tm02_proj01.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tm02_proj01.bean.Video;

public class VideoTest {
	Video video;
	
	@Before
	public void before() {
		video=new Video("Harry Potter");
	}

	@Test
	public void testGetName() {
		assertEquals("Harry Potter",video.getName());
	}

	@Test
	public void testDoCheckout() {
		video.doCheckout();
		assertTrue(video.getCheckout());
	}

	@Test
	public void testDoReturn() {
		video.doReturn();
		assertFalse(video.getCheckout());
	}

	@Test
	public void testReceiveRating() {
		video.receiveRating(9);
		assertEquals(9, video.getRating());
	}

	@Test
	public void testGetRating() {
		video.receiveRating(10);
		assertEquals(10, video.getRating());
	}

	@Test
	public void testGetCheckout() {
		video.doCheckout();
		assertTrue(video.getCheckout());
		
		video.doReturn();
		assertFalse(video.getCheckout());
	}

}