package lesson8.homeWork8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yevhen on 15.05.2017.
 */
public class KissMiaTests {

    public static WebDriver driver;

//    @Test
//    public static void openPage() {
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//
//        driver.get("https://kismia.com/");
//
//    }



    // //li/a[@href="/messages"][@class="new-header-main-nav__link new-header-main-nav__link--messages"] - сообщения клик
    // //a[@href="/matches"][@class="button--yellow-and-purple"] - button play

    // //img[@alt="yevgeniy"] - personal data

    // /html/body/div[1]/header/div/div[2]/ul/li/ul/li[2]/a - dropdown

    // //a[@href="/profile/settings"] - settings

    // //*[@id="day"] - day
    // //*[@id="day"]/option[20] - day 20

    // //*[@id="month"] - month
    // //*[@id="month"]/option[2] - february

    // //*[@id="year"] - year

    // //*[@id="year"]/option[63] - 1990

    // //input[@name="gender"][@value="m"] - male
    // //input[@name="gender"][@value="f"] - female

    @Test
    @Parameters({"email","password"})
    public void login(String email, String password) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://kismia.com/");

        driver.findElement(By.xpath("//*[@id=\"user-email\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"user-email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"user-password\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"user-password\"]")).sendKeys(password);

        driver.findElement(By.xpath("//*[@id=\"sign-in-form\"]/button")).click();

        Thread.sleep(2000);
        driver.getCurrentUrl();

        Assert.assertEquals(driver.getCurrentUrl(),"https://kismia.com/u26817884?rg=4" );
        //"https://kismia.com/u26817884?rg=4"

    }

    @Test
    public static void message(){

        driver.findElement(By.xpath("//li/a[@href=\"/messages\"][@class=\"new-header-main-nav__link new-header-main-nav__link--messages\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"/matches\"][@class=\"button--yellow-and-purple\"]")).click();

    }

    public static void personalData(){

        // //img[@alt="yevgeniy"] - personal data

        // /html/body/div[1]/header/div/div[2]/ul/li/ul/li[2]/a - dropdown

        // //a[@href="/profile/settings"] - settings

        // //*[@id="day"] - day
        // //*[@id="day"]/option[20] - day 20

        // //*[@id="month"] - month
        // //*[@id="month"]/option[2] - february

        // //*[@id="year"] - year

        // //*[@id="year"]/option[63] - 1990

        // //input[@name="gender"][@value="m"] - male
        // //input[@name="gender"][@value="f"] - female

    }

}
