package lesson4.homework4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yevhen on 19.04.2017.
 */
public class AkinatorTest {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Добро пожаловать в АКИНАТОР, сыграем? ");
        System.out.println("Введите ваш возраст ");
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();
        System.out.println("Спасибо! Вы ввели " + age + ".");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        // заход на сайт и выбор параметров
        driver.get("http://ru.akinator.com/");
        driver.findElement(By.xpath("//a[@class='rouge']")).click();
        driver.findElement(By.xpath("//input[@id=\"elokence_sitebundle_identification_age\"]")).clear();
        driver.findElement(By.xpath("//input[@id=\"elokence_sitebundle_identification_age\"]")).sendKeys(age);
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();


        String question = driver.findElement(By.xpath("//*[@id=\"bulle-inner\"]")).getText();
        boolean variator;
        boolean variatorForAnswers;


        if(question.isEmpty()){
            variator = false;
        } else {
            variator = true;
        }

        String answer3 = driver.findElement(By.xpath("//*[@id=\"reponse3\"]")).getText();

        if(answer3.isEmpty()){
            variatorForAnswers = false;
        } else {
            variatorForAnswers = true;
        }

        while(variator) {


            question = driver.findElement(By.xpath("//*[@id=\"bulle-inner\"]")).getText();
            //*[@id="bulle-inner"] - выводим вопрос
            System.out.println("Ответьте на вопрос, пожалуйста: " + question);


            System.out.println("\nВыбирайте наиболее подходящий вариант:");


            String answer1 = driver.findElement(By.xpath("//*[@id=\"reponse1\"]")).getText();
            System.out.println("1." + answer1);
            //*[@id="reponse1"]

            String answer2 = driver.findElement(By.xpath("//*[@id=\"reponse2\"]")).getText();
            System.out.println("2." + answer2);
            //*[@id="reponse2"]


                while(variatorForAnswers) {

                    answer3 = driver.findElement(By.xpath("//*[@id=\"reponse3\"]")).getText();
                    System.out.println("3." + answer3);
                    //*[@id="reponse3"]

                    String answer4 = driver.findElement(By.xpath("//*[@id=\"reponse4\"]")).getText();
                    System.out.println("4." + answer4);
                    //*[@id="reponse4"]
                    String answer5 = driver.findElement(By.xpath("//*[@id=\"reponse5\"]")).getText();
                    System.out.println("5." + answer5);
                    //*[@id="reponse5"]

                    break;
                }

            Scanner scanner1 = new Scanner(System.in);
            String chooser = scanner1.nextLine();


            switch (chooser){

                case "1":
                    driver.findElement(By.xpath("//*[@id=\"reponse1\"]")).click();

                    break;
                case "2":
                    driver.findElement(By.xpath("//*[@id=\"reponse2\"]")).click();
                    break;
                case "3":
                    driver.findElement(By.xpath("//*[@id=\"reponse3\"]")).click();
                    break;
                case "4":
                    driver.findElement(By.xpath("//*[@id=\"reponse4\"]")).click();
                    break;
                case "5":
                    driver.findElement(By.xpath("//*[@id=\"reponse5\"]")).click();
                    break;
                default:
                        System.out.println("попробуйте еще раз");

                        Thread.sleep(2000);

                break;

            }

            Thread.sleep(2000);

            String finish = driver.getCurrentUrl();

            if(finish.equals("http://ru.akinator.com/personnages/propose")){
                break;
            }

        }



        driver.getCurrentUrl();
        System.out.println("Игра окончена Ваш персонаж " + driver.findElement(By.xpath("//*[@id=\"perso\"]")).getText());
        System.out.println("Доп инфо " + driver.findElement(By.xpath("//*[@id=\"description\"]")).getText());

        driver.quit();

    }

}
