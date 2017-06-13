package lesson16;

import core.BrowserFactory;
import core.PageObjects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Stan on 12.06.2017.
 */
public class TestLogin extends BrowserFactory {
   /* protected  static WebDriver driver;
    public  static WebDriver driver(){
        return
    }

   */
   @Test
    public void doLogin() throws InterruptedException {

        MainPage mainPage = new MainPage();
        driver.get("https://kismia.com/");
        mainPage.loginForm.login("blabla@mfsa.ru","Defect1206");
        getwebDriverWait(10).until(ExpectedConditions.urlContains(".com/u"));

   }
}
