package lesson5.homework;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * Created by Yevhen on 02.05.2017.
 */
public class StringNewWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();


        if(string.contains("new")){

        String wordAfterNew = StringUtils.substringAfterLast(string, "new");
            System.out.println(wordAfterNew);

        } else {
            System.out.println("Your phrase does not contain a 'new' word!");
        }

    }

}
