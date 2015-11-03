package com.CoverMe.test;

import static org.junit.Assert.*;

import com.CoverMe.main.CoverMe;

import org.junit.Test;

public class TestCoverMe {

	@Test
	public void testRun() {
		CoverMe cm = new CoverMe("https://github.com/AdamJackman");
		String letter = cm.buildLetter();
		System.out.println(letter);
	}
	
	
	@Test
	public void testDifference() {
		CoverMe cm = new CoverMe("https://github.com/AdamJackman");
		String letter = cm.buildLetter();
		
		CoverMe cm2 = new CoverMe("https://google.com");
		String letter2 = cm2.buildLetter();
		
		assertTrue(!letter.equals(letter2));
	}

}
