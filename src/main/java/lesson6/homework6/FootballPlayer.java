package lesson6.homework6;

/**
 * Created by Yevhen on 27.04.2017.
 */
public class FootballPlayer extends Human {

    private String club = "Dynamo";
    private String country = "Ukraine";

    FootballPlayer(String name, String lastname, String age, String sex, String club, String country) {
        super(name, lastname, age, sex);
        this.club = club;
        this.country = country;

    }

    public void setClub(String club){

        this.club = club;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getClub(){
        return club;
    }

    public String getCountry(){
        return country;
    }

    public String getInfoFootballPlayer(){
        return club + " " + country + " " + getName() + " " + getLastname() + " " + getAge() + " " + getSex();
    }

}
