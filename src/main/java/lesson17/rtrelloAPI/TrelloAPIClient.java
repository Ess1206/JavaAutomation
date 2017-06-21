package lesson17.rtrelloAPI;

import com.google.gson.Gson;

import com.google.gson.reflect.TypeToken;
import lesson17.rtrelloAPI.models.Board;
import lesson17.rtrelloAPI.models.TrelloList;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Stan on 14.06.2017.
 */
public class TrelloAPIClient {

    Gson gson = new Gson();
    OkHttpClient okHttpClient = new OkHttpClient();

    public static final String KEY = "c136310d18b57b1dd5b2d2085f1adc65";
    public static final String TOKEN = "81d682396476fbdf4462d073b8bf40c24f8eb848ea7494e443087e7061a79fe0";
    public static final String BASE_URL = "https://api.trello.com/1/"; //https://api.trello.com/1/boards/tBmYPSYe?key=[key]&token=[token]
    public static final String Board_ID = "1COKtHTR";

    public Board getBoard() throws IOException {
        String url = BASE_URL + "boards/" + Board_ID + "?key=" + KEY + "&token=" + TOKEN;
        Request request = new Request.Builder().url(url).build();
        String respJeson = okHttpClient.newCall(request).execute().body().string();
        return gson.fromJson(respJeson, Board.class);
        // return okHttpClient.newCall(request).execute().body().string();
    }

    public String createList(String board_ID, String listName) throws IOException {
        String url = BASE_URL + "List" + "?key=" + KEY + "&token=" + TOKEN;
        RequestBody requestBody = new FormBody.Builder()
                .add("name", listName)
                .add("idBoard", "594172cd025464aacd4e69e0").build();
        Request request = new Request.Builder().post(requestBody).url(url).build();

        return okHttpClient.newCall(request).execute().body().string();
    }

    public String getBoard_List(String idboard) throws IOException {
        String url = BASE_URL + "boards/" + Board_ID + "/lists" + "?key=" + KEY + "&token=" + TOKEN;
        Request request = new Request.Builder().url(url).build();
        return okHttpClient.newCall(request).execute().body().string();
    }

    public List<TrelloList> getBoardLists(String board_ID) throws IOException {
        String url = BASE_URL + "boards/" + Board_ID + "/lists" + "?key=" + KEY + "&token=" + TOKEN;
        Request request = new Request.Builder().url(url).build();
        String json = okHttpClient.newCall(request).execute().body().string();
        Type type = new TypeToken<List<TrelloList>>(){}.getType();
        return gson.fromJson(json,type);
    }

    public String createCard (String list_ID, String name) throws IOException {
        String url = BASE_URL + "boards/" + Board_ID + "/lists" + "?key=" + KEY + "&token=" + TOKEN;
        RequestBody requestBody = new FormBody.Builder()
                .add("name", name)
                .add("idList", list_ID).build();
        Request request = new Request.Builder().post(requestBody).url(url).build();

        return okHttpClient.newCall(request).execute().body().string();
    }



    @Test
    public void testTrello() throws IOException {
      //  System.out.println(getBoard());

        Board board = getBoard();
     //   System.out.println(getBoard_List(board.id));

        List<TrelloList> boardsList = getBoardLists(board.id);
        for (TrelloList trelloList: boardsList
             ) {
            System.out.println(createCard(trelloList.id,"stan"));

        }

    }

    @Test
    public void createnewList() throws IOException {
        Board board = getBoard();
        System.out.println(createList(board.id, "newCards & List"));
    }


}
