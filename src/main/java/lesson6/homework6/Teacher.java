package lesson6.homework6;

/**
 * Created by Yevhen on 26.04.2017.
 */
public class Teacher extends Human {

    private String subjectName = "1";

   Teacher(String name, String lastname, String age, String sex, String subjectName){
        super(name, lastname, age, sex);
        this.subjectName = subjectName;
    }


    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public String getInfoTeacher() {
        return subjectName+ " " + getName() + " " + getLastname() + " " + getAge() + " " + getSex();
    } // метода для печати инфо

    }





