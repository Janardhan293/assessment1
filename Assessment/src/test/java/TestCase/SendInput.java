package TestCase;

import Utilities.Common_Functions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ObjectRepo.*;
import java.io.IOException;

public class SendInput extends Common_Functions {
    WebDriver driver = null;
    Locators locators = null;

    @BeforeClass
    public void launchBrowser() throws IOException {
        driver = browserLaunch2();
        locators = new Locators(driver);
    }
    @Test
    public void sendKeyToTextbox() throws InterruptedException{
        click(locators.getSend());
        sendKeys(locators.getSend(),"Appium");
        Thread.sleep(5000);
    }
    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
