package com.rsouza01.google.alg.sorting.selection;

public class SelectionSort {

    public static int[] sort(int[] array) {

        int minimumIndex = 0;

        //12,45,23,78,34,8,23
        // minimumIndex = 0
        //12,45,23,78,34,8,23
        // i             j
        //8,45,23,78,34,12,23
        // i             j

        for (int i = 0; i < array.length - 1; i++) {
            minimumIndex = i;
            for (int j = i+1; j < array.length - 1; j++) {
                if(array[j] < array[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            int lastMinimun = array[i];
            array[i] = array[minimumIndex];
            array[minimumIndex] = lastMinimun;
        }

        return array;
    }
}
