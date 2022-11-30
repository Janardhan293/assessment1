package TestCase;

import Utilities.Common_Functions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.File;
import ObjectRepo.*;
import java.io.IOException;

public class TakeScreenshot extends Common_Functions {
    WebDriver driver = null;
    Locators locators = null;

    @BeforeClass
    public void launchBrowser() throws IOException {
        driver = browserLaunch1();
        locators = new Locators(driver);
    }
    @Test
    public void toTakeScreenShot() throws IOException {
        TakesScreenshot t = (TakesScreenshot)driver;
        File src = t.getScreenshotAs(OutputType.FILE);
        File dest = new File("./src/main/screenshot.jpg");
        FileUtils.copyFile(src,dest);
    }
    @AfterClass
    public void teardown() {
        driver.quit();
    }
}