package com.rsouza01.google.alg.sorting.merge;

import  java.util.Arrays;

public class App {
	
	public static void main (String[] args) {

		System.out.println("Merge sorting.");

		int[] array = MergeSort.sort(new int[] {12,45,23,78,34,8,93, 8, 8, 12, 45});

		System.out.println(Arrays.toString(array));

		
	}

}
