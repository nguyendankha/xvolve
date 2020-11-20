package com.xvolve.exercises;

import java.util.Scanner;

public class WhileLoopExercise {
    /**
     * Write a program to print 24 alphabet characters.
     */

    /**
     * Write a program that take numbers from user input
     * It will return the sum of all positive numbers from user input
     * If user inputs negative number, program is terminated
     *
     * User input:
     *      1. Tao 1 variable de goi method nhap ki tu: Scanner input = new Scanner(System.in);
     *      2. Tao numeric variable de assign value bang user input:  int number = input.nextInt();
     */
    public static void main(String[] args) {
        char letter = 'A';
        while (letter <= 'Z') {
            System.out.println(letter);
            letter++;
        }

        // create initialized sum value
        int sum = 0;
        // create an object of Scanner class
        Scanner input = new Scanner(System.in);
        // take integer input from the user
        System.out.println("Enter a number");
        int number = input.nextInt();

        // while loop continues
        // until entered number is positive
        while (number >= 0) {
            // add only positive numbers
            sum += number;

            System.out.println("Enter a number");
            number = input.nextInt();
        }

        System.out.println("Sum = " + sum);
        input.close();
    }
}
