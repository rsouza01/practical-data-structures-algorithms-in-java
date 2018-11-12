package com.rsouza01.google.alg.linearsearch;

public class BinarySearch {

    public static int binarySearch(int value, int[] array) {
        int answer = -1;

        int l = 0, r = array.length - 1;

        while(l <= r) {

            int m = (int)((l+r)/2);
            if(array[m] == value) return m;
            else if(array[m] > value) r = m-1;
            else if(array[m] < value) l = m+1;
        }
        return answer;
    }

    public static int binarySearch(int value, int[] array, int l, int r) {

        if(l > r) return -1;
        else {
            int m = (int)(l + r)/2;

            if(array[m] == value) return m;
            else if(array[m] > value) return binarySearch(value, array, l, m -1);
            else return binarySearch(value, array, l+1, r);
        }

    }    

}
