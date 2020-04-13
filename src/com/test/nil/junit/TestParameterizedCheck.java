package com.test.nil.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.nil.business.OddEvenNumberChecker;

@RunWith(Parameterized.class)
public class TestParameterizedCheck {

	// private final Integer number;
	private final String expectedResult;
	private OddEvenNumberChecker oddEvenNumberChecker;

	private final Integer number1;
	private final Integer number2;

	/*
	 * public TestParameterizedCheck(final Integer number, final String
	 * expectedResult) { this.number = number; this.expectedResult = expectedResult;
	 * }
	 */

	public TestParameterizedCheck(final Integer number1, final Integer number2, final String expectedResult) {
		this.number1 = number1;
		this.number2 = number2;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		oddEvenNumberChecker = new OddEvenNumberChecker();
	}

	@Parameterized.Parameters
	public static Collection listOfNumbers() {
		return Arrays.asList(new Object[][] { { 5, 7, "Odd" }, { 6, 5, "Even" }, { 7, 9, "Odd" } });
	}

	/*
	 * @Test public void testCheckOddOrEven() {
	 * System.out.println("Testing CheckOddOrEven with number:" + number);
	 * assertEquals(expectedResult, oddEvenNumberChecker.checkOddOrEven(number)); }
	 */

	@Test
	public void testCheckOddOrEven() {
		System.out.println("Testing CheckOddOrEven with number:" + number1 + " and " + number2);
		assertEquals(expectedResult, oddEvenNumberChecker.checkOddOrEven(number1, number2));
	}
}
