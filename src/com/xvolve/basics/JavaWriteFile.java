package com.xvolve.basics;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class JavaWriteFile {
    private final static String USER_DIR = System.getProperty("user.dir");
    private final static String FILE_URL = USER_DIR + "/src/outputText.txt";

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter(FILE_URL);
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to java.");
        buffer.close();
        System.out.println("Success...");
    }
}
