package lesson15.PageObject.mainPage;

import core.Element;
import lesson15.PageObject.mainPage.MainForm;
import org.openqa.selenium.By;

/**
 * Created by Stan on 13.06.2017.
 */
public class MainPage extends MainForm {
   Element celebres = new Element(By.xpath(".//*[@id='navNameMenu']/p/a[1]") , "Search Celebrities");

    @Override
    protected void goToSearch() {
        celebres.click();

    }
}
