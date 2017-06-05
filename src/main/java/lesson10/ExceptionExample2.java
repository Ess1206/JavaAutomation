package lesson10;

import java.util.Scanner;

/**
 * Created by Yevhen on 17.05.2017.
 */
public class ExceptionExample2 {
    public static void main(String[] args) {
        int[] m = {-1,0,1};
        Scanner sc = new Scanner(System.in);

        try{
            int a = sc.nextInt();
            m[a] = 4/a;
            System.out.println(m[a]);

        } catch (ArithmeticException e){ // перехват 1
            System.out.println("error ariphetic");
        } catch (ArrayIndexOutOfBoundsException e) { //перехват по недопустимому индексу
            System.out.println("error index 0");
        } catch (Exception e){ //перехват 3
            System.out.println("error else");
        }
    }
}
