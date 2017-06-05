package lesson10;

/**
 * Created by Yevhen on 17.05.2017.
 */
public class ExceptionExample1 {

    public static void main(String[] args) {
        int a = 4;

        try{
            System.out.println(a/0);

        } catch (ArithmeticException e){
            System.out.println("Произошла ошибка арифметическая");

            System.out.println(e.getMessage()); // вывести ошибку.
        }
    }
}
