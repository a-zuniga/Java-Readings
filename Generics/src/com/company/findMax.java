package com.company;

import java.math.BigInteger;

public class findMax {
    /**
     * Find the largest integer of an array.
     *
     * @return largest value in array.
     */
    public static BigInteger findMax(BigInteger[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[maxIndex]) > 0) {
                maxIndex = i;
            }
        }

        return arr[maxIndex];
    }

    public static String findMax(String[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[maxIndex]) > 0)
                maxIndex = i;
        }
        return arr[maxIndex];
    }

    public static void main(String[] args) {

        // Tester for BigInteger fidMax()
        BigInteger[] testArrayINT = {
                new BigInteger("4"),
                new BigInteger("3"),
                new BigInteger("10"),
                new BigInteger("7")};

        System.out.println("Largest value for int array is: " + findMax(testArrayINT));

        // Tester for String findMax()
        String[] testArrayString = {
                "Boy",
                "Girl",
                "Girl",
                "Zuchini",
                "Xavier",};
        System.out.println("Largest lexicographical value: " + findMax(testArrayString));
    }
}
