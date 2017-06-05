package lesson2.homework2;

/**
 * Created by Yevhen on 09.04.2017.
 */
public class NumberForSplitting {

    public static void main(String args[]) {

        int n = 321;

        int a = n%300;
        int b = a%20;
        int c = a/10;
        int d = n/100;
        int e = b + c + d;

        System.out.println(d +" + "+ c +" + " + b + " = " + e);

    }
}
