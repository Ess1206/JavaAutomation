package lesson4.homework4;

/**
 * Created by Yevhen on 19.04.2017.
 */
public class MinArrayValue {

    public static void main(String[] args) {
        int array[] = {10,10,20,24,100,1455,155,48};
        int min = array[0];
        int count = 0;

        for(int nums : array){
            if(nums < min){
                min = nums;
            }

            if(min == nums){
                count++;
            }



        }

        System.out.println("минимальное значение " + min);
        System.out.println("Встречается " + count + " раза");
    }
}
