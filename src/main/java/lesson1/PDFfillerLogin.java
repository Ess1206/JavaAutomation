package lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yevhen on 05.04.2017.
 */
public class PDFfillerLogin {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("https://pdffiller.com");


        //*[@id="onesignal-popover-cancel-button"]



    }

}
