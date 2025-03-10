package ioStream;
import java.io.*;

public class Bai_2 {
    public static void main(String[] args) {
        String outputFile = "output.txt"; // File đích để lưu dữ liệu

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(outputFile)) {

            System.out.println("Nhập nội dung (gõ 'exit' để kết thúc):");
            String line;
            
            while (true) {
                line = reader.readLine().trim(); // Loại bỏ khoảng trắng thừa
                if (line.equalsIgnoreCase("exit")) break; // Kiểm tra trước khi ghi vào file
                writer.write(line + System.lineSeparator()); // Ghi dòng vào file
                writer.flush(); // Đảm bảo dữ liệu được ghi ngay lập tức
            }
            
            System.out.println("Dữ liệu đã được ghi vào " + outputFile);
        } catch (IOException e) {
            System.err.println("Lỗi khi xử lý file: " + e.getMessage());
        }
    }
}
