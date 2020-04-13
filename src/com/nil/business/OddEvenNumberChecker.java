package com.nil.business;

public class OddEvenNumberChecker {

	public String checkOddOrEven(final Integer number) {
		String output;
		if (number % 2 == 0) {
			output = "Even";
		} else {
			output = "Odd";
		}
		return output;
	}

	public String checkOddOrEven(final Integer number1, final Integer number2) {
		String output;
		if ((number1 * number2) % 2 == 0) {
			output = "Even";
		} else {
			output = "Odd";
		}
		return output;
	}
}
