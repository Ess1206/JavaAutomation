package lesson14.homeWork14.filter;

/**
 * Created by Stan on 05.06.2017.
 */
public interface FilterFom {
    void openPage(String url);

    void openTab(String tabName);

    void setSex(String sexName);

    void setAgeBefore(int ageBefore);

    void setAgeAfter(int ageAfter);

    void submit( boolean yesNo );
}
