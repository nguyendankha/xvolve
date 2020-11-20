package com.xvolve.basics;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class JavaFile {
    public static void main(String[] args) throws IOException {

        // Tạo một đối tượng File đại diện cho một đường dẫn.
        String userDirectory = System.getProperty("user.dir");
        File apath = new File(userDirectory + "/src/mytext.txt");

        // Kiểm tra sự tồn tại.
        System.out.println("Path exists? " + apath.exists());

        if(apath.createNewFile()){
            if (apath.exists()) {

                // Kiểm tra 'apath' có phải là một thư mục hay không?
                System.out.println("Directory? " + apath.isDirectory());

                // Kiểm tra 'apath' là một đường dẫn ẩn hay không?
                System.out.println("Hidden? " + apath.isHidden());

                // Tên đơn giản.
                System.out.println("Simple Name: " + apath.getName());

                // Đường dẫn tuyêt đối.
                System.out.println("Absolute Path: " + apath.getAbsolutePath());

                // Kiểm tra kích thước file (Theo đơn vị byte):
                System.out.println("Length (bytes): " + apath.length());

                // Thời điểm sửa lần cuối (mili giây)
                long lastMofifyInMillis = apath.lastModified();
                Date lastModifyDate = new Date(lastMofifyInMillis);

                System.out.println("Last modify date: " + lastModifyDate);
            }
        }
    }
}
