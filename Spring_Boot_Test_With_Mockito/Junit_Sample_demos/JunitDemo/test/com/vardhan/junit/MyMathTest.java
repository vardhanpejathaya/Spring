package com.vardhan.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {

	//Absence of failure is success in Junit.
	
	@Test
	void testMyMathwith_3_inputs() {
		System.out.println("Test 1");
		MyMath mathtest = new MyMath();
	    assertEquals(6, mathtest.getSome(new int[] {1,2,3} ));
	}
	
	@Test
	void testMyMathwith_1_inputs() {
		System.out.println("Test 2");
		MyMath mathtest = new MyMath();
		int sum = mathtest.getSome(new int[] {1} );
	    assertEquals(1, sum);
	}
	
	/*
	 * Junit annotations
	 */
	@BeforeEach
	public void before() {
		System.out.println("Before test");
	}
	
	@AfterEach
	public void after() {
		System.out.println("After test");
	}
	
	
	@AfterAll //After class
	public static void afterclass() {
		System.out.println("Class after");
	}
	
	@BeforeAll //Before class
	public static void beforeclass() {
		System.out.println("Class before");
	}
	
}
