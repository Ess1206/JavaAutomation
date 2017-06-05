package lesson12example;

import core.BrowserFactory;
import lesson4.homework4.book45.Search;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Yevhen on 24.05.2017.
 */
public class InterfaceExample extends BrowserFactory {


    @DataProvider
    private Object[][] pages(){
        return new Object[][] {
                {new Kinopoisk(driver)},
                {new ImdbSearchPage(driver)}
        };
    }


    @Test(dataProvider = "pages")
    public void testSearch(SearchPage searchPage) throws InterruptedException {

    searchPage.open();
    searchPage.inputText("Hitman");
    searchPage.submit();
    Thread.sleep(3000);
    }


}
