package com.rsouza01.google.alg.sorting.insertion;

import  java.util.Arrays;

public class App {
	
	public static void main (String[] args) {

		System.out.println("Insertion sorting.");

		int[] array = InsertionSort.sort(new int[] {12,45,23,78,34,8,93, 8, 8, 12, 45});

		System.out.println(Arrays.toString(array));

		
	}

}
