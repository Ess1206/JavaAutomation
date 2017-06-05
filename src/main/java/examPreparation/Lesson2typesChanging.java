package examPreparation;

/**
 * Created by Yevhen on 28.05.2017.
 */
public class Lesson2typesChanging {

    public static void main(String[] args) {
        int x = 1;
        float y = 3.1214F;
        char c = 'c';

        c = (char) x;
        c = (char) y;
        x = (int) c;

        Integer x1 = new Integer('c');
        Character c1 = new Character('c');
        x1 = Integer.valueOf(c1);




    }

}
