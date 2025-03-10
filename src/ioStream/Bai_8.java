package ioStream;

import java.io.*;
import java.util.concurrent.*;

class KeywordSearchTask implements Callable<Integer> {
    private final File file;
    private final String keyword;

    public KeywordSearchTask(File file, String keyword) {
        this.file = file;
        this.keyword = keyword;
    }

    @Override
    public Integer call() {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count += (line.split(keyword, -1).length - 1);
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + file.getName() + " - " + e.getMessage());
        }
        return count;
    }
}


