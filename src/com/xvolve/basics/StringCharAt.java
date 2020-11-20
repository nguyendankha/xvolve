package com.xvolve.basics;

public class StringCharAt {
    public static void main(String[] args) {
        String str1 = "Learn Java";
        String str2 = "Learn\nJava";

        // first character
        System.out.println(str1.charAt(0)); // 'L'

        // seventh character
        // position - 1 = index
        System.out.println(str1.charAt(6)); // 'J'

        // sixth character
        System.out.println(str1.charAt(5)); // '\n'

    }
}
