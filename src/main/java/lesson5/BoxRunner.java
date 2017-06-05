package lesson5;



/**
 * Created by Yevhen on 19.04.2017.
 */
public class BoxRunner {

    public static void main(String[] args) {
        Box mybox = new Box(); // создать обьект mybox класса Box
        Box cube = new Box(); // coздать обьект cube класса Box
        Box paralelepiped = new Box(); // создать обьект paralelepiped

       cube.width = 10;
       cube.depth = 10;
       cube.height = 10;

       paralelepiped.height = 10;
       paralelepiped.width = 20;
       paralelepiped.depth = 15;

       cube.volume();
       paralelepiped.volume();

    }

}
