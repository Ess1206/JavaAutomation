package lesson6.homework6;

import java.awt.event.HierarchyBoundsAdapter;
import java.security.PublicKey;

/**
 * Created by Yevhen on 26.04.2017.
 */
public class Pupil extends Human {

    private String schoolNumberOrName = "1";
    private String yearOfStartingSchool = "2";
    private String yearOfEndingSchool = "3";

    Pupil(String name, String lastname, String age, String sex, String schoolNumberOrName, String yearOfStartingSchool, String yearOfEndingSchool ){
        super(name,lastname,age,sex);
        this.schoolNumberOrName = schoolNumberOrName;
        this.yearOfStartingSchool = yearOfStartingSchool;
        this.yearOfEndingSchool = yearOfEndingSchool;

    }

    public void setSchoolNumberOrName(String schoolNumberOrName){
        this.schoolNumberOrName = schoolNumberOrName;
    }
    public void setYearOfStartingSchool(String yearOfStartingSchool){
        this.yearOfStartingSchool = yearOfStartingSchool;
    }
    public void setYearOfEndingSchool(String yearOfEndingSchool){
        this.yearOfEndingSchool = yearOfEndingSchool;
    }

    public String getSchoolNumberOrName(){
        return schoolNumberOrName;
    }

    public String getYearOfStartingSchool(){
        return yearOfStartingSchool;
    }

    public String getYearOfEndingSchool(){
        return yearOfEndingSchool;
    }

    public String getInfoPupil(){
        return schoolNumberOrName + " " + yearOfEndingSchool + " " + yearOfStartingSchool + "  " + getLastname() + " " + getName() + " " + getSex() + " " + getAge() ;
    }

    public static void main(String[] args) {
        Pupil info = new Pupil("1","2", "3","4", "5", "6","7");
        System.out.print(info.getInfoHuman());

    }


}
