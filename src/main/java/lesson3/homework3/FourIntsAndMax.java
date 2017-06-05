package lesson3.homework3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yevhen on 14.04.2017.
 */
public class FourIntsAndMax {

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<Integer>();

        ints.add(1);
        ints.add(2);
        ints.add(9);
        ints.add(-1);

        int max = 0;
        int min = 0;

            for (Integer int1 : ints) {

                if(int1 > max){
                   max = int1;
                }
                if(int1 < min){
                    min = int1;
                }

            }

        System.out.println("max value = " + max);
        System.out.println("min value = " + min);

    }
}
