package lesson3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yevhen on 10.04.2017.
 */
public class ForEachExample {

    public static void main(String args[]){

        List<String> names = new ArrayList<String>();

        names.add("Kolya");
        names.add("Zhenia");
        names.add("Vitalya");
        names.add("Vasya");

    for(String name : names) {
        System.out.println(name);
    }

    }

}
