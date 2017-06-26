package lesson19;

import okhttp3.*;
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
                .cookieJar(new DefaultCookiesStorage())
                .addInterceptor(new UserAgentInterceptor("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.85 Safari/537.36")).build();

        String html = client.newCall(new Request.Builder().url("http://www.kismia.com/").build()).execute().body().string();

        Document document = Jsoup.parse(html);

        for (Cookie cookie: DefaultCookiesStorage.cookies
             ) {
            System.out.println(cookie.name());

        }

        RequestBody requestBody = new FormBody.Builder()
                .add("email", "blabla@mfsa.ru")
                .add("password", "Defect1206").build();
        Request request = new Request.Builder().url("https://kismia.com/sign/in/").post(requestBody).build();

        System.out.println(client.newCall(request).execute().body().string());




      /*  System.out.println(document.body());

        Elements select = document.select(".hero-title");
        Element element = select.get(0);


        System.out.println(element.text());
*/


    }
}
