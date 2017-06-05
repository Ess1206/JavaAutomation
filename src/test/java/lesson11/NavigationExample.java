package lesson11;

import core.BrowserFactory;
import org.testng.annotations.Test;

/**
 * Created by Yevhen on 22.05.2017.
 */
public class NavigationExample extends BrowserFactory {

    @Test
    public void testBrowserNavigation(){

        driver.get("https://google.com"); // need transfer full URL
        driver.get("https://facebook.com");

        System.out.println("CURRENT URL: " + driver.getCurrentUrl());

        driver.navigate().back();

        System.out.println("AFTER .back() URL: " + driver.getCurrentUrl());

        driver.navigate().forward();

        System.out.println("AFTER .forward() URL: " + driver.getCurrentUrl());
    }



}
