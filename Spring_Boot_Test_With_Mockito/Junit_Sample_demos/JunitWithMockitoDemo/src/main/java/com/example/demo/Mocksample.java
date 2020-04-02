package com.example.demo;

public class Mocksample {

	private DataBinds databind;

	public Mocksample(DataBinds databind) {
		super();
		this.databind = databind;
	}

	public int getMaxVal() {

		int value = Integer.MIN_VALUE;

		for (int x : databind.retrieveData()) {

			if (x > value)
				value = x;
		}

		return value;
	}
}
