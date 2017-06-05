package lesson4;

/**
 * Created by Yevhen on 12.04.2017.
 */
public class ArrayMinMaxTask {

    public static void main(String[] args) {

        int ar[] = {2, -3, -1, 6, 6, 6, 7, 8, 9, 0, 1111};

        int max = ar[0];
        int min = ar[0];

        int i;

        for (i = 0; i < ar.length; i++) {
            if(ar[i] > max){
                max = ar[i];
            }
            if(ar[i] < min){
                min = ar[i];
            }
        }

        System.out.println(max + " " + min);
    }

}
