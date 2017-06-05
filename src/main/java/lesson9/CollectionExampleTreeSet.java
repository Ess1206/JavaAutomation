package lesson9;

import java.util.Random;
import java.util.TreeSet;

/**
 * Created by Yevhen on 15.05.2017.
 */
public class CollectionExampleTreeSet {

    public static void main(String[] args) {

        Random random = new Random(30);

        TreeSet<Integer> numberSet = new TreeSet<>();


        for(int i = 0; i < 1000; i++){
            numberSet.add(random.nextInt(10));

        }

        System.out.println(numberSet);

    }

}
