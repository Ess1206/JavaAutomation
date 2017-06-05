package lesson2.homework2;

/**
 * Created by Yevhen on 09.04.2017.
 */
public class DivisionAndDouble {

    public static void main(String args[]) {
        // первый вариант
        Integer q = new Integer(21);
        double b = q.doubleValue();

        Integer w = new Integer(8);
        double d = w.doubleValue();

        double e;
        e = b / d;

        System.out.println( "result is: " + e);
        // второй вариант
        int n1, n2;
        n1 = 19;
        n2 = 2;
        double d1 = (double) n1;
        double d2 = (double) n2;

        System.out.println("result is: " + d1 / d2);

        // какой лучше юзать?)
    }

}
