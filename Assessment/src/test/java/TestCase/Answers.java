package TestCase;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ObjectRepo.*;

import java.io.File;
import java.io.IOException;

public class Answers {
    WebDriver driver = null;
    Locators locators = null;

    @BeforeClass
    public void launchBrowser() throws IOException {


    }

    @Test
            public void Locators()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
    }



}
