package lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Yevhen on 26.04.2017.
 */
public class ArrayExample {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> list1 = new LinkedList<>();

        list.add("user");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }

        for(String text: list){
            System.out.println(text);
        }


        for(String text : list){
            System.out.println(text);
        }
    }

}
