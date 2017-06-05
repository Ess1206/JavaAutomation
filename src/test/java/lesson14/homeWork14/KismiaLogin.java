package lesson14.homeWork14;

import core.BrowserFactory;
import core.DriverEventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Stan on 04.06.2017.
 */
public class KismiaLogin extends BrowserFactory {

    @Test
    public void messages(){
        System.out.println("bla");

    }
    @Test
    public void kismiaLogin(LoginImpl loginForm){


        loginForm.openPage("https://kismia.com/");
        loginForm.typeLogin("blabla@mfsa.ru");
        loginForm.typePassword("Defect1206");
        loginForm.submit();

        System.out.println("test");
    }

}
