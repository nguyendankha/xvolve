package com.xvolve.hue;

import java.util.Scanner;

public class FunctionExercise {
	
	/**
	 * Write a function to enter Student names and marks
	 * functionName()
	 * body function -> 2 arrays String[] name, int[]marks
	 * Loop -> tim ra students: mark > 60
	 *
	 * Write to file: student name + student mark => .txt
	 * Read file.
	 */
     public static void thongTinHocSinh(String[] hoTenHocSinh, int[] diemSo) {
    	 
    	 Scanner scanner = new Scanner(System.in);
    	 System.out.print("Nhap vao so luong hoc sinh: ");
    	 int soLuongHocSinh = scanner.nextInt();
    	 
    	 String[] tenHocSinh = new String[soLuongHocSinh];
    	 int[] diem = new int[soLuongHocSinh];
    	 
    	 for(int i = 0; i < soLuongHocSinh; i++) {
    		 System.out.println("Nhap vao ho ten hoc sinh thu " + i);
    		 tenHocSinh[i] = scanner.nextLine();
    		 
    		 System.out.println("Nhap vao diem cua hoc sinh thu " + i);
    		 diem[i] = scanner.nextInt();
    	 }
    	 
    	 for(int i = 0; i < soLuongHocSinh; i++) {
    		 if(diem[i] > 60) {
    			 System.out.println("Hoc Sinh co diem cao hon 60 la: " + tenHocSinh[i]);;
    		 }
    	 }
//     }
//     public static void main(String[] args) {
//    	 thongTinHocSinh();
//    	 
//     }
     }
}







//
//    public static String tenHocSinh(String[] bangHoTen) {
//    	Scanner scanner = new Scanner(System.in);
//    	
//    	System.out.print("Nhap vao so luong hoc sinh: ");
////    	int 
////    	for (int i = 0; i < bangHoTen.length; i++) {
//    		
//    }
//    }
   