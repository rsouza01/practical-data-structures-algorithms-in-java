package com.rsouza01.google.alg.linearsearch;

public class App {
	
	public static void main (String[] args) {

		int[] array = new int[] {0,1,2,3,4,5,6,7,8,9};

		/*
		System.out.println(LinearSearch.linearSearch(8, array));
		System.out.println(LinearSearch.linearSearch(12, array));

		System.out.println(LinearSearch.linearSearch(-1, 0, array));
		System.out.println(LinearSearch.linearSearch(0, 0, array));
		System.out.println(LinearSearch.linearSearch(5, 0, array));
		System.out.println(LinearSearch.linearSearch(10, 0, array));
		System.out.println(LinearSearch.linearSearch(12, 0, array));
		*/


		System.out.println(BinarySearch.binarySearch(-1, array));
		System.out.println(BinarySearch.binarySearch(0, array));
		System.out.println(BinarySearch.binarySearch(5, array));
		System.out.println(BinarySearch.binarySearch(10, array));
		System.out.println(BinarySearch.binarySearch(12, array));

		System.out.println(BinarySearch.binarySearch(-1, array, 0, array.length -1));
		System.out.println(BinarySearch.binarySearch(0, array, 0, array.length -1));
		System.out.println(BinarySearch.binarySearch(5, array, 0, array.length -1));
		System.out.println(BinarySearch.binarySearch(10, array, 0, array.length -1));
		System.out.println(BinarySearch.binarySearch(12, array, 0, array.length -1));

	}

}
