package ioStream;

import java.io.*;

public class GenerateLargeTextFile {
    public static void main(String[] args) {
        String fileName = "largefile.txt";
        int numLines = 100000; // Số dòng cần tạo

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 1; i <= numLines; i++) {
                writer.write("Dòng " + i + ": Đây là nội dung mẫu cho file lớn.\n");
            }
            System.out.println("File " + fileName + " đã được tạo thành công.");
        } catch (IOException e) {
            System.err.println("Lỗi khi tạo file: " + e.getMessage());
        }
    }
}
