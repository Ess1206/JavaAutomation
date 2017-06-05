package lesson3.homework3;

/**
 * Created by Yevhen on 15.04.2017.
 */
public class MinValue {

    public static void main(String[] args) {
        int a[] = {-1, 0, 1, -2, 3};

        int min = a[0];
        int i;

        for(i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }

        System.out.println("min value = " + min);
    }
}
