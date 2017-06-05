package lesson3.homework3;

import java.util.Scanner;

/**
 * Created by Yevhen on 14.04.2017.
 */
public class SwitchCaseAndDays {
    public static void main(String[] args) {


        System.out.println("Please choose the week day");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int a = Integer.parseInt(s);

        System.out.println("Thanks, You have chosen " + s);

        switch (a){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Please use the range from 1 to 7");
        }



    }
}
