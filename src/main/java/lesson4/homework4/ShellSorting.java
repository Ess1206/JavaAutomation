package lesson4.homework4;

import org.apache.xpath.SourceTree;

/**
 * Created by Yevhen on 29.04.2017.
 */
public class ShellSorting {

    public static void main(String[] args) {
        int[] mas = new int[12];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round(Math.random() * 100);
            System.out.print(mas[i] + " ");
        }

        //Algorithm
        int dlina = mas.length / 2;
        while (dlina > 0) {
            for (int i = 0; i < (mas.length - dlina); i++) {
                int j = i;

                while ((j >= 0) && (mas[j] > mas[j + dlina])) {
                    // mas[0] > mas[5]
                    int temp = mas[j];
                    mas[j] = mas[j + dlina];
                    mas[j + dlina] = temp;
                    j--;

                }
            }
            dlina = dlina / 2;
        }

        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

    }

}
