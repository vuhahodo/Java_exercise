package ioStream;

import java.io.*;

class FileReaderThread extends Thread {
    private final String inputFile;
    private final BufferedWriter writer;

    public FileReaderThread(String inputFile, BufferedWriter writer) {
        this.inputFile = inputFile;
        this.writer = writer;
    }

    @Override
    public void run() {
        synchronized (writer) {
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
                writer.flush();
                System.out.println("Đã đọc xong file: " + inputFile);
            } catch (IOException e) {
                System.err.println("Lỗi khi đọc file " + inputFile + ": " + e.getMessage());
            }
        }
    }
}

public class Bai_6 {
    public static void main(String[] args) {
        String[] inputFiles = {"input1.txt", "input2.txt", "input3.txt"};
        String outputFile = "output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            Thread[] threads = new Thread[inputFiles.length];

            for (int i = 0; i < inputFiles.length; i++) {
                threads[i] = new FileReaderThread(inputFiles[i], writer);
                threads[i].start();
            }

            for (Thread thread : threads) {
                thread.join();
            }

            System.out.println("Tất cả dữ liệu đã được ghi vào " + outputFile);
        } catch (IOException | InterruptedException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}
