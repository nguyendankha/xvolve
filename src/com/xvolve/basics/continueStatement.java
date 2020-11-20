package com.xvolve.basics;

public class continueStatement {
    public static void main(String[] args) {
        int[] array = {1, 2, 13, 3};
        int sum = 0;
        // for-each
        for (int i : array) {
            if (i == 13) {
                continue;
            }
            sum += i;
        }
        System.out.print("Total: " + sum);
    }
}
