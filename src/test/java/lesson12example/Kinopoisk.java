package lesson12example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Yevhen on 24.05.2017.
 */
public class Kinopoisk implements  SearchPage{

    private WebDriver driver;

    public Kinopoisk(WebDriver driver){
        this.driver = driver;
    }

    @Override
    public void inputText(String text) {

        driver.findElement(By.cssSelector("#search_input")).clear();
        driver.findElement(By.cssSelector("#search_input")).sendKeys(text);
    }

    @Override
    public void submit() {


        driver.findElement(By.cssSelector("#top_form > input.searchButton1")).click();
    }

    @Override
    public void open() {
        driver.get("https://www.kinopoisk.ru/");
    }
}
