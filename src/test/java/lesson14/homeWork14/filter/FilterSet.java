package lesson14.homeWork14.filter;

import core.BrowserFactory;
import lesson14.homeWork14.kisLog.KismiaLogin;
import lesson14.homeWork14.kisLog.LoginImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Created by Stan on 05.06.2017.
 */
public class FilterSet extends BrowserFactory {



    @Test(testName = "SetFilters")
    public void setFilters(){
        FilterImpl filterPage = new FilterImpl(driver);


        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("content")));

        filterPage.openPage("https://kismia.com/profile/settings");
        filterPage.openTab("profileSearch");
        filterPage.setSex("female");
        filterPage.setAgeBefore(19);
        filterPage.setAgeAfter(20);
        filterPage.submit(true);
    }

}
