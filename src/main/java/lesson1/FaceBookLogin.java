package lesson1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;
/**
 * Created by Yevhen on 04.04.2017.
 */
public class FaceBookLogin {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("yvg.test@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("qwa2qwa2");

        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();

        Thread.sleep(5000);
        System.out.println(driver.getTitle());

        driver.quit();
    }


    }

