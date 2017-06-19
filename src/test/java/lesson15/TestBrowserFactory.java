package lesson15;

import core.BrowserFactory;
import lesson15.searchPage.SearchPage;
import org.testng.annotations.Test;

/**
 * Created by Stan on 07.06.2017.
 */
public class TestBrowserFactory extends BrowserFactory {
   /* @Test
    public void getUrl(){
        get("https://google.com");
    }
   */
   public SearchPage searchPage = new SearchPage();
   @Test
    public void getitem(){
       searchPage.testFindElement();
   }


}
