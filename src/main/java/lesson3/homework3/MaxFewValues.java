package lesson3.homework3;

import org.apache.xpath.SourceTree;
import sun.management.counter.AbstractCounter;

/**
 * Created by Yevhen on 14.04.2017.
 */
public class MaxFewValues {

    public static void main(String[] args) {

        int[] a = {10, -1, 30, 40, 0, 20, 8, 7, 6, 5, 40, 40};

        int maxValue = a[0];
        int count = 0;


        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }

        }

        for (int i = 0; i < a.length; i++) {
            if (maxValue == a[i]) {
                count++;
        }


    }
        System.out.println("Max values has count: " + count);
}

    }

