package lesson6;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Yevhen on 24.04.2017.
 */
public class StringMoom {
    public static void main(String[] args) {
        String palindrome = "moom";

        if (palindrome.equals(StringUtils.reverse(palindrome))) System.out.println("Yes");
        else System.out.println("NO");
        //задание



        }

    }

