package lesson14.homeWork14.kisLog;

import core.BrowserFactory;
import org.testng.annotations.Test;

/**
 * Created by Stan on 04.06.2017.
 */
public class KismiaLogin extends BrowserFactory {

    @Test (testName = "login")
    public void kismiaLogin(){

        LoginImpl loginpage = new LoginImpl(driver);

        loginpage.openPage("https://kismia.com/");
        loginpage.typeLogin("blabla@mfsa.ru");
        loginpage.typePassword("Defect1206");
        loginpage.submit();
    }

}
