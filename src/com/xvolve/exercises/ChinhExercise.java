package com.xvolve.exercises;

import java.util.Scanner;

public class ChinhExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //khai bao 1 bien String va nhap tu ban phim
        String myString = "";
        myString = scanner.nextLine();


        //khai bao 1 bien char va nhap tu ban phim
        char myChar = ' ';
        myChar = scanner.nextLine().charAt(0);


        //khai bao 1 bien boolean
        boolean isCharacterFound = false;
        // khai bao 1 bien integer
        int foundTimes = 0;

        // Exercise 1
        //Tim kiem bien character co xuat hien trong String hay ko?
        int lengOfMyString = myString.length();


        for (int i = 0; i < lengOfMyString; i++) {
            String char_i = Character.toString(myChar);
            String myString_i = Character.toString(myString.charAt(i));

            isCharacterFound = char_i.equals(myString_i);
            if (isCharacterFound == true) {
                foundTimes++;
                System.out.println("Possition happens like " + myChar + " is: " + i);
            }
        }

        if (foundTimes > 0) {
            isCharacterFound = true;
            System.out.println("The number of occurrences " + myChar + " is: " + foundTimes);
        } else {
            System.out.println("Not found character in String");
        }


        // Exercise 2
        // Neu isFoundCharacter la true thi dung vong lap while ket hop do-while de in ra chuoi nguoc lai cua String
        String reservedMyString = "";
        int i = 1;
        do {
            //System.out.println(myString);
            int j = 1;
            while (j <= lengOfMyString && isCharacterFound == true) {
                reservedMyString = reservedMyString + Character.toString(myString.charAt(lengOfMyString - j));
                j++;
                //System.out.println(Character.toString(myString.charAt(lengOfMyString-j)));
            }

            System.out.println(reservedMyString);
            i++;

        } while (isCharacterFound == true && i < 2);
    }
}