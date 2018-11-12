package com.rsouza01.google.alg.sorting.insertion;

public class InsertionSort {

    public static int[] sort(int[] array) {
        
        for(int i = 1; i < array.length - 1; i++) {
            int element = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > element ) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = element;
        }
        
        return array;
    }
}
