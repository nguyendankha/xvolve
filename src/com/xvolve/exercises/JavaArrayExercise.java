package com.xvolve.exercises;

import java.util.Scanner;

public class JavaArrayExercise {
    // Compute Sum and Average of Double Array Elements
    /**
     * Exercise 1: Compute Sum and Average of Double Array Elements
     * declare 1 Double array which whatever length
     * Scanner -> user input => user nhap vao tat ca cac elements
     * Calculate -> sum of all elements
     * Calculate -> average of all elements
     */

    /**
     * Exercise 2:
     * Declare 1 int array -> cho user input tat ca cac elements
     * Declare 1 int variable -> cho user input int variable
     *
     * Program to search the number in the array
     * When the number is searched from the array, print the sum of all elements before the index of matched element
     * {1,2,3,4,5} -> 4 -> matched -> sum of 1+2+3
     * If the number is not found from the array, calculate the sum of all even numbers of the array
      */

    public static void main(String[] args) {
//        int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };
//        double sum = 0;
//        Double average;
//
//        // access all elements using for each loop
//        // add each element in sum
//        for (int number: numbers) {
//            sum += number;
//        }
//
//        // get the total number of elements
//        int arrayLength = numbers.length;
//
//        // calculate the average
//        // convert the average from int to double
//        average = (double) (sum / arrayLength);
//
//        System.out.println("Sum = " + sum);
//        System.out.println("Average = " + average);
        // arrayCalculation();
        JavaArrayExercise kha = new JavaArrayExercise();
        kha.arrayCalculation();
    }

    public void arrayCalculation(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the length of the array: ");
        int arrayLength = userInput.nextInt();
        boolean isFound = false;
        int[] myArray = new int[arrayLength];

        for (int i = 1; i <= myArray.length; i++) {
            System.out.println("Please enter the value for the " + i + " element:");
            myArray[i-1] = userInput.nextInt();
        }
        System.out.println("--------");

        System.out.println("Please enter the number that you want to search: ");
        int searchNumber = userInput.nextInt();

        // Khai bao 1 mang tam
        int[] tempArray = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] != searchNumber){
                tempArray[i] = myArray[i];
            } else if(myArray[i] == searchNumber){
                isFound = true;
                break;
            }
        }

        int sum = 0;
        if (isFound){
            for (int i: tempArray) {
                sum += i;
            }
            System.out.println("Sum of all elements before the matched number is: " + sum);
        } else{
            for (int i = 0; i < myArray.length; i++) {
                if(myArray[i] % 2 == 0){
                    sum += myArray[i];
                }
            }
            System.out.println("Sum of all even numbers in the array is: " + sum);
        }
    }

}
