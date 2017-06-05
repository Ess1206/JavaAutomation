package lesson2.homework2;

/**
 * Created by Yevhen on 08.04.2017.
 */
public class Scope {

    public static void main(String args[]) {
        int x;

        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x & y: " + x + " " + y);
            x = y * 2;
        }
        //y = 100;
        System.out.println("x equal " + x);


    }

}
