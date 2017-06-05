package lesson2.homework2;

/**
 * Created by Yevhen on 08.04.2017.
 */
public class IfSample {

    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if (x < y) System.out.println(" x lower than y ");

        x = x * 2;
        if (x == y) System.out.println(" now x equal y ");

        x = x * 2;
        if(x > y) System.out.println(" x now bigger than y ");

        // this operator won't do anything
        if(x == y) System.out.println("You wont see it");
    }

}
