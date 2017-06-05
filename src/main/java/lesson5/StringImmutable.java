package lesson5;

/**
 * Created by Yevhen on 19.04.2017.
 */
public class StringImmutable {

    /**
     * Created by Yevhen on 19.04.2017.
     */
            public static void main(String[] args) {
            String myString = "Jack";
            myString.concat(" SPARROW"); // "Jack + " Sparrow"

            System.out.println(myString); // JACK


            myString = myString.concat(" SPARROW"); // myString = "JACK" + " SPARROW";

            System.out.println(myString); //
        }
    }


