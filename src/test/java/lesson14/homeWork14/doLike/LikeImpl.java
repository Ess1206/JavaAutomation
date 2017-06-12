package lesson14.homeWork14.doLike;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stan on 09.06.2017.
 */

public class LikeImpl implements LikeForm {
    private WebDriver driver;
    public LikeImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void openPage(String url) {
        driver.get(url);
    }

    @Override
    public void verifyPage() {
        if (driver.findElement(By.cssSelector(".matches")).isDisplayed())
            System.out.println(".matches is opened");
        else

            Assert.fail("wrong page");
    }

    @Override
    public void setLike() {
        driver.findElement(By.cssSelector("button .icon--matches-like")).click();

    }

    @Override
    public void setDisLike() {
        driver.findElement(By.cssSelector("button .icon--matches-dislike")).click();
    }

    @Override
    public void verifyUser() {

        String pageSorce = driver.getPageSource();
        int begin = driver.getPageSource().indexOf("<a class=\"show_payment_widget\"data-context=\"match_photo\"data-uid=\"") + "<a class=\"show_payment_widget\"data-context=\"match_photo\"data-uid=".length();
        int end = driver.getPageSource().indexOf("href=\"javascript:;\"><img src=");
        String userID = pageSorce.substring(begin,end);

        //                findElement(By.cssSelector("a[data-context='match_photo']")).getText();

        List<String> userIDs = new ArrayList<>();
        if (!userIDs.contains(userID)) userIDs.add(userID);
        else Assert.fail(userID + "is duplicated");
        System.out.println(userIDs.toString());

    }

}
