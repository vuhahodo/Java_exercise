package ioStream;

import java.io.*;

public class Bai_5 {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users"; // Thư mục cần liệt kê

        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                System.out.println("Danh sách các file trong thư mục " + directoryPath + ":");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("Thư mục rỗng hoặc không thể truy cập.");
            }
        } else {
            System.out.println("Đường dẫn không hợp lệ hoặc không phải thư mục.");
        }
    }
}
