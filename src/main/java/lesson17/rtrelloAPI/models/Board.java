package lesson17.rtrelloAPI.models;

/**
 * Created by Stan on 19.06.2017.
 */
public class Board {
    public String id;
    public String name;
    public String desc;

    @Override
    public String toString() {
        return "Board{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
