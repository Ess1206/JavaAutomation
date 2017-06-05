package lesson3.homework3;

/**
 * Created by Yevhen on 15.04.2017.
 */
public class Switch12Monthes {
    public static void main(String[] args) {
        int month = 3;
        String season;

        switch (month) {
            case 1:
                season = "winter";
                break;
            case 2:
                season = "winter";
                break;
            case 3:
                season = "spring";
                break;
            case 4:
                season = "spring";
                break;
            case 5:
                season = "spring";
                break;
            case 6:
                season = "summer";
                break;
            case 7:
                season = "summer";
                break;
            case 8:
                season = "summer";
                break;
            case 9:
                season = "autumn";
                break;
            case 10:
                season = "autumn";
                break;
            case 11:
                season = "autumn";
                break;
            case 12:
                season = "winter";
                break;

            default: season = "year has 12 months";
        }

        System.out.println(season);
    }
}
