package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


/**
 * Created by Yevhen on 22.05.2017.
 */
public class BrowserFactory {

    public WebDriver driver;


    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver = new EventFiringWebDriver(driver).register(new DriverEventListener());
    }



    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
