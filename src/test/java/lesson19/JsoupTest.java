package lesson19;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Stan on 21.06.2017.
 */
public class JsoupTest {

    @Test
    public void testJsoup() throws IOException {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new UserAgentInterceptor("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.85 Safari/537.36")).build();

        String html = client.newCall(new Request.Builder().url("http://www.business-template.com/").build()).execute().body().string();

        Document document = Jsoup.parse(html);

        System.out.println(document.body());

        Elements select = document.select(".hero-title");
        Element element = select.get(0);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(element.text());

    }
}
