package com.xvolve.exercises;

public class ConditionalFlowExercises {
    /**
     * Exercise 1
     * Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise. The program shall always print    “bye!” before exiting.
     */

    /**
     * Exercise 2
     * Take three numbers from the user and print the greatest number.
     * Neu nhu co 2 so giong nhau, print 2 numbers.
     */

    public static void main(String[] args) {
//        int number = 49;       // Set the value of "number" here!
//        System.out.println("The number is " + number);
//        if ( number % 2 == 0) {
//            System.out.println("Even Number");   // even number
//        } else {
//            System.out.println("Odd Number");   // odd number
//        }
//        System.out.println("Bye!");



        int a = 140;
        int b = 100;
        int c = 140;

        // 1
        /**
         * 1. a > b -> T => a > c -> T => a
         * 2. a > b -> T => a > c -> F => a = c; c > a
         * 3. c > a -> T => c
         * 4.
         */
//        if (a > b)
//            if (a > c)
//                System.out.println("The greatest: " + a);
//
//        if (b > a)
//            if (b > c)
//                System.out.println("The greatest: " + b);
//
//        if (c > a)
//            if (c > b)
//                System.out.println("The greatest: " + c);

//          2
        if(a > b){
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else if(a == b) {
            if (c > a){
                System.out.println(c);
            } else {
                System.out.println(a);
                System.out.println(b);
            }
        } else {
            if(b > c){
                System.out.println(b);
            } else{
                System.out.println(c);
            }
        }
        System.out.println("Done");
    }
}
