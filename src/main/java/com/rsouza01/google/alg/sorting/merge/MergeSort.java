package com.rsouza01.google.alg.sorting.merge;

import  java.util.Arrays;

public class MergeSort {

    public static void sort(int[] array) {

        /* {9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0}  */        

        sort(array, 0, array.length - 1);

    }
    public static void printArray(int[] array, int start, int end) {
        System.out.print("{ ");
        for(int i = start; i <= end; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(" }\n");
    }

    public static void sort(int[] array, int start, int end) {

        //System.out.println("Start = " + start);
        //System.out.println("End = " + end);
        //printArray(array, start, end);
        //System.out.println("________________________");

        if(start >= end) return;
        
        int mid = (start + end)/2;
        
        sort(array, start, mid);
        sort(array, mid + 1, end);
        merge(array, start, mid, end);
    }

    public static void merge(int[] array, int start, int mid, int end) {
        
        int sizeL = mid - start + 1;
        int sizeR = end - mid;

        int[] leftArray  = new int[sizeL + 1];
        int[] rightArray = new int[sizeR + 1];

        for(int i = 0; i < sizeL ; i++ ) {
            leftArray[i] = array[start + i];
        }
        leftArray[sizeL] = Integer.MAX_VALUE;
        System.out.println("Left Array = " + Arrays.toString(leftArray));
        
        for(int i = 0; i < sizeR ; i++ ) {
            rightArray[i] = array[mid + 1 + i];
        }
        rightArray[sizeR] = Integer.MAX_VALUE;
		System.out.println("Right Array = " + Arrays.toString(rightArray));

        int i = 0, j = 0;

        for(int k = start; k <= end; k++) {
            if(leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
        }
    }    
    
    
    public static void _merge(int[] array, int start, int mid, int end) {
    
        System.out.println("======================");
        System.out.println("Start = " + start);
        System.out.println("Mid = " + mid);
        System.out.println("End = " + end);
        System.out.println("Merge Inicio");

        printArray(array, start, end);

        int[] tempArray = new int[end - start + 1];
        
        int[] leftArray  = new int[mid - start + 2];
        int[] rightArray = new int[end - mid   + 1];
        
        for(int i = 0; i <= leftArray.length - 1; i++ ) {
            leftArray[i] = array[start + i];
        }
        leftArray[leftArray.length - 1] = Integer.MAX_VALUE;
		System.out.println("Left Array = " + Arrays.toString(leftArray));

        
        System.out.println("Merge Inicio - 2");
        for(int j = 0 ; j <= end; j++ ) {
            rightArray[j] = array[mid + 1 + j];
        }
        rightArray[leftArray.length - 1] = Integer.MAX_VALUE;
		System.out.println("Right Array = " + Arrays.toString(rightArray));
        
        System.out.println("Merge Inicio - 3");

        
        System.arraycopy( tempArray, 0, array, 0, tempArray.length );

        System.out.println("Merge Fim");

    }    
}
