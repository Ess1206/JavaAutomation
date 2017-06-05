package lesson14;

import core.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * Created by Yevhen on 31.05.2017.
 */
public class HoverElement extends BrowserFactory{

    @Test
    public void moveToButton() throws InterruptedException {
        driver.get("http://www.imdb.com");
        WebElement elem = driver.findElement(By.cssSelector("#consumer_main_nav #navTitleMenu"));

        Actions actions = new Actions(driver);
        actions.moveToElement(elem).perform();
        Thread.sleep(3000);


    }




}
