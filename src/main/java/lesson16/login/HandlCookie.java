package lesson16.login;

import core.BrowserFactory;
import core.PageObjects.MainPage;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

/**
 * Created by Stan on 15.06.2017.
 */

public class HandlCookie extends BrowserFactory {



    @Test
    public void doLogin() throws InterruptedException {
        MainPage mainPage = new MainPage();
        driver.get("https://kismia.com/");
        mainPage.loginForm.login("blabla@mfsa.ru","Defect1206");
        getwebDriverWait(10).until(ExpectedConditions.urlContains(".com/u"));

        createFileWithCookies();

    }



    public static void createFileWithCookies(){
        File file = new File("Cookie.data");

        //delete if exist
        file.delete();
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bWriter= new BufferedWriter(fileWriter);
            for (Cookie ck : driver.manage().getCookies()) {
                bWriter.write(ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure());
                bWriter.newLine();

            }
            bWriter.flush();
            bWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
