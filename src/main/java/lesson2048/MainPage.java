package lesson2048;

import core.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.UpAction;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

/**
 * Created by Stan on 03.07.2017.
 */
public class MainPage extends BrowserFactory {


    @Test
    public void open2048() throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://gabrielecirulli.github.io/2048/");

        Actions actions = new Actions(driver);
        String score = "";
        String best = "";
//        driver.wait(100);

        for (int i = 0; i < 10; i++) {

            while (driver.findElements(By.cssSelector(".game-message.game-over")).isEmpty()) {

                actions.sendKeys(Keys.ARROW_DOWN).perform();
                actions.sendKeys(Keys.ARROW_LEFT).perform();
                actions.sendKeys(Keys.ARROW_RIGHT).perform();

            }
            score = driver.findElement(By.cssSelector(".score-container")).getText();
            best = driver.findElement(By.cssSelector(".best-container")).getText();

            driver.findElement(By.cssSelector(".retry-button")).click();


            System.out.println(score);
            System.out.println(best);

        }

        System.out.println(score);
        System.out.println(best);
        System.out.println("out ");
    }
}
