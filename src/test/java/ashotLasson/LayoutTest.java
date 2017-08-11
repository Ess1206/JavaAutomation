package ashotLasson;

import core.BrowserFactory;
import core.GifSequenceWriter;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created by Stan on 26.07.2017.
 */
public class LayoutTest extends BrowserFactory {

    private static String RESOURCES_LAYOUT_DIR = "D:/screen";

    private static String expectedDir = RESOURCES_LAYOUT_DIR+"/expected/";
    private static String actualDir = RESOURCES_LAYOUT_DIR+"/actual/";
    private static String diffDir = RESOURCES_LAYOUT_DIR+"/diff/";
    private static String resultGifs = RESOURCES_LAYOUT_DIR+"/gifs/";

    File folder = new File("/screen");

    private static void createFolders(){
        createFolder(expectedDir);
        createFolder(actualDir);
        createFolder(diffDir);
        createFolder(resultGifs);
    }

    private static void createFolder(String path){
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
    }

    public int getScreenshotsDiff(Screenshot actualScreenshot, String name, int colorDistortion) throws IOException {
        File expectedFile = new File(expectedDir+name+".png");
        File actualFile = new File(actualDir+name+".png");
        ImageIO.write(actualScreenshot.getImage(), "png", actualFile);
        if(!expectedFile.exists() ){
            System.out.println("Скриншота к элементу не существует, создаю копию актуального скриншота: "+name);
            ImageIO.write(actualScreenshot.getImage(), "png", expectedFile);
        }
        Screenshot expectedScreenshot = new Screenshot(ImageIO.read(new File(expectedDir+name+".png")));
        expectedScreenshot.setIgnoredAreas(actualScreenshot.getIgnoredAreas());
        ImageDiff diff = new ImageDiffer().withColorDistortion(colorDistortion).makeDiff(expectedScreenshot, actualScreenshot);
        File diffFile = new File(diffDir+name+".png");
        ImageIO.write(diff.getMarkedImage(), "png", diffFile);


        File[] filesArray = {expectedFile, actualFile, diffFile};
        File gifFile = null;
        try {
            gifFile = GifSequenceWriter.createGIF(filesArray, resultGifs+name);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return diff.getDiffSize();
    }
    @Test
    public void makeScreen()throws IOException{
        driver.manage().window().maximize();

        createFolders();
        driver.get("https://www.google.com.ua");
        //File file = new File( folder.getAbsoluteFile()+"/1.png");

        //Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(300)).takeScreenshot(driver(),driver().findElement(By.cssSelector(".logo-subtext")));
        Screenshot screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, driver().findElement(By.cssSelector(".logo-subtext")));
        int diff = getScreenshotsDiff(screenshot,"screen",15);

        System.out.println("Diff");
        System.out.println(diff);

        Assert.assertTrue(diff==0,"DIFF:"+diff);


//        ImageIO.write(screenshot.getImage(),"png", file);

    }
}
