package TestCase;

import Utilities.Common_Functions;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ObjectRepo.*;

import java.io.File;
import java.io.IOException;

public class QUESTION2 extends Common_Functions {
    WebDriver driver = null;
    Locators locators = null;

    @BeforeClass
    public void launchBrowser() throws IOException {
        driver = browserLaunch1();
        locators = new Locators(driver);

    }

    @Test
    public void sendKeys(WebElement sendKeys) {

        //WebDriver driver = new ChromeDriver();
        driver.get("");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("APPIUM");
    }
}
