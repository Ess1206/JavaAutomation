package lesson14.homeWork14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Stan on 04.06.2017.
 */
public class LoginImpl implements LoginForm {

    private WebDriver driver ;

    public LoginImpl(WebDriver driver){
        this.driver = driver;
    }


    @Override
    public void openPage(String url) {
        driver.get(url);
    }

    @Override
    public void typeLogin(String userName) {
        driver.findElement(By.id("user-email")).clear();
        driver.findElement(By.id("user-email")).sendKeys(userName);
    }

    @Override
    public void typePassword(String userPass) {
        driver.findElement(By.id("user-password")).clear();
        driver.findElement(By.id("user-password")).sendKeys(userPass);

    }

    @Override
    public void submit() {

        driver.findElement(By.cssSelector("#sign-in-form > button")).click();

    }


}
