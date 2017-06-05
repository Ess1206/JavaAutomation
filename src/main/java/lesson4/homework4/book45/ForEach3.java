package lesson4.homework4.book45;

/**
 * Created by Yevhen on 18.04.2017.
 */
public class ForEach3 {

    public static void main(String[] args) {
        int sum = 0;
        int nums [][] = new int[3][5];
        // присвоить значение элементам массива nums
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);

                System.out.println(j);
            }

        }

        for(int x[] : nums){
            for (int y : x){
                System.out.println("Value equal: " + y);
                sum += y;
            }

        }
        System.out.println("Sum: " + sum);
    }

}
