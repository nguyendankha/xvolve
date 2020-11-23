package com.xvolve.basics;

public class MethodsOrFunctions {
	// create a method
	public static int addNumbers(int a, int b) {
		//int sum = a + b;
		// return value
		return a + b;
	}

	public static void main(String[] args) {

		int num1 = 25;
		int num2 = 15;

		// create an object of Main
		// MethodsOrFunctions obj = new MethodsOrFunctions();
		// calling method
		int result = addNumbers(num1, num2);
		System.out.println("Sum is: " + result);

	}

}
