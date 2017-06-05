package lesson5.homework;

import org.apache.xpath.SourceTree;

import java.util.Scanner;

/**
 * Created by Yevhen on 02.05.2017.
 */
public class ConsoleGame {

    public static void main(String[] args) {


        int random = (int) Math.round((Math.random() * 100));
        System.out.println(random);

        int computer = (int) Math.round(Math.random() * 100);
        System.out.println(computer);

        Scanner playerValue = new Scanner(System.in);
        String s = playerValue.nextLine();
        Integer player = Integer.parseInt(s);
        System.out.println(player);


        while (player > 100 || player < 0){
            System.out.println("Please enter the number from 0 to 100 ");
            Scanner playerRepeat = new Scanner(System.in);
            String res = playerRepeat.nextLine();
            player = Integer.parseInt(res);
        }


        int compResult = computer - random;
        int playerResult = player - random;

        if(random > computer){
            if(compResult == playerResult){
                System.out.println("no winner");

            } else if (compResult > playerResult) {
                System.out.println("comp win");

            } else {
                System.out.println("player win");
            }
        } else {

            if (compResult == playerResult) {
                System.out.println("no winner");
            } else if (compResult < playerResult) {
                System.out.println("comp win");
            } else {
                System.out.println("player win");

            }
        }
        System.out.println(compResult);
        System.out.println(playerResult);


        }


    }
