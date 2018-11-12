package com.rsouza01.google.adt;

public class Counter {
	
	String name = "";
	private int counter = 0;
	
	public Counter(String str) {
		name = str;
	}

	public void increment() {
		counter++;
	}
	
	public int getCurrentValue() {
		return counter;
	}

	public String toString() {
		return "" + counter;
	}
	
}
