package com.xvolve.basics;

public class DataTypes {
	public static void main(String[] args) {
		// initializer value
		byte myByte = 125;
        System.out.println(myByte);
        // Age

        short myShort = -32_765;
        System.out.println(myShort);
        // social insurance number

        int myInt = 2_147_483_647;
        System.out.println(myInt);
        // Phone

        long myLong = -9_223_372_036_854_775_808L;
        System.out.println(myLong);
        // Bank number

        float myFloat = 1234567.75F;
        System.out.println(myFloat);
        // Salary amount

        double myDouble = 123456789012.75234D;
        System.out.println(myDouble);
        // Saving amount

        boolean myBoolean = true;
        System.out.println(myBoolean);
        // Employment Status
        
        /**
         * ASCII codes table
         * https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
         */
        char myChar = 'a';
        char A = 65;
        System.out.println(myChar);
        System.out.println(A);
        // Gender // Blood Type

        String str = "Java For Everyone Java For Everyone Java For Everyone Java For Everyone";
        System.out.println(str);
        // Name
        
//
//        int[] arrays = new int[10];
//        int[] initializedArrays = new int[]{50, 2, 44};
//        System.out.println("Second element in the array: " + initializedArrays[1]);
//        initializedArrays[1] = 100;
//        System.out.println("New Second element in the array: " + initializedArrays[1]);
        
        /**
         * Maximum/Minimum Values of Primitive Number Types
         */
        /* int (32-bit signed integer) */
        System.out.println("int(min) = " + Integer.MIN_VALUE);
        //int(min) = -2147483648
        System.out.println("int(max) = " + Integer.MAX_VALUE);
        //int(max) = 2147483647
        System.out.println("int(bit-length) = " + Integer.SIZE);
        //int(bit-length) = 32

        /* byte (8-bit signed integer) */
        System.out.println("byte(min) = " + Byte.MIN_VALUE);
        //byte(min) = -128
        System.out.println("byte(max) = " + Byte.MAX_VALUE);
        //byte(max) = 127
        System.out.println("byte(bit-length) = " + Byte.SIZE);
        //byte(bit-length) = 8

        /* short (16-bit signed integer) */
        System.out.println("short(min) = " + Short.MIN_VALUE);
        //short(min) = -32768
        System.out.println("short(max) = " + Short.MAX_VALUE);
        //short(max) = 32767
        System.out.println("short(bit-length) = " + Short.SIZE);
        //short(bit-length) = 16

        /* long (64-bit signed integer) */
        System.out.println("long(min) = " + Long.MIN_VALUE);
        //long(min) = -9223372036854775808
        System.out.println("long(max) = " + Long.MAX_VALUE);
        //long(max) = 9223372036854775807
        System.out.println("long(bit-length) = " + Long.SIZE);
        //long(bit-length) = 64

        /* char (16-bit character or 16-bit unsigned integer) */
        System.out.println("char(min) = " + (int)Character.MIN_VALUE);
        //char(min) = 0
        System.out.println("char(max) = " + (int)Character.MAX_VALUE);
        //char(max) = 65535
        System.out.println("char(bit-length) = " + Character.SIZE);
        //char(bit-length) = 16

        /* float (32-bit floating-point) */
        System.out.println("float(min) = " + Float.MIN_VALUE);
        //float(min) = 1.4E-45
        System.out.println("float(max) = " + Float.MAX_VALUE);
        //float(max) = 3.4028235E38
        System.out.println("float(bit-length) = " + Float.SIZE);
        //float(bit-length) = 32

        /* double (64-bit floating-point) */
        System.out.println("double(min) = " + Double.MIN_VALUE);
        //double(min) = 4.9E-324
        System.out.println("double(max) = " + Double.MAX_VALUE);
        //double(max) = 1.7976931348623157E308
        System.out.println("double(bit-length) = " + Double.SIZE);
        //double(bit-length) = 64

        /* No equivalent constants for boolean type */
        
	}

}
