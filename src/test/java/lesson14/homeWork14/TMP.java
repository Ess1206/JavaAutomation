package lesson14.homeWork14;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Stan on 04.06.2017.
 */
public class TMP {
    @Test
    @Parameters({"email","pass"})
    public void login(String email, String password){

        System.out.println(email + password);

    }
}
