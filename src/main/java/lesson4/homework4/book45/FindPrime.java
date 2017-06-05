package lesson4.homework4.book45;

/**
 * Created by Yevhen on 18.04.2017.
 */
public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 14;
        if (num < 2) {
            isPrime = false;
        } else {
            isPrime = true;
        }

        for (int i = 2; i <= num/i; i++) {
            if((num % i ) == 0){
                isPrime = false;
                System.out.println(num);
                break;

            }
        }

        if(isPrime) System.out.println(" Простое число ");
        else System.out.println("Не простое число");
    }
}
