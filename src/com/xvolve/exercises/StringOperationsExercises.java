package com.xvolve.exercises;

import java.util.Scanner;

public class StringOperationsExercises {
    /**
     * Program
     * 1. Khai bao 3 chuoi String
     * 2. Khai 3 numeric variables lay gia tri length() cua tung String step1
     * 3. Compare 3 length cua 3 String => String ma co length lon nhat trong 3 chuoi
     * 4. Loop -> In ra tung character trong tung chuoi
     * 5. Khai bao 3 boolean variables => 1-3, 1-2, 2-3 => bang nhau hay khong
     */

    /**
     * 3 boolean variables
     * boolean 1,2,3;
     * String 1's value == String 2's value => boolean 1 -> in boolean T-F
     * String 1's value == String 3's value => boolean 2 -> in boolean T-F
     * String 2's value == String 3's value => boolean 3 -> in boolean T-F
     */

    public static void main(String[] args) {
        /**
         * Program
         * 1. Khai bao 3 chuoi String
         * 2. Khai 3 numeric variables lay gia tri length() cua tung String step1
         * 3. Compare 3 length cua 3 String => String ma co length lon nhat trong 3 chuoi
         * 4. Loop -> In ra tung character trong tung chuoi
         * 5. Khai bao 3 boolean variables => 1-3, 1-2, 2-3 => bang nhau hay khong
         */
        //1. Khai bao 3 chuoi String
//        String a = "";
//        String b = "";
        //////

        // 2. Khai bao 3 numeric variables lay gia tri length() cua tung String step1
        // int so1 = string 1's length;
        // int so2 = string 2's length;

        // 3. Compare 3 length cua 3 String => String ma co length lon nhat trong 3 chuoi => If-Else -> String co length lon nhat

        // 4.
        // While(i < string1 length) {in ra tung character trong string 1}
        // While(i < string2 length) {in ra tung character trong string 2}
        // // While(i < string3 length) {in ra tung character trong string 3}

        // Khai bao 3 boolean variables => 1-3, 1-2, 2-3 => bang nhau hay khong
        // boolean myBool1, myBool2, myBool3;
        // if(str1 == str2) => myBool1 -> T-F
        // if(str1 == str2) => myBool1 -> T-F

        // 0. Variable of keyboard inputting
        Scanner inputFromKeyboard = new Scanner(System.in);

        /**
         * 1. Declare 3 String variables from user input
         */
        System.out.println("----------");
        // String 1
        System.out.println("Please input the 1st String variable value");
        String myFirstStringVariable = inputFromKeyboard.nextLine();
        // String 2
        System.out.println("Please input the 2nd String variable value");
        String mySecondStringVariable = inputFromKeyboard.nextLine();
        // String 3
        System.out.println("Please input the 3rd String variable value");
        String myThirdStringVariable = inputFromKeyboard.nextLine();
        System.out.println("----------");

        /**
         * 2. Declare 3 int variables for getting each string length
         */
        System.out.println("----------");
        // Length of String 1
        int myFirstStringLength = myFirstStringVariable.length();
        // Length of String 2
        int mySecondStringLength = mySecondStringVariable.length();
        // Length of String 3
        int myThirdStringLength = myThirdStringVariable.length();
        System.out.println("----------");

        /**
         * 3. Compare 3 string length and print the biggest length string value 
         */
        System.out.println("----------");
        if (myFirstStringLength > mySecondStringLength) {
            if (myFirstStringLength > myThirdStringLength) {
                System.out.println(myFirstStringLength);
                System.out.println("The biggest length string is: " + myFirstStringVariable);
            } else if (myFirstStringLength == myThirdStringLength) {
                System.out.println(myFirstStringLength);
                System.out.println(myThirdStringLength);
                System.out.println("The biggest length string is: " + myFirstStringVariable);
                System.out.println("The biggest length string is: " + myThirdStringVariable);
            } else {
                System.out.println(myThirdStringLength);
                System.out.println("The biggest length string is: " + myThirdStringVariable);
            }
        } else if (myFirstStringLength == mySecondStringLength) {
            if (myThirdStringLength > myFirstStringLength) {
                System.out.println(myThirdStringLength);
                System.out.println("The biggest length string is: " + myThirdStringVariable);
            } else {
                System.out.println(myFirstStringLength);
                System.out.println(mySecondStringLength);
                System.out.println("The biggest length string is: " + myFirstStringVariable);
                System.out.println("The biggest length string is: " + mySecondStringVariable);
            }
        } else if (mySecondStringLength == myThirdStringLength) {
            if (myFirstStringLength > mySecondStringLength) {
                System.out.println(myFirstStringLength);
                System.out.println("The biggest length string is: " + myFirstStringVariable);
            } else {
                System.out.println(mySecondStringLength);
                System.out.println(myThirdStringLength);
                System.out.println("The biggest length string is: " + mySecondStringVariable);
                System.out.println("The biggest length string is: " + myThirdStringVariable);
            }
        } else {
            if (mySecondStringLength > myThirdStringLength) {
                System.out.println(mySecondStringLength);
                System.out.println("The biggest length string is: " + mySecondStringVariable);
            } else {
                System.out.println(myThirdStringLength);
                System.out.println("The biggest length string is: " + myThirdStringVariable);
            }
        }
        System.out.println("----------");

        /**
         * 4. Print each character in each string
         */
        // String 1
        for (int i = 0; i < myFirstStringLength; i++) {
            System.out.print("The " + i + " character of 1st string is: ");
            System.out.println(myFirstStringVariable.charAt(i));
        }
        System.out.println("----------");

        // String 2
        for (int i = 0; i < mySecondStringLength; i++) {
            System.out.print("The " + i + " character of 2nd string is: ");
            System.out.println(mySecondStringVariable.charAt(i));
        }
        System.out.println("----------");

        // String 3
        for (int i = 0; i < myThirdStringLength; i++) {
            System.out.print("The " + i + " character of 3rd string is: ");
            System.out.println(myThirdStringVariable.charAt(i));
        }
        System.out.println("----------");

        /**
         * 5. Declare 3 boolean variables and compare
         * 1-2
         * 1-3
         * 2-3
         */
        boolean myFirstBoolean = myFirstStringVariable.equals(mySecondStringVariable),
                mySecondBoolean = myFirstStringVariable.equals(myThirdStringVariable),
                myThirdBoolean = mySecondStringVariable.equals(myThirdStringVariable);
        System.out.println("----------");
        System.out.println("The comparison between 1st string and 2nd string is: " + myFirstBoolean);
        System.out.println("The comparison between 1st string and 3rd string is: " + mySecondBoolean);
        System.out.println("The comparison between 2nd string and 3rd string is: " + myThirdBoolean);
        System.out.println("----------");

//        // String 1-2
//        if (myFirstStringVariable.equals(mySecondStringVariable)) {
//            myFirstBoolean = true;
//            System.out.println("The comparison between 1st string and 2nd string is: " + myFirstBoolean);
//        } else {
//            myFirstBoolean = false;
//            System.out.println("The comparison between 1st string and 2nd string is: " + myFirstBoolean);
//        }
//
//        // String 1-3
//        if (myFirstStringVariable.equals(myThirdStringVariable)) {
//            mySecondBoolean = true;
//            System.out.println("The comparison between 1st string and 3rd string is: " + mySecondBoolean);
//        } else {
//            mySecondBoolean = false;
//            System.out.println("The comparison between 1st string and 3rd string is: " + mySecondBoolean);
//        }
//
//        // String 2-3
//        if (mySecondStringVariable.equals(myThirdStringVariable)) {
//            myThirdBoolean = true;
//            System.out.println("The comparison between 2nd string and 3rd string is: " + myThirdBoolean);
//        } else {
//            myThirdBoolean = false;
//            System.out.println("The comparison between 2nd string and 3rd string is: " + myThirdBoolean);
//        }
    }
}
