package lesson14;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stan on 07.06.2017.
 */
public class ExampleMultiParam {
    List<String> recipienceList = new ArrayList<>();

    public void setRecipienceList(String ... recipiencs){
        for (String recipient : recipiencs){
            recipienceList.add(recipient);
        }

    }

    @Test
    public void testMutiply(){
        setRecipienceList("stas ", "test" , "sdfsdf");
    }
}


