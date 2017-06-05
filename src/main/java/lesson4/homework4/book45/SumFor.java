package lesson4.homework4.book45;

/**
 * Created by Yevhen on 18.04.2017.
 */
public class SumFor {
    public static void main(String[] args) {
        int arrayA[] = {1,2,3,4,5,6,7,8,9,0,-1};
        int sum = 0;

       // for(int i = 0; i < arrayA.length; i++) {
        for(int x : arrayA) {
            sum += x;
            System.out.println(sum);
        }
    }
}
