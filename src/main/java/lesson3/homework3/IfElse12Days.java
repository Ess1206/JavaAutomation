package lesson3.homework3;

/**
 * Created by Yevhen on 15.04.2017.
 */
public class IfElse12Days {

    public static void main(String[] args) {
        int month = 9; // may

        String season;

        if (month == 12 || month == 1 || month == 2) {
            season = "winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "spring";
        } else if (month == 6 || month == 7 || month == 8){
            season = "summer";
        } else if (month == 9 || month == 10 || month == 11){
            season = "autumn";
        } else {
            season = "stupid asshole check the number months in the year";
        }

        System.out.println(season);
    }
}


