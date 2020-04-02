package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Mocksampletest_stub {

	@Test
	void test_getMaxVal() {
		
		Mocksample mocksample = new Mocksample(new DataServiceStub());
		int result = mocksample.getMaxVal();
		assertEquals(23, result);
		
	}

	
	/*
	 * Data Binds stub
	 */
	
	class DataServiceStub implements DataBinds {

		@Override
		public int[] retrieveData() {
			// TODO Auto-generated method stub
			return new int[] {12,13,23};
		}
		
	}
}
