package ioStream;

import java.io.*;

public class Bai_3 {
    public static void main(String[] args) {
        String inputFile = "output.txt"; // File cần đếm số dòng
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Số dòng trong file " + inputFile + ": " + lineCount);
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
