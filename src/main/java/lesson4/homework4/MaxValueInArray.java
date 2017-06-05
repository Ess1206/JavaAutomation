package lesson4.homework4;

/**
 * Created by Yevhen on 19.04.2017.
 */
public class MaxValueInArray {
    public static void main(String[] args) {
        int array[] = {10, 10, 20, 24, 100, 1455, 155, 48};
        int max = array[0];


        for (int nums : array) {
            if (nums > max) {
                max = nums;
            }
        }
        System.out.println(max);
    }
}
