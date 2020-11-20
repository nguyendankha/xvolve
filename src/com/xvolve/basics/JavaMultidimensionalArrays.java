package com.xvolve.basics;

public class JavaMultidimensionalArrays {

	public static void main(String[] args) {
		// create a 2d array
		int[][] a = {
				{ 1, 2, 3 },
				{ 4, 5, 6, 9 },
				{ 7 },
		};

		// calculate the length of each row
		System.out.println("Length of row 1: " + a[0].length);
		System.out.println("Length of row 2: " + a[1].length);
		System.out.println("Length of row 3: " + a[2].length);

		// Print all elements of 2d array Using Loop
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// first for...each loop access the individual array
		// inside the 2d array
//		for (int[] innerArray : a) {
//			// second for...each loop access each element inside the row
//			for (int data : innerArray) {
//				System.out.println(data);
//			}
//		}
	}

}
