package com.vardhan.junit;

public class MyMath {

	public int getSome(int[] numbers) {
		
		int sum =0;
		for(int i: numbers) {
			sum = sum+i;
		}
		return sum;
	}
}
