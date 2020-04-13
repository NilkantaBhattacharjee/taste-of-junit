package com.test.nil.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunitAnother {

	@Test
	public void testSubstraction() {
		System.out.println("Inside testSubstruction() of TestJunitAnother");
		assertEquals((10 - 5), 5);
	}
}
