package lesson14.homeWork14.filter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stan on 05.06.2017.
 */
public class FilterImpl implements FilterFom {
    private WebDriver driver;

    public FilterImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void openPage(String url) {
        driver.get(url);
    }

    @Override
    public void openTab(String tabName) {

        switch (tabName) {
            case "profileSearch":
                driver.findElement(By.cssSelector(".settings-nav__elem[data-tab=\"profileSearch\"]")).click();
                break;
            case "profile":
                System.out.println("wrong tab");
                break;
            case "security":
                System.out.println("wrong tab");
                break;
            case "coins":
                System.out.println("wrong tab");
                break;
            case "premium":
                System.out.println("wrong tab");
                break;
            case "notifications":
                System.out.println("wrong tab");
                break;
        }

    }

    @Override
    public void setSex(String sexName) {
        switch (sexName) {
            case "male":
                driver.findElement(By.cssSelector(".settings-radio [name=\"search_gender\"][value=\"m\"]")).click();
                break;
            case "female":
                driver.findElement(By.cssSelector(".settings-radio [name=\"search_gender\"][value=\"f\"]")).click();
                break;
        }

    }

    @Override
    public void setAgeBefore(int ageBefore) {
        driver.findElement(By.cssSelector(".settings-path__select-block [name=\"search_age_from\"]")).click();
        List<WebElement> listOfAge = new ArrayList(driver.findElements(By.cssSelector(".settings-path__select-block [name=\"search_age_from\"] option")));
        ageBefore = ageBefore-17;
        listOfAge.get(ageBefore).click();
    }


    @Override
    public void setAgeAfter(int ageAfter) {
        driver.findElement(By.name("search_age_to")).click();
        ageAfter = ageAfter-17;
        List<WebElement> listOfAge = new ArrayList(driver.findElements(By.cssSelector(".settings-path__select-block [name=\"search_age_to\"] option")));
        listOfAge.get(ageAfter).click();
    }

    @Override
    public void submit(boolean trueORfolse) {
        if (trueORfolse)
            driver.findElement(By.className("button-FR settings__button button--flat-green js_save")).click();
        else
            driver.findElement(By.className("settings__cancel-link link js_cancel")).click();

    }
}
