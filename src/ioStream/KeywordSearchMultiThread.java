package ioStream;

import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class KeywordSearchMultiThread {
    public static void main(String[] args) {
        File folder = new File("data"); // Thư mục chứa các file
        String keyword = "a"; // Từ khóa cần tìm
        
        if (!folder.exists() || !folder.isDirectory()) {
            System.err.println("Thư mục không tồn tại hoặc không hợp lệ.");
            return;
        }
        
        ExecutorService executor = Executors.newFixedThreadPool(4);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));
        
        if (files == null) {
            System.err.println("Không tìm thấy file nào trong thư mục.");
            return;
        }
        
        int totalOccurrences = 0;
        try {
            for (File file : files) {
                Future<Integer> result = executor.submit(new KeywordSearchTask(file, keyword));
                totalOccurrences += result.get();
                System.out.println("Từ khóa xuất hiện " + result.get() + " lần trong file " + file.getName());
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Lỗi khi tìm kiếm: " + e.getMessage());
        }
        
        executor.shutdown();
        System.out.println("Tổng số lần xuất hiện của từ khóa: " + totalOccurrences);
    }
}