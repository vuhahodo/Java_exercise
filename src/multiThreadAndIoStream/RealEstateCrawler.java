package multiThreadAndIoStream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RealEstateCrawler {
    public static void main(String[] args) {
        List<String> urls = List.of(
            "https://example.com/page1",
            "https://example.com/page2",
            "https://example.com/page3"
        );

        List<String[]> data = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (String url : urls) {
            executor.execute(new RealEstateScraper(url, data));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Chờ cho tất cả các luồng hoàn thành
        }

        // Lưu kết quả vào file CSV
        FileUtil.saveToCSV(data, "real_estate_data.csv");
        System.out.println("Crawling completed.");
    }
}
