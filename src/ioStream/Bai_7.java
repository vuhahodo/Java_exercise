package ioStream;

import java.io.*;

class FileChunkReader extends Thread {
    private final String inputFile;
    private final long start;
    private final long end;
    private final int index;
    private final String[] results;

    public FileChunkReader(String inputFile, long start, long end, int index, String[] results) {
        this.inputFile = inputFile;
        this.start = start;
        this.end = end;
        this.index = index;
        this.results = results;
    }

    @Override
    public void run() {
        try (RandomAccessFile raf = new RandomAccessFile(inputFile, "r")) {
            raf.seek(start);
            StringBuilder sb = new StringBuilder();
            byte[] buffer = new byte[(int) (end - start)];
            raf.read(buffer);
            sb.append(new String(buffer));
            results[index] = sb.toString();
            System.out.println("Đã đọc xong phần " + index);
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}

public class Bai_7 {
    public static void main(String[] args) {
        String inputFile = "largefile.txt";
        String outputFile = "merged_output.txt";
        int numThreads = 4;

        try (RandomAccessFile raf = new RandomAccessFile(inputFile, "r")) {
            long fileSize = raf.length();
            long chunkSize = fileSize / numThreads;
            String[] results = new String[numThreads];
            Thread[] threads = new Thread[numThreads];

            for (int i = 0; i < numThreads; i++) {
                long start = i * chunkSize;
                long end = (i == numThreads - 1) ? fileSize : start + chunkSize;
                threads[i] = new FileChunkReader(inputFile, start, end, i, results);
                threads[i].start();
            }

            for (Thread thread : threads) {
                thread.join();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                for (String part : results) {
                    writer.write(part);
                }
            }

            System.out.println("Tất cả dữ liệu đã được ghi vào " + outputFile);
        } catch (IOException | InterruptedException e) {
            System.err.println("Lỗi xử lý file: " + e.getMessage());
        }
    }
}
