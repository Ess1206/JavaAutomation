package lesson4;

/**
 * Created by Yevhen on 12.04.2017.
 */
public class ArrayMinMaxDoubleFor {

    public static void main(String[] args) {
        int intArray[] = {10, 30, 20, 40, 60, 50, 100, 70, 80, 90};
        for (int arrElement : intArray) {
            System.out.print(arrElement + "\t");
        }
        System.out.println();
        System.out.println("Отсортированный пузырьком: ");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = intArray.length - 1; j > i; j--) {
                if (intArray[j] < intArray[j - 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j - 1];
                    intArray[j - 1] = temp;
                }
            }
        }
        for (int arrElement : intArray) {
            System.out.print(arrElement + "\t");
        }
    }

}
