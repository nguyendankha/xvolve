package com.xvolve.basics;

public class Java3DimensionArray {
    public static void main(String[] args) {
        // create a 3d array
        int[][][] a = {
                // index i = 0;
                {
                        { 1, 2, 3 }, // khay cua tu 1, index i = 0; j = 0
                        { 4, 5, 6, 9 }, // khay 2
                        { 7, 2, 5 }, // khay 3
                },
                // index i = 1;
                {
                        { 100, 102, 103 },
                        { 104, 105, 106, 109 },
                        { 107, 320, 456 },
                },
                // index i = 2;
                {
                        { 301, 302, 303 },
                        { 304, 405, 606, 899 },
                        { 756, 891, 596 },
                }
        };

        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0][0].length);
        System.out.println("Length of row 2: " + a[1][0].length);
        System.out.println("Length of row 3: " + a[2][0].length);

        // Print all elements of 3d array Using Loop
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
