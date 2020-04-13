package com.test.nil.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

// @Ignore
public class TestJunit {

	@Test(timeout = 1000)
	public void testRandom() {
		System.out.println("Inside testRandom() of TestJunit");
		String name = "Nilkanta";
		assertEquals("Nilkanta", name);
	}

	// @Ignore
	@Test
	public void testAdd() {
		System.out.println("Inside testAdd() of TestJunit");
		assertEquals((5 + 5), 10);
	}
}
