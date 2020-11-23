package com.xvolve.basics;

import java.io.*;

public class JavaReadFile {
    private final static String USER_DIR = System.getProperty("user.dir");
    private final static String FILE_URL = USER_DIR + "/src/mytext.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_URL);
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String line = "";
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
    }
}
