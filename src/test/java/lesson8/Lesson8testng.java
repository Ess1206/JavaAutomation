package lesson8;


import org.apache.xpath.operations.String;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Yevhen on 10.05.2017.
 */

public class Lesson8testng {

    public static WebDriver driver;



    @Test
    public static void main(String[] args) {

        System.out.println("test class");
        Assert.assertTrue( false, "asdasdasd");
    }
    public void first(){

        System.out.println("test class 2");
        Assert.assertTrue(false, "page is not loaded");
    }

    @BeforeTest
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testTest(){
        driver.get("https://google.com");
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
