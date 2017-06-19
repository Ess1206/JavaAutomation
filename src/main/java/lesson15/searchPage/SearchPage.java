package lesson15.searchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stan on 13.06.2017.
 */
public class SearchPage extends SearchForm {
    @Override
    protected boolean verifyPage(String pageForVerified) {
        return false;
    }

    @Override
    protected List<String> listOfCelebrities() {

        List<String> listCelebs = new ArrayList<>();

        return listCelebs;
    }

    public void testFindElement() {
        driver.get("http://www.imdb.com/search/name?gender=male,female&ref_=nv_cel_m_3");
        List<WebElement> elements = new ArrayList(driver.findElements(By.cssSelector(".image>a>img")));
        for (WebElement e :
                elements) {
            System.out.println(e.getAttribute("alt"));


        }
    }


}
