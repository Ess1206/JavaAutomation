package core;

import org.openqa.selenium.JavascriptExecutor;

import static core.MethodsFactory.getDriver;

/**
 * Created by Stan on 07.06.2017.
 */
public class JsExecuter {
    private static JavascriptExecutor executor(){
        return (JavascriptExecutor)getDriver();
    }
    public static Object executeScript(String script , Object ... arg){
        return executor().executeScript(script,arg);
    }

}
