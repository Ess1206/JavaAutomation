package lesson2.homework2;

/**
 * Created by Yevhen on 08.04.2017.
 */
public class LifeTimeOfTheVariable {

    public static void main(String args[]){

        int x;

        for(x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y equal: " + y);

            y = 100;
            System.out.println("y now equal: " + y);

        }

    }

}
