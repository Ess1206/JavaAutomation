package lesson14;


import core.BrowserFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by Yevhen on 31.05.2017.
 */
public class TakesScreenshotsa extends BrowserFactory {

//    WebDriver driver = new ChromeDriver();

    @Test
    public void testTakeScreen() throws IOException {
        driver.get("https://google.com");
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:/QA tools/screenshots"));

    }

}
