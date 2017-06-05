package lesson7.homeWork7;

/**
 * Created by Yevhen on 09.05.2017.
 */
public class StringTimer {

    public static void main(String[] args) {

        String one = "some text";

        int count = 10000;

        long startString, endString, startStringBuilder, endStringBuilder;

        endString = 0;
        endStringBuilder = 0;

        startString = System.currentTimeMillis();

        for(int i = 0;i < count; i++ ){

            one = one + "some text";

            endString = System.currentTimeMillis();

        }




        StringBuilder two = new StringBuilder("some text");
        startStringBuilder = System.currentTimeMillis();

        for(int i = 0; i < count; i++){
            two.append("some text");

            endStringBuilder = System.currentTimeMillis();
        }

        System.out.println("Time of the stringbuilder: " + (endStringBuilder - startStringBuilder));
        System.out.println("Time of the string: " + (endString - startString));

    }

}
