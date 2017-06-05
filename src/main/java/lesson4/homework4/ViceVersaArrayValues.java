package lesson4.homework4;

import java.io.IOException;

/**
 * Created by Yevhen on 19.04.2017.
 */
public class ViceVersaArrayValues {
    public static void main(String[] args) {

    int array[] = {10,20,30,40,50};

    int max = array[0];
    int min = array[0];
    int tmpmin = 0;
    int tmpmax = 0;


    for(int i = 0; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
            tmpmax = i;
        }

        if (array[i] < min) {
            min = array[i];
            tmpmin = i;
        }

            System.out.print(array[i] + ", ");

    }
        System.out.println("\nпосле замены: ");

        array[tmpmin] = max;
        array[tmpmax] = min;

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + ", ");

        }

    }
}

