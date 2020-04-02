package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class Mocksampletest_mockito_annotation {

	@Mock
	 DataBinds databinds;

	@InjectMocks
	 Mocksample mocksample;

	@Test
	void test_getMaxVal1() {

		when(databinds.retrieveData()).thenReturn(new int[] { 12, 13, 23 });

		int result = mocksample.getMaxVal();
		assertEquals(23, result);

	}

	@Test
	void test_getMaxVal2() {

		when(databinds.retrieveData()).thenReturn(new int[] { 12, 13 });

		int result = mocksample.getMaxVal();
		assertEquals(13, result);

	}

}
