package lesson6.homework6;

/**
 * Created by Yevhen on 26.04.2017.
 */
public class Human {

    private String name = "1";
    private String lastname = "2";
    private String age = "3";
    private String sex = "4";

    Human(String name, String lastname, String age, String sex) {

        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getInfoHuman(){
        return name + ", " + ", " + lastname + ", " + ", " + age + ", " + sex;
    }



    }

