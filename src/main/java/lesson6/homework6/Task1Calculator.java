package lesson6.homework6;


import java.util.Scanner;

/**
 * Created by Yevhen on 25.04.2017.
 */
public class Task1Calculator {

    public static void main(String[] args) {

        Calculator value1 = new Calculator();
        String operationist = "";
        int indexValue = 0;

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] keepString = line.toCharArray();


        for (int i = 0; i < keepString.length; i++) {

            if (!Character.isDigit(keepString[i])) {

                indexValue = i;
                operationist = Character.toString(keepString[i]);

            }


        }

        String leftValue = line.substring(0, indexValue);
        String rightValue = line.substring(indexValue + 1, keepString.length);

        value1.a = Double.valueOf(leftValue);
        value1.b = Double.valueOf(rightValue);


        switch (operationist) {
            case "/":
                value1.divide();
                System.out.println("Если поделить то = " + value1.divide());
                break;
            case "*":
                value1.multi();
                System.out.println("Если умножить то = " + value1.multi());
                break;
            case "+":
                value1.plus();
                System.out.println("Если плюснуть то = " + value1.plus());
                break;
            case "-":
                value1.minus();
                System.out.println("Если минуснуть то = " + value1.minus());
                break;
            default:
                System.out.println("Что то пошле не так");


        }


    }


}








