package lesson14.homeWork14.doLike;

import core.BrowserFactory;
import lesson14.homeWork14.kisLog.LoginImpl;
import org.testng.annotations.Test;

/**
 * Created by Stan on 12.06.2017.
 */
public class DoLike extends BrowserFactory {

    @Test(testName = "DoLike")
    public void like(){
        LoginImpl loginpage = new LoginImpl(driver);

        loginpage.openPage("https://kismia.com/");
        loginpage.typeLogin("blabla@mfsa.ru");
        loginpage.typePassword("Defect1206");
        loginpage.submit();

        LikeImpl likening = new LikeImpl(driver);
        likening.openPage("https://kismia.com/matches");
       // likening.verifyPage();

        for (int i = 0; i < 40; i++) {
            likening.verifyUser();
            if ((i%2)==0) likening.setLike();
            else likening.setDisLike();
        }

    }
}
