package lesson4.homework4;


import java.util.Scanner;

/**
 * Created by Yevhen on 19.04.2017.
 */
public class CharTransliteration {

    public static void main(String[] args) {

        char ru[] = {'А', 'Б', 'В', 'Г', 'Д', 'Е'};
        char en[] = {'A', 'B', 'V', 'G', 'D', 'E'};


        System.out.println("please enter the russian word ");
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();

        for (int i = 0; i < s.length; i++) {
            for (int k = i; k < ru.length; k++) {
                if (s[i] == ru[k]) {
                    System.out.print(en[k]);
                }
            }


        }
    }
}