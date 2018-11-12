package com.rsouza01.google.alg.linearsearch;

public class LinearSearch {
    
    public static int linearSearch(int value, int[] array) {

        int index = -1;
        for(int n = 0; n < array.length; n++) {
            if(value == array[n]) {
                index = n;
                break;
            }
        }
        return index;
    }
    public static int linearSearch(int value, int i, int[] array) {

        //i = 0
        //{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
        //             ^
        if(i > array.length-1) return -1;
        else if(array[i] == value) return i;
        else return LinearSearch.linearSearch(value, i + 1, array);
        
    }

}
