package lesson4;

/**
 * Created by Yevhen on 12.04.2017.
 */
public class ArraySortByBaloon {

    public static void main(String[] args) {

        boolean swapFlag = true;
        int tempInt;
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 15};
        while (swapFlag) {
            swapFlag = false;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] < intArray[i + 1]) {
                    tempInt = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = tempInt;
                    swapFlag = true;
                }
            }
            for(int item : intArray)
                System.out.print(item+" ");
            System.out.println();
        }


    }

}
