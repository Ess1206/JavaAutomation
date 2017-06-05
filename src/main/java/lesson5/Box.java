package lesson5;

/**
 * Created by Yevhen on 19.04.2017.
 */
public class Box {

    public double width; //ширина
    public double height; //высота
    public double depth; // глубина

    public void volume(){
        System.out.println("Обьем равен ");
        System.out.println(width * height * depth);
    }

}
