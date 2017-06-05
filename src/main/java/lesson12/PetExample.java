package lesson12;

/**
 * Created by Yevhen on 24.05.2017.
 */
public abstract class PetExample {

    protected boolean isHungry = false;

    public abstract void voice();

    public abstract void move();

    public boolean isHungry(){
        return isHungry;
    }


}
