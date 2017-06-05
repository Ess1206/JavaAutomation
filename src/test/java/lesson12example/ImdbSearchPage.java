package lesson12example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Yevhen on 24.05.2017.
 */
public class ImdbSearchPage implements  SearchPage{

    private WebDriver driver;

    public ImdbSearchPage(WebDriver driver){
        this.driver = driver;
    }

    @Override
    public void inputText(String text) {
        // #navbar-query
    driver.findElement(By.cssSelector("#navbar-query")).clear();
    driver.findElement(By.cssSelector("#navbar-query")).sendKeys(text);
    }

    @Override
    public void submit() {
    // #navbar-submit-button

    driver.findElement(By.cssSelector("#navbar-submit-button")).click();
    }

    @Override
    public void open() {
    driver.get("https://www.imdb.com");
    }
}
