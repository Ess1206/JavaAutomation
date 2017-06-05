package lesson5.homework;

import com.sun.jna.platform.win32.WinDef;

/**
 * Created by Yevhen on 02.05.2017.
 */
public class SumOfNumbersString {
    public static void main(String[] args) {
        String sumOfString = new String("1,2,3,4,5,6,7,8");
        String[] numbers = sumOfString.split(",");
        int sum = 0;



        for(int i = 0; i<numbers.length; i++){

            int digits = Integer.parseInt(numbers[i]);
            sum += digits;

        }

        System.out.println(sum);

    }
}
