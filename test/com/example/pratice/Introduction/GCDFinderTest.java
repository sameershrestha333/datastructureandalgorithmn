package com.example.pratice.Introduction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class GCDFinderTest {
	private GCDFinder gCDFinder;

	@Before
	public void setUp() throws Exception {
		gCDFinder=new GCDFinder();
	}

	@Test
	public void testFindGCD() {
		int actual=gCDFinder.findGCD(25,10);
		assertEquals(5, actual);
	}

}
