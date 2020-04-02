package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

class List_mockito_sample {

	@Test
	public void testList() {
		
		List<Integer> list = mock(List.class);
		//when(list.size()).thenReturn(20).thenReturn(30).thenReturn(40);
		assertEquals(20,list.size());
		assertEquals(30,list.size());
		assertEquals(40,list.size());
	}
	
	@Test
	public void testList_validateString() {
		
		List list = mock(List.class);
		when(list.get(Mockito.anyInt())).thenReturn("vardhan");
		assertEquals("vardhan","vardhan");
		
	}

}
