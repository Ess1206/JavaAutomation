package lesson14;

import core.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Created by Yevhen on 31.05.2017.
 */
public class ExplicitWaitExample extends BrowserFactory {

    @Test
    public void waitForElement() {

        driver.get("http://www.imdb.com");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consumer_main_nav #navTitleMenu")));

    }
}
