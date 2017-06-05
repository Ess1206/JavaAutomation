package lesson2.homework2;

/**
 * Created by Yevhen on 08.04.2017.
 */
public class Conversion {

    public static void main(String args[]) {

        byte b;
        int i = 257;
        double d = 323.12312;

        System.out.println("\nConversion int in byte");
        b = (byte) i;
        System.out.println("i and b: " + i + " "+ b);

        System.out.println("\nConversion double in byte ");
        i = (int) d;
        System.out.println("d and i "+ d + " "+ i);

        System.out.println("\nConversion double in byte");
        b = (byte) d;
        System.out.println("d and b "+ d + " " + b);




    }

}
