package lesson4.homework4.book45;

/**
 * Created by Yevhen on 14.04.2017.
 */
public class IntDec {
    public static void main(String[] args) {
        int a = 1; // почему a = 2 при выводе?
        int b = 2;
        int c;
        int d;
        c = ++b;
        d = a++;
        c++;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);



    }
}
