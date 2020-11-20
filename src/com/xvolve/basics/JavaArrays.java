package com.xvolve.basics;

public class JavaArrays {
	public static void main(String[] args) {
		// create an array
		int[] age = { 12, 4, 5, 2, 5 };
		//[] dau tien: so dong
		//[] thu 2: so cot
		int[][] tuDungLy = {
				{1, 2, 3, 4, 5, 6, 7},
				{8, 9, 10, 11, 12, 13, 14},
				{15, 16, 17, 18, 19, 20, 21}
		};

		System.out.println( tuDungLy[1][5] );

		// array declaration
//		String[] myStringArray = new String[10];
//		String myFirstElement = myStringArray[0];

		// access each array elements
//		System.out.println("Accessing Elements of Array:");
//		System.out.println("First Element: " + age[0]);
//		System.out.println("Second Element: " + age[1]);
//		System.out.println("Third Element: " + age[2]);
//		System.out.println("Fourth Element: " + age[3]);
//		System.out.println("Fifth Element: " + age[4]);

		// loop through the array
		// using for loop
//		System.out.println("Using for Loop:");
//		for (int i = 0; i < age.length; i++) {
//			System.out.println(age[i]);
//		}

		// loop through the array
		// using for loop
//		System.out.println("Using for-each Loop:");
//		for (int a : age) {
//			System.out.println(a);
//		}
	}
}
