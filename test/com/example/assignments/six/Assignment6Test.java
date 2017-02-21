package com.example.assignments.six;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Assignment6Test {
	private Assignment6 assignment6;

	@Before
	public void setUp() throws Exception {
		assignment6=new Assignment6();
	}

	@Test
	public void testAddMethod() {
		assertEquals(6, assignment6.sumOfSquare(3));
	}

}
