package lesson4.homework4;

/**
 * Created by Yevhen on 19.04.2017.
 */
public class Numbers10 {
    public static void main(String[] args) {


        int array10[] = new int[9];
        int first = 1;

        for (int i = 0; i < array10.length; i++){
                array10[i] = first;
                first = first + 2;
            System.out.print(array10[i]+ ", ");
               }
        }
    }
