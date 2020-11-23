package com.xvolve.basics;

import java.util.Arrays;

public class ConcatenateTwoArrays {
	public static void main(String[] args) {
		/**
		 * Method 1: System.arraycopy
		 */
		int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);

        System.out.println(Arrays.toString(result));
        
        /**
         * Method 2: 
         */
        int[] myArray1 = {1, 2, 3};
        int[] myArray2 = {4, 5, 6};

        int length = myArray1.length + myArray2.length;

        String myString = "KhaNguyen";
        int myLength = myString.length();

        int[] newResult = new int[length];
        int pos = 0;
        for (int element : myArray1) {
        	newResult[pos] = element;
            pos++;
        }

        for (int element : myArray2) {
        	newResult[pos] = element;
            pos++;
        }

        System.out.println(Arrays.toString(newResult));
	}
}
