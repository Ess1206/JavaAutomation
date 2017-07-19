package lesson22.HW;

import core.BrowserFactory;
import imap.EmailSender;
import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


/**
 * Created by Stan on 09.07.2017.
 */
public class DoScreeShot extends BrowserFactory {
    @Test
//    public void doScreenShot(String url){ - почему ошибка
    public void doScreenShot() throws IOException {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://planetakino.ua/showtimes/");

        //get("https://planetakino.ua/showtimes/"); - почему ошибка


        driver.findElement(By.cssSelector(".selected-tech[href='#4dx']")).click();
        driver.findElement(By.cssSelector(".selected-tech[href='#relux']")).click();
        driver.findElement(By.cssSelector(".selected-tech[href='#cinetech']")).click();

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));

    }


}
