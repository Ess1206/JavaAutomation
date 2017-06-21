package lesson16.login;

import core.BrowserFactory;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import sun.util.locale.StringTokenIterator;

import java.io.*;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * Created by Stan on 15.06.2017.
 */
public class LoadCookiesData extends BrowserFactory {

@Test
    public void openFile() throws InterruptedException {


        try {
            File file = new File("Cookie.data");
            FileReader fileReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fileReader);
            String line;

            while ((line = bReader.readLine()) != null) {
                StringTokenizer token = new StringTokenizer(line, ";");

                while (token.hasMoreTokens()) {
                    String name = token.nextToken();
                    String value = token.nextToken();
                    String domain = token.nextToken();
                    String path = token.nextToken();
                    Date expiry = null;

                    //ne poniatno !!!!!

/*                    String val;
                    if (!(val = token.nextToken()).equals("null")) {
                        expiry = new Date(val);

                    }
                    Boolean isSecure = new Boolean(token.nextToken()).booleanValue();*/
                    driver.get("https://kismia.com");
                    Cookie ck =  new Cookie(name, value);//new Cookie(name, value, domain, path, expiry, isSecure);

                    driver.manage().addCookie(ck);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        driver.get("https://kismia.com/matches");
        driver.wait(1000);
    }


}
