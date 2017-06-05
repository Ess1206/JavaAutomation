package lesson2;

/**
 * Created by Yevhen on 05.04.2017.
 */
public class ChangeType {

    public static void main(String[] args) {

    int i = 605233;

    long lo = i;

    short s = (short) lo;

    System.out.println(s);

    char ch = 'J';

    int intCh = (int) ch;

    System.out.println("J corresponds with " + intCh);

    Integer vi = new Integer(100);

    Character c = new Character('v');

    Boolean b = new Boolean(true);

    }

}
