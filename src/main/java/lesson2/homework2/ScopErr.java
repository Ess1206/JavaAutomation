package lesson2.homework2;

/**
 * Created by Yevhen on 08.04.2017.
 */
public class ScopErr {


    public static void main(String args[]) {
        int bar = 1;
        {
       //    int bar = 1; // error example
        }
    }
}
