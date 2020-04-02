package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.mockito.Mock;

class Mocksampletest_mockito {

	@Test
	void test_getMaxVal1() {
		
		DataBinds databinds = mock(DataBinds.class);
		when(databinds.retrieveData()).thenReturn(new int[] {12,13,23});
		
		Mocksample mocksample = new Mocksample(databinds);
		
		int result = mocksample.getMaxVal();
		assertEquals(23, result);
		
	}
	
	@Test
	void test_getMaxVal2() {
		
		DataBinds databinds = mock(DataBinds.class);
		when(databinds.retrieveData()).thenReturn(new int[] {12,13});
		
		Mocksample mocksample = new Mocksample(databinds);
		
		int result = mocksample.getMaxVal();
		assertEquals(13, result);
		
	}

	
}
