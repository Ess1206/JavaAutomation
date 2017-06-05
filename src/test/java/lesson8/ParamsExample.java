package lesson8;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Yevhen on 10.05.2017.
 */
public class ParamsExample {

    @Test
    @Parameters({"email","password"})
    public void login(String email, String password){

        System.out.println(email + password);

    }

}
