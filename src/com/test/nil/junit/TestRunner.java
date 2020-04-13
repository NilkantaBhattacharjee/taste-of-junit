package com.test.nil.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {

	public static void main(String[] args) {

		// Result result = JUnitCore.runClasses(TestJunit.class);
		Result result = JUnitCore.runClasses(JunitTestSuite.class);
		
		result.getFailures().forEach(faliure -> {
			System.out.println(faliure.toString());
		});
		System.out.println(result.getRunCount() 
					+ ":" + result.getFailureCount()
					+ ":" + result.getRunTime());
		System.out.println(result.wasSuccessful());
	}

}
