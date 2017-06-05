package lesson3.homework3;

/**
 * Created by Yevhen on 15.04.2017.
 */
public class SwitchWithoutBreak {

    public static void main(String[] args) {
        int month = 3;

        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                season = "really???";
        }
        System.out.println("answer: " + season);
    }

}
