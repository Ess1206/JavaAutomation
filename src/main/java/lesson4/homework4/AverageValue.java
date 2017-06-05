package lesson4.homework4;

/**
 * Created by Yevhen on 19.04.2017.
 */
public class AverageValue {

    public static void main(String[] args) {


        int array[] = {100, 99, 22, 11, -11, 0, 4, 5};

        double average;
        double sum = 0;

        for (int i = 0; i < array.length; i++){

            sum += array[i];

        }

        average = sum / array.length;

        System.out.println(average);
    }
}
