package xvolveChinh.Exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileOutputStream;



public class function {
	/**
	 * Write a function to enter Student names and marks
	 * functionName()
	 * body function -> 2 arrays String[] name, int[]marks
	 * Loop -> tim ra students: mark > 60
	 *
	 * Write to file: student name + student mark => .txt
	 * Read file.
	 */
	private final static String USER_DIR = System.getProperty("user.dir");
	private final static String FILE_URL = USER_DIR + "/src/outputText.txt";
	 public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);
		 int numberOfStudent = 0;
		 System.out.println("Hay dien vao so luong hoc sinh ban muon luu: ");
		 numberOfStudent = scanner.nextInt();
		 String studentNameArray[] = new String[numberOfStudent];
		 studentNameArray = functionName(numberOfStudent);
		 int studentMarkArray[] = new int[numberOfStudent];
		 studentMarkArray = functionMark(numberOfStudent);
		 
		 for(int i=0; i<numberOfStudent; i++) {
			 System.out.println("Ten cua hoc sinh thu "+ i + " la: " + studentNameArray[i]);
			 System.out.println("Diem cua hoc sinh thu "+ i + " la: " + studentMarkArray[i]);
		 }
		 
		 int idOfStudentBestMark = functionBestMark(studentMarkArray, numberOfStudent);
		 
		 System.out.println("Hoc sinh co so diem cao nhat la: " + studentNameArray[idOfStudentBestMark] + "co so diem la: " + studentMarkArray[idOfStudentBestMark]);
		 
	 }
	 
	 public static String[] functionName (int numberOfStudent) {
		 String studentNameArray[] = new String[numberOfStudent];
		 Scanner scannerName = new Scanner(System.in);
		 for(int i= 0; i < numberOfStudent; i++) {
			 System.out.println("Hay nhap ten cua hoc sinh thu: " + i);
			 studentNameArray[i] = scannerName.next();
		 }
		 return studentNameArray;
	 }
	 
	 public static int[] functionMark (int numberOfStudent) {
		 int studentMarkArray[] = new int[numberOfStudent];
		 Scanner scannerMark = new Scanner(System.in);
		 for(int i= 0; i < numberOfStudent; i++) {
			 System.out.println("Hay nhap diem cua hoc sinh thu: " + i);
			 studentMarkArray[i] = scannerMark.nextInt();
		 }
		 return studentMarkArray;
	 }
	 
	 public static int functionBestMark(int[] studentMarkArray, int numberOfStudent) {
		 int bestMark = 0;
		 int idOfStudentBestMark = 0;
		 for(int i = 0; i<numberOfStudent; i++) {
			 if(bestMark < studentMarkArray[i]) {
				 bestMark = studentMarkArray[i];
				 idOfStudentBestMark = i;
			 }
		 }
		 return idOfStudentBestMark;
	 }
	 
	 public static void writeFileNameStudent(String dir, String url, String[] studentNameArray, int numberOfStudent)  throws IOException {
		 
		 FileWriter writer = new FileWriter(dir);
	     BufferedWriter buffer = new BufferedWriter(writer);
	     for(int i = 0; i< numberOfStudent; i++) {
	    	 buffer.write(studentNameArray[i]);
	     }
	     buffer.close();
	     System.out.println("Success...");
	 }

	 public static void writeFileMarkStudent(String dir, String url, int[] studentMarkArray, int numberOfStudent)  throws IOException {
		 
		 FileWriter writer = new FileWriter(dir);
	     BufferedWriter buffer = new BufferedWriter(writer);
	     for(int i = 0; i< numberOfStudent; i++) {
	    	 buffer.write(studentMarkArray[i]);
	     }
	     buffer.close();
	     System.out.println("Success...");
	 }
	 
	 public static void readFileNameStudent(String dir, String url, String[] studentNameArray, int numberOfStudent) throws IOException {
	        File file = new File(url);
	        InputStream inputStream = new FileInputStream(file);
	        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
	        BufferedReader reader = new BufferedReader(inputStreamReader);

	        String line = "";
	        while((line = reader.readLine()) != null){
	            System.out.println(line);
	        }
	 }
	 
	 public static void readFileMarkStudent(String dir, String url, int[] studentMarkArray, int numberOfStudent) throws IOException {
	        File file = new File(url);
	        InputStream inputStream = new FileInputStream(file);
	        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
	        BufferedReader reader = new BufferedReader(inputStreamReader);

	        String line = "";
	        while((line = reader.readLine()) != null){
	            System.out.println(line);
	        }
	 }
}



























