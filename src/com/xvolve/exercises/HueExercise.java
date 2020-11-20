package com.xvolve.exercises;

import java.util.Scanner;

public class HueExercise {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String myStr;
        char myChar;
        boolean isCharacterFound = false;
        int foundTimes = 0;

        System.out.println("Nhap chuoi ky tu");
        myStr = scanner.nextLine();

        System.out.println("Nhap ky tu");
        myChar = scanner.nextLine().charAt(0);

        int lenOfStr = myStr.length();
        System.out.println(lenOfStr);

        for(int i = 0; i < myStr.length(); i++){
            if(myStr.charAt(i) == myChar) {
                isCharacterFound = true;
                foundTimes++;
                System.out.println("So thu tu cua ky tu " + myChar + " la " + i);
            }
        }

        if (foundTimes == 0){
            System.out.println("Not found");
        }else {
            System.out.println("Found times: ");
            System.out.println(foundTimes);
        }

        if (isCharacterFound == true){
            String reservedString = "";
            int myIndex = lenOfStr - 1;

            while(isCharacterFound == true) {
                do{
                    reservedString += myStr.charAt(myIndex);
                    myIndex--;
                } while(myIndex >= 0);
            isCharacterFound = false;
            }

            System.out.println(reservedString);
        }
    }
}
