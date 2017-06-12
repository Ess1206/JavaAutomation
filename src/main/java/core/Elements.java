package core;

import org.openqa.selenium.By;

import static core.MethodsFactory.getDriver;

/**
 * Created by Stan on 07.06.2017.
 */
public class Elements {
    public  Elements(By by , String name){
        this.by = by;
        this.name = name;
    };
    public  Elements(By by ){
        this.by = by;
    };

    private int waitTime = 15;
    private By by;
    private String name = "";


    public void click(){
        getDriver().findElement(by).click();
    }

}
