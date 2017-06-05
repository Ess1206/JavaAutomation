package lesson7;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yevhen on 05.05.2017.
 */
public class ComparisonStringAndBuilder {

    public static void main(String[] args) {

        System.out.println(System.nanoTime());

        String one = new String("1");
        StringBuilder two = new StringBuilder("1");

        for (int i = 0; i < 100; i++) {
            System.out.println();
        }

    }

}
