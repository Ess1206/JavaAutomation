package lesson3;

import java.sql.Struct;

/**
 * Created by Yevhen on 10.04.2017.
 */
public class StringEqualsExample {
    public static void main(String[] args) {
        String str1 = new String("Привет");
        String str2 = new String("Привет");
        String sameStr = str1;

        boolean b1 = str1 == str2; // будет фолс, потому что 2 разных обьекта
        boolean b2 = str1.equals(str2);
        boolean b3 = str1 == sameStr;

    }}