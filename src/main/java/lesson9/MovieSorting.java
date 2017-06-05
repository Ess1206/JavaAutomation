package lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Yevhen on 15.05.2017.
 */
public class MovieSorting {

    public static void main(String[] args) {


        List<Movie> list = new ArrayList<>();

        list.add(new Movie("A film", 2.4));
        list.add(new Movie("B film", 2.3));
        list.add(new Movie("C film", 1));

        //list.add

        Collections.sort(list);
        System.out.println(list);

    }
}
