package lesson6;

/**
 * Created by Yevhen on 24.04.2017.
 */
public class RecursionExample {

    public static int fact(int n) {
        int resultl;
        if (n == 1) {

            return 1;

        }
        resultl = fact(n - 1) * n;

        return resultl;

    }

    public static void main(String[] args) {

                System.out.println(fact(3));
    }

}
