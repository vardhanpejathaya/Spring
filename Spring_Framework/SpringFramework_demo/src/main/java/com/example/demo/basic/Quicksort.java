package com.example.demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("quk")
public class Quicksort implements searchalgo {
	
	@Override
	public int sort(int[] numbers, int searchItem) {
		// TODO Auto-generated method stub
		return 5;
	}

}
