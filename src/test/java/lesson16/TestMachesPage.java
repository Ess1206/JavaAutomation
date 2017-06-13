package lesson16;

import core.BrowserFactory;
import core.PageObjects.MatchPage;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Stan on 12.06.2017.
 */
public class TestMachesPage extends BrowserFactory {
    MatchPage matchPage = new MatchPage();

    @Test
    public void machesTest() throws InterruptedException {
        new TestLogin().doLogin();
        driver.get("https://kismia.com/matches");
        matchPage.open();
        System.out.println(matchPage.getCurrentUserID());
        List<String> dislikeuser = matchPage.disLikeUser(3);
        Map<String, Integer> resultMap = countDupllicates(dislikeuser);

        System.out.println(resultMap);


    }

    public Map<String, Integer> countDupllicates(List<String> dislikeuserList) {
        Map<String, Integer> dublicatesMap = new HashMap();
        for (String uid :
                dislikeuserList) {
            if (dublicatesMap.containsKey(uid)) {
                dublicatesMap.put(uid, dublicatesMap.get(uid) + 1);
            } else {
                dublicatesMap.put(uid, 1);
            }

        }
        return dublicatesMap;
    }

}
