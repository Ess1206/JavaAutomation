package lesson17;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Stan on 14.06.2017.
 */
public class TestHttp {

    OkHttpClient okHttpClient = new OkHttpClient();
    @Test
    public void httpTest() throws IOException {
        Request request = new Request.Builder().url("https://kismia.com").build();
        Response response = okHttpClient.newCall(request).execute();

        System.out.println("body");
        System.out.println(response.body().string());

        System.out.println("heder");
        System.out.println(response.headers());

        System.out.println("code");
        System.out.println(response.code());

    }
}
