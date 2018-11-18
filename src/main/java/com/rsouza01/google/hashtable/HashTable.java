package com.rsouza01.google.hashtable;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class HashTable {

    String[] hashArray;
    int arraySize = 0;
    int size = 0;

    public HashTable(int noOfSlots) throws Exception {

        if(noOfSlots <= 0) throw new Exception("Number of slots must be bigger than 0");
        
        if(isPrime(noOfSlots)) {
            arraySize = noOfSlots;
        } else {
            arraySize = getNextPrime(noOfSlots);
        }
        hashArray = new String[arraySize];
    }

    private static int getNextPrime(int number) {
        int nextPrime = number + 1;
        while(!isPrime(nextPrime)) nextPrime++;
        return nextPrime;
    }

    private static boolean isPrime(int number) {
        for(int i = 2; i*i  <= number; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }

    private int hashFunc1(String word) {
        int hashVal = word.hashCode();
        hashVal =  hashVal % arraySize;

         return  hashVal < 0 ? hashVal + arraySize : hashVal;
    }

    private int hashFunc2(String word) {

        return 3 - hashFunc1(word) % 3;
    }

    public String find(String word) {

        int hashVal = hashFunc1(word);
        int stepSize = hashFunc2(word);
        
        while(hashArray[hashVal] != null) {
            if(hashArray[hashVal].equals(word)) {
                return hashArray[hashVal];
            }
            hashVal= (hashVal + stepSize) % arraySize;
        }
        
         return hashArray[hashVal];
    }

    public void insert(String word) {
        
        int hashVal = hashFunc1(word);
        int stepSize = hashFunc2(word);
        
        while(hashArray[hashVal] != null) {
            hashVal= (hashVal + stepSize) % arraySize;
        }
        
         hashArray[hashVal] = word;
         size++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("HashTable: [");
        for(String element: hashArray) {
            builder.append(element + ", ");
        }
        builder.append("]");

        return builder.toString();
    }
}

