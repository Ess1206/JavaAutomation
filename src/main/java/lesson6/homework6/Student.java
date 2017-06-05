package lesson6.homework6;

/**
 * Created by Yevhen on 26.04.2017.
 */
public class Student extends Human {

    private String nameOfUniversity = "1";
    private String typeOfEducation = "2";
    private String yearOfEndingUniver = "3";

    Student(String name, String lastname, String age, String sex, String nameOfUniversity, String typeOfEducation, String yearOfEndingUniver) {
        super(name, lastname, age, sex);
        this.nameOfUniversity = nameOfUniversity;
        this.typeOfEducation = typeOfEducation;
        this.yearOfEndingUniver = yearOfEndingUniver;

    }


    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public void setTypeOfEducation(String typeOfEducation) {
        this.typeOfEducation = typeOfEducation;
    }

    public void setYearOfEndingUniver(String yearOfEndingUniver) {
        this.yearOfEndingUniver = yearOfEndingUniver;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public String getTypeOfEducation() {
        return typeOfEducation;
    }

    public String getYearOfEndingUniver() {
        return yearOfEndingUniver;
    }

    public String getInfoStudent() {
        return nameOfUniversity + " " + typeOfEducation + " " + yearOfEndingUniver + " " + getName() + " " + getLastname() + " " + getAge() + " " + getSex();
    } // метода для печати инфо

    public static void main(String[] args) {
        System.out.println();
    }

}

