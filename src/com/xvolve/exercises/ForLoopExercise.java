package com.xvolve.exercises;

public class ForLoopExercise {
    /**
     * Program to find the sum of numbers from 1 to 1000
     */
    public static void main(String[] args) {
        int sum = 0;
        int n = 1000;

        // for loop
        for (int i = 1; i <= n; ++i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }

        System.out.println("Sum = " + sum);

        String amountValue = "false";

    }
}
