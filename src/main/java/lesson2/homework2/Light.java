package lesson2.homework2;

/**
 * Created by Yevhen on 08.04.2017.
 */
public class Light {

    public static void main(String[] args){

        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.print("In " + days);
        System.out.print(" days light will pass ");
        System.out.println(distance + " miles");

    }
}
