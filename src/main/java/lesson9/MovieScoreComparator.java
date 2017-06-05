package lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Yevhen on 15.05.2017.
 */
public class MovieScoreComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2){

        return(o1.score < o2.score) ? -1 : ((o1.score == o2.score)) ? 0 : 1;

    }

    public static void main(String[] args) {

       List<Movie> movieList = new ArrayList<>();
       movieList.add(new Movie("A film", 2.4));
       movieList.add(new Movie("B film", 2.1));
       movieList.add(new Movie("C film", 2.3));

       Collections.sort(movieList, new MovieTitleComparator());
       System.out.println(movieList);

       Collections.sort(movieList, new MovieScoreComparator());
       System.out.println(movieList);


    }

}
