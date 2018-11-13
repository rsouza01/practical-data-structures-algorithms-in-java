package com.rsouza01.google.alg.sorting.merge;

import  java.util.Arrays;

public class App {
	
	public static void main (String[] args) {

		System.out.println("Merge sorting.");
		
		int[] array = new int[] {9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0};

		MergeSort.sort(array);

		System.out.println(Arrays.toString(array));

		
	}

}
