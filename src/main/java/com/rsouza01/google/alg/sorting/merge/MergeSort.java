package com.rsouza01.google.alg.sorting.merge;

import  java.util.Arrays;

public class MergeSort {

    public static void sort(int[] array) {

        /* {9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0}  */        

        sort(array, 0, array.length - 1);

    }
    
    public static void sort(int[] array, int start, int end) {
        
        if(start >= end) return;
        
        int mid = (start + end)/2;
        
        sort(array, 0, mid);
        sort(array, mid + 1, end);
        merge(array, start, mid, end);
    }
    
    public static void merge(int[] array, int start, int mid, int end) {
        
        int[] tempArray = new int[end - start + 1];
        
        int[] leftArray = new int[mid + 1];
        int[] rightArray = new int[end - mid + 1];
        
        for(int i = 0; i <= mid; i++ ) leftArray[i] = array[i];
        leftArray[leftArray.length -1] = Integer.MAX_VALUE;
        
        for(int j = mid + 1 ; j <= end; j++ ) rightArray[j - mid + 1] = array[j];
        rightArray[leftArray.length - 1] = Integer.MAX_VALUE;
        
		System.out.println(Arrays.toString(leftArray));
		System.out.println(Arrays.toString(rightArray));

        
        System.arraycopy( tempArray, 0, array, 0, tempArray.length );

    }    
}
