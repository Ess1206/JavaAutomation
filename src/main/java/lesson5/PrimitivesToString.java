package lesson5;

/**
 * Created by Yevhen on 19.04.2017.
 */
public class PrimitivesToString {

    public static void main(String[] args) {

        int integ = 1;
        double doubl = 2.3;
        long loon = 1000003;
        boolean boo = true;

        String intege1 = String.valueOf(integ);
        String doub1 = String.valueOf(doubl);
        String loon1 = String.valueOf(loon);
        String boo1 = String.valueOf(boo);

        System.out.println(intege1 + " " + doub1 + " " + loon1 + " " + boo1 );

        Integer inteddd = Integer.valueOf(intege1);

        System.out.println(inteddd);

    }

}
