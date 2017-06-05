package lesson5.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yevhen on 08.05.2017.
 */
public class CurrencyParseTest {


    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();


        driver.get("https://privatbank.ua/");
        String textFromPage = driver.findElement(By.xpath("//*[@id=\"selectByPB\"]/tr[3]/td[2]")).getText();
        String textFromPage0 = driver.findElement(By.xpath("//*[@id=\"selectByPB\"]/tr[3]/td[3]")).getText();

        driver.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
        String textFromPage1 = driver.findElement(By.xpath("//*[@id=\"no_tabs_content\"]/table/tbody/tr[1]/td[3]")).getText();
        String textFromPage2 = driver.findElement(By.xpath("//*[@id=\"no_tabs_content\"]/table/tbody/tr[1]/td[4]")).getText();

        driver.get("https://www.aval.ua/ru/personal/everyday/exchange/exchange/");
        String textFromPage3 = driver.findElement(By.xpath("//*[@id=\"bar-center\"]/div[1]/div/div[1]/table/tbody/tr[2]/td[2]")).getText();
        String textFromPage4 = driver.findElement(By.xpath("//*[@id=\"bar-center\"]/div[1]/div/div[1]/table/tbody/tr[2]/td[3]")).getText();

        driver.get("http://www.oschadbank.ua/ua/");
        String textFromPage5 = driver.findElement(By.xpath("//*[@id=\"site-content\"]/section[2]/div/div/div/div[1]/div/div[1]/span[2]/strong[1]")).getText();
        String textFromPage6 = driver.findElement(By.xpath("//*[@id=\"site-content\"]/section[2]/div/div/div/div[1]/div/div[1]/span[2]/strong[2]")).getText();

        driver.get("http://www.bank.gov.ua/control/uk/curmetal/detail/currency?period=daily");
        String textFromPage7 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div[4]/table[4]/tbody/tr[9]/td[5]")).getText();

        Thread.sleep(5000);
        driver.quit();

        double privatBuy = Double.parseDouble(textFromPage.replace(',', '.'));
        double privatSell = Double.parseDouble(textFromPage0.replace(',', '.'));
        double ukrsibBuy = Double.parseDouble(textFromPage1.replace(',', '.'));
        double ukrsibSell = Double.parseDouble(textFromPage2.replace(',', '.'));
        double avalBuy = Double.parseDouble(textFromPage3.replace(',', '.'));
        double avalSell = Double.parseDouble(textFromPage4.replace(',', '.'));
        double oschadBuy = Double.parseDouble(textFromPage5.replace(',', '.'));
        double oschadSell = Double.parseDouble(textFromPage6.replace(',', '.'));
        double nbuSellBuy = Double.parseDouble(textFromPage7.replace(',', '.')) / 100;
        double nbuSell = nbuSellBuy;

        double buyRate[] = new double[]{privatBuy, ukrsibBuy, avalBuy, oschadBuy, nbuSellBuy};
        double sellRate[] = new double[]{privatSell, ukrsibSell, avalSell, oschadSell, nbuSell};

        double resultBuyAvg = 0;
        double resultSellAvg = 0;

        int i;
        for (i = 0; i < 5; i++)
            resultBuyAvg = resultBuyAvg + buyRate[i];
        System.out.println("Average buying rate: " + resultBuyAvg / 5);

        for (i = 0; i < 5; i++)
            resultSellAvg = resultSellAvg + sellRate[i];
        System.out.println("Avarage selling rate: " + resultSellAvg / 5);

        double max = sellRate[0];
        double min = buyRate[0];

        for(i = 0; i > buyRate.length; i++)
            if (buyRate[i] < min) {
                min = buyRate[i];
            }
        for(i = 0; i < sellRate.length; i++)
            if (sellRate[i] > max) {
                max = sellRate[i];
            }

        System.out.println(" buying rate min value: " + min);
        System.out.println(" selling rate max value: " + max);

        System.out.println("Сheck the data: ");

        System.out.println(textFromPage + " / " + textFromPage0);
        System.out.println(textFromPage1 + " / " + textFromPage2);
        System.out.println(textFromPage3 + " / " + textFromPage4);
        System.out.println(textFromPage5 + " / " + textFromPage6);
        System.out.println(textFromPage7 + " / " + textFromPage7);

        Thread.sleep(10);

        driver.quit();
    }



}

