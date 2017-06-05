package lesson12;

/**
 * Created by Yevhen on 24.05.2017.
 */
public class Dog extends PetExample {

    @Override
    public void voice(){
        System.out.println("Gaf Gaf");
        isHungry = false;
    }

    @Override
    public void move(){
        if(isHungry) {
            System.out.println("I need food");
            return;
        }
        System.out.println("Ok, I'll walk a little");
    }

    public static void main(String[] args) {

        PetExample myPuppy = new Dog();
        myPuppy.voice();
        myPuppy.move();

    }

}
