package com.xvolve.exercises;

import java.util.Scanner;

public class ChinhArrayExercise {
    public static void main(String[] args) {
        /**
         * Exercise 1: Compute Sum and Average of Double Array Elements
         * declare 1 Double array which whatever length
         * Scanner -> user input => user nhap vao tat ca cac elements
         * Calculate -> sum of all elements
         * Calculate -> average of all elements
         */
//        int numberOfMyArray = 0;
//        System.out.println("Moi ban nhap vao so luong phan tu cua mang");
        Scanner scanner = new Scanner(System.in);
//
//        numberOfMyArray = scanner.nextInt();
//
//        double myArray[] = new double[numberOfMyArray];
//
//        //user nhap vao tat ca cac elements
//        for(int i=0; i< numberOfMyArray; i++) {
//            System.out.println("Moi ban nhap vao gia tri phan tu thu: "+ i);
//            myArray[i] = scanner.nextDouble();
//        }
//        //Calculate -> sum of all elements
//        double sumOfMyArray = 0;
//        for(int i=0; i < numberOfMyArray; i++) {
//            sumOfMyArray += myArray[i];
//        }
//        System.out.println("Tong gia tri cua "+ numberOfMyArray + " ban vua nhap la: "+ sumOfMyArray);
//
//        //Calculate -> average of all elements
//        double averageOfMyArray = 0;
//        if(numberOfMyArray!= 0) {
//            averageOfMyArray = sumOfMyArray/numberOfMyArray;
//        }
//        System.out.println("Gia tri trung binh cua mang ban vua nhap la: "+ averageOfMyArray);

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

        //Declare 1 int array -> cho user input tat ca cac elements
        int numberOfMyArrayInt = 0;
        System.out.println("Moi ban nhap vao so luong phan tu cua mang");
        numberOfMyArrayInt = scanner.nextInt();
        System.out.println("So luong phan tu cua mang la " + numberOfMyArrayInt);
        int myArrayInt[] = new int[numberOfMyArrayInt];
        for (int i = 0; i < numberOfMyArrayInt; i++) {
            System.out.println("Moi ban nhap vao gia tri phan tu thu: " + i);
            myArrayInt[i] = scanner.nextInt();
        }
        //Declare 1 int variable -> cho user input int variable
        int myVariable = 0;
        System.out.println("Moi ban nhap vao 1 gia tri nguyen bat ky: ");
        myVariable = scanner.nextInt();

        boolean sameNumber = false;
        int sum = 0;
        int i = 0;
        while (sameNumber == false && i < numberOfMyArrayInt) {
            if (myVariable == myArrayInt[i]) {
                sameNumber = true;
                for (int j = 0; j < i; j++) {
                    sum += myArrayInt[j];
                }
                System.out.println("Tong cac so trong mang den so giong so ban vua nhap la:  " + sum);
            }
            i++;
        }

        if ((sum == 0) && (sameNumber == false)) {
            for (int k = 0; k < numberOfMyArrayInt; k++) {
                sum += myArrayInt[k];
            }
            System.out.println("Khong co so nao co gia tri giong so ban vua nhap. Tong cua mang la:  " + sum);
        }
    }
}
