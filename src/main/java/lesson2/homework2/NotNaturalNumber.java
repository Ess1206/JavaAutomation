package lesson2.homework2;

/**
 * Created by Yevhen on 09.04.2017.
 */
public class NotNaturalNumber {

    public static void main(String args[]){

        double a = 11.6;
        double b = a%11;
        int c = (int)a;

        if(b >= 0.5)
        {
            c++;
        }

        System.out.println("rounded to " + c);

    }

}
