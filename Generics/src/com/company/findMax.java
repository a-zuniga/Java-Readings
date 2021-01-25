package com.company;

import java.math.BigInteger;

public class findMax {
    /**
     * Find the largest integer of an array.
     * @return largest value in array.
     */
    public static BigInteger findMax(BigInteger [] arr){
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++){
            if(arr[i].compareTo(arr[maxIndex]) > 0){
                maxIndex = i;
            }
        }

        return arr[maxIndex];
    }
    public static void main(String [] args){
        BigInteger [] testArray = {new BigInteger("4"),
                                   new BigInteger("3"),
                                   new BigInteger("10"),
                                   new BigInteger("7")};

        System.out.print("Largest value is: " + findMax(testArray));
    }
}
