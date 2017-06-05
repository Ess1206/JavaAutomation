package lesson14;

import core.BrowserFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Yevhen on 31.05.2017.
 */
public class ListenereExample extends BrowserFactory {

    @Test
    public void testIt(){
        driver.get("https://www.google.com");
        driver.findElement(By.cssSelector("html body"));
    }



}
