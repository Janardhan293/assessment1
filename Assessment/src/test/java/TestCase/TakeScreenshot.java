package TestCase;

import Utilities.Common_Functions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
    public void toTakeScreenShot() throws IOException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        TakesScreenshot t = (TakesScreenshot)driver;
        File src = t.getScreenshotAs(OutputType.FILE);
        File dest = new File("./Janardhan/Desktop");
        FileUtils.copyFile(src,dest);
    }
}