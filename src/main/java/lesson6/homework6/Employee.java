package lesson6.homework6;

/**
 * Created by Yevhen on 26.04.2017.
 */
public class Employee extends Human {

    private String workPlace = "1";
    private String yearOfExp = "1";
    private String position = "1";

    Employee(String workPlace, String yearOfExp, String position, String name, String lastname, String age, String sex) {
        super(name, lastname, age, sex);
        this.workPlace = workPlace;
        this.yearOfExp = yearOfExp;
        this.position = position;
    }


    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public void setYearOfExp(String yearOfExp) {
        this.yearOfExp = yearOfExp;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public String getYearOfExp() {
        return yearOfExp;
    }

    public String getPosition() {
        return position;
    }

    public String getInfoEmployee(){
        return workPlace + " " + yearOfExp + " " + position + " " + getName() + " " + getLastname() + " " + getAge() + " " + getSex();
    }

    @Override

    public String toString() {
        return "Employee{" +
                "workPlace='" + workPlace + '\'' +
                ", yearOfExp='" + yearOfExp + '\'' +
                ", position='" + position + '\'' +
                "} " + super.toString();
    }
}
