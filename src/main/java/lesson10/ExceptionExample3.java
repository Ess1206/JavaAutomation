package lesson10;

import java.io.File;
import java.io.IOException;

/**
 * Created by Yevhen on 17.05.2017.
 */
public class ExceptionExample3 {

    public static void main(String[] args) throws IOException {

        File file = new File("\\,sad\\ASD");

        file.createNewFile(); //
    }


}
