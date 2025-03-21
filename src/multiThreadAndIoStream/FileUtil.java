package multiThreadAndIoStream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileUtil {
    public static void saveToCSV(List<String[]> data, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (String[] row : data) {
                writer.append(String.join(",", row));
                writer.append("\n");
            }
            System.out.println("Data saved to: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
