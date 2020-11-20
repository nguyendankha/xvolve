package com.xvolve.basics;

public class LoopFlowControl {
	public static void main(String[] args) {
//		/**
//		 * while- loop
//		 */
//		// Sum from 1 to upperbound
//		int sum = 0, upperBound = 100;
//		int number = 1; // init
//		while (number <= upperBound) {
//			// number = 1, 2, 3, ..., upperbound for each iteration
//			sum += number;
//			++number; // update
//		}
//		System.out.println("sum is: " + sum);
//
		// Factorial of n (=1*2*3*...*n)
		int n = 5;
		int factorial = 1;
		int initNumber = 1; // init
		while (initNumber <= n) {
			// num = 1, 2, 3, ..., n for each iteration
			factorial *= initNumber;
			++initNumber; // update
		}
		System.out.println("factorial is: " + factorial);

		/**
		 * do-while loop
		 */
//		// Sum from 1 to upperbound
//		int sum = 0, upperbound = 100;
//		int number = 1;   // init
//		do {
//		   // number = 1, 2, 3, ..., upperbound for each iteration
//		   sum += number;
//		   ++number;      // update
//		} while (number <= upperbound);
//		System.out.println("sum is: " + sum);
//		 
//		// Factorial of n (=1*2*3*...*n)
//		int n = 5;
//		int factorial = 1;
//		int initNumber = 1;   // init
//		do {
//		   // num = 1, 2, 3, ..., n for each iteration
//		   factorial *= initNumber;
//		   ++initNumber;      // update
//		} while (initNumber <= n);
//		System.out.println("factorial is: " + factorial);

		/**
		 * for-loop
		 */
		// Sum from 1 to upperbound
//		int sum = 0, upperbound = 100;
//		for (int number = 1; number <= upperbound; ++number) {
//			// num = 1, 2, 3, ..., upperbound for each iteration
//			sum += number;
//		}
//		System.out.println("sum is: " + sum);
//
//		// Factorial of n (=1*2*3*...*n)
//		int n = 5;
//		int factorial = 1;
//		for (int number = 1; number <= n; ++number) {
//			// number = 1, 2, 3, ..., n for each iteration
//			factorial *= number;
//		}
//		System.out.println("factorial is: " + factorial);
	}
}
