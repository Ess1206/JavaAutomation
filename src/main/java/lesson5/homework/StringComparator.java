package lesson5.homework;

import java.util.Scanner;
import java.util.SortedMap;

/**
 * Created by Yevhen on 02.05.2017.
 */
public class StringComparator {

    public static void main(String[] args) {

        System.out.println("Welcome to the console checker, please choose value from 1 to 3 for choosing the option");
        System.out.println("1. check the string equals");
        System.out.println("2. check the string ignore up/low cases");
        System.out.println("3. check the string with up/low cases");

        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();

        System.out.println("You choose " + option);
        System.out.println("Please enter the first string");

        Scanner scanner1 = new Scanner(System.in);
        String value1 = scanner1.nextLine();

        System.out.println("Please enter the next string");

        Scanner scanner2 = new Scanner(System.in);
        String value2 = scanner2.nextLine();

        switch (option){

            case "1":
                int result = value1.compareTo(value2);
                System.out.println(result);
                break;
            case "2":
                int result1 = value1.compareToIgnoreCase(value2);
                System.out.println(result1);
                break;
            case "3":
                int result3 = value1.replaceAll(" ","").compareToIgnoreCase(value2);
                System.out.println(result3);
                break;
                default:
                    System.out.println("please choose the right option");


        }






}
}









