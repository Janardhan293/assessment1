package TestCase;

import Utilities.Common_Functions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ObjectRepo.*;
import java.io.IOException;
import java.util.Objects;

public class WebPageAssertion extends Common_Functions {
    WebDriver driver = null;
    Locators locators = null;

    @BeforeClass
    public void launchBrowser() throws IOException {
        driver = browserLaunch1();
        locators = new Locators(driver);
    }
    @Test
    public void getTitle() {
        String title1 = driver.getTitle();
        String title2 = "YouTube";
        Assert.assertEquals(title1,title2);
        if (Objects.equals(title1, title2)) {
            System.out.println("Title matched");
        }
        else {
            System.out.println("Title not matched");
        }
    }
    @AfterClass
    public void teardown() {
        driver.quit();
    }
}