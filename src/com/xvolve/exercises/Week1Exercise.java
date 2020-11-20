package com.xvolve.exercises;

import java.util.Scanner;

public class Week1Exercise {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input your preferred string: ");
        String myString = userInput.nextLine();
        System.out.println("Please input your character for searching: ");
        char searchKeyword = userInput.nextLine().charAt(0);
        boolean isExisted = false;
        int foundTimes = 0;

        for (int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == searchKeyword){
                foundTimes++;
                isExisted = true;
                System.out.println("Found character " + searchKeyword + " at " + i + " index!");
            }
        }

        Integer.parseInt("190");

        if (foundTimes == 0 && isExisted == false){
            System.out.println("Character not found in the string");
        } else {
            System.out.println("The character is found " + foundTimes + " times in the string.");
        }

        while (isExisted){
            int myIndex = myString.length() - 1;
            String revervedString = "";
            do {
                revervedString += myString.charAt(myIndex);
                myIndex--;
            } while(myIndex >= 0);
            System.out.println("Reserved string is: " + revervedString);
            isExisted = false;
        }
    }
}
