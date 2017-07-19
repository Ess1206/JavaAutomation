package Lesson21;

import org.testng.annotations.Test;

/**
 * Created by Stan on 05.07.2017.
 */
public class TestEnum {
    @Test
    public void aVoid(){
        ERROR invalide = ERROR.INVALIDE_EMAIL;
        System.out.println(invalide);
    }
}
