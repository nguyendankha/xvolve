package com.xvolve.basics;

public class IncrementDecrementOperators {
	public static void main(String[] args) {
		/**
		 * Pre-Increment and Pre-Decrement Unary Operators
		 */
		// Increment 
		int incrementOperand = 1;
		++incrementOperand; // operand = 2
		int number = ++incrementOperand; // operand = 3, number = 3
		System.out.println(number);
		
		// Decrement
		int decrementOperand = 2;
		--decrementOperand; // operand = 1
		int newNumber = --decrementOperand; // operand = 0, number = 0
		System.out.println(newNumber);
		
		/**
		 * Post-Increment and Post-Decrement Unary Operators
		 */
		// Increment
		int postIncrementOperand = 1;
		postIncrementOperand++; // operand = 2
		int newPostIncrementNumber = postIncrementOperand++; // operand = 3, number = 2
		System.out.println(newPostIncrementNumber);
		
		// Decrement
		int postDecrementOperand = 2;
		postDecrementOperand--; //operand = 1
		int myPostDecrementNumber = postDecrementOperand--; // operand = 0, number 1
		System.out.println(myPostDecrementNumber);

	}
}
