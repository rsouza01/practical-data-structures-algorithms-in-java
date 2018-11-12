package com.rsouza01.google.adt;

public class App {
	
	public static void main (String[] args) {

		Counter counter = new Counter("c1");
		
		counter.increment();
		
		System.out.println(counter.getCurrentValue());
	}
}
