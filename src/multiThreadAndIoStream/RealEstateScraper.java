package multiThreadAndIoStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.List;

public class RealEstateScraper implements Runnable {
    private final String url;
    private final List<String[]> data;

    public RealEstateScraper(String url, List<String[]> data) {
        this.url = url;
        this.data = data;
    }

    @Override
    public void run() {
        try {
            Document doc = Jsoup.connect(url).get();
            Elements listings = doc.select(".listing");

            for (Element listing : listings) {
                String title = listing.select(".title").text();
                String price = listing.select(".price").text();
                String location = listing.select(".location").text();

                synchronized (data) {
                    data.add(new String[]{title, price, location});
                }
            }
            System.out.println("Scraping completed for: " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
