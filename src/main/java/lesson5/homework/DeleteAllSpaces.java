package lesson5.homework;

/**
 * Created by Yevhen on 02.05.2017.
 */
public class DeleteAllSpaces {
    public static void main(String[] args) {


        String remspaces = new String("y e v g e n i y");

        String withoutspaces = remspaces.replaceAll("\\s", "");

        System.out.println(withoutspaces);

    }

}
