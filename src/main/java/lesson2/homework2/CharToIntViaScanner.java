package lesson2.homework2;

import java.util.Scanner;

/**
 * Created by Yevhen on 09.04.2017.
 */
public class CharToIntViaScanner {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char c = s.charAt(0);

        int d = (int) c;

        System.out.println(d);







    }

}
