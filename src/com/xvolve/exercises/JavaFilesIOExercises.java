package com.xvolve.exercises;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFilesIOExercises {
    /**
     * Write a function to enter Student names and marks
     * functionName()
     * body function -> 2 arrays String[] name, int[]marks
     * Loop -> tim ra students: mark > 60
     *
     * Write to file: student name + student mark => .txt
     * Read file.
     */
    static Scanner input = new Scanner(System.in);
    private final static String USER_DIR = System.getProperty("user.dir");
    private final static String FILE_URL = USER_DIR + "/src/outputText.txt";

    public static void main(String[] args) throws IOException {
        int numberOfStudents = enterNumberOfStudents();
        String[] myStudentNames = enterStudentNames(numberOfStudents);
        int[] myStudentMarks = enterStudentMarks(numberOfStudents);
        int markToSearch = enterMarkToSearch();
        searchAndWriteToFile(myStudentNames, myStudentMarks, markToSearch);
    }

    public static int enterNumberOfStudents(){
        int numberOfStudents = 0;
        do {
            System.out.println("Please enter valid number of students: (greater than 0)");
            numberOfStudents = input.nextInt();
        } while (numberOfStudents <= 0);

        return numberOfStudents;
    }

    public static String[] enterStudentNames(int numberOfStudents){
        String[] studentNames = new String[numberOfStudents];
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Please enter the " + i + " student name:");
            studentNames[i-1] = input.next();
        }
        System.out.println("--------------");
        return studentNames;
    }

    public static int[] enterStudentMarks(int numberOfStudents){
        int[] studentMarks = new int[numberOfStudents];
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Please enter the " + i + " student mark:");
            studentMarks[i-1] = input.nextInt();
        }

        System.out.println("--------------");
        return studentMarks;
    }

    public static int enterMarkToSearch(){
        int mark = 0;
        do {
            System.out.println("Please enter the mark number that you want to search: ");
            mark = input.nextInt();
        } while(mark <= 0);
        return mark;
    }

    public static void searchAndWriteToFile(String[] studentNames, int[] studentMarks, int markToSearch) throws IOException {
        FileWriter writer = new FileWriter(FILE_URL);
        BufferedWriter buffer = new BufferedWriter(writer);
        for (int i = 0; i < studentMarks.length; i++) {
                if (studentMarks[i] == markToSearch){
                    buffer.write("-----------\n");
                    buffer.write(studentNames[i] + "\n");
                    buffer.write(String.valueOf(studentMarks[i]));
                    buffer.write("\n");
                    buffer.write("-----------");
            }
        }
        buffer.close();
    }
}
