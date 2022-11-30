package TestCase;
import org.openqa.selenium.*;
import Utilities.Common_Functions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ObjectRepo.*;
import java.io.IOException;
public class Answers extends Common_Functions{
    WebDriver driver = null;
    Locators locators = null;
    @BeforeClass
    public void launchBrowser() throws IOException {
        driver = browserLaunch2();
        locators = new Locators(driver);
    }
    @Test
    public void Locators() throws InterruptedException {
    click(locators.getClassName());
    Thread.sleep(2000);
   click(locators.getXpath());
        Thread.sleep(2000);
    click(locators.getName());
        Thread.sleep(2000);
        driver.navigate().back();
    click(locators.getId());
        Thread.sleep(2000);
    click(locators.getLinktext());
        Thread.sleep(2000);
    click(locators.getTagName());
        Thread.sleep(2000);
    click(locators.getParalinktext());
        Thread.sleep(2000);
    driver.navigate().back();
        Thread.sleep(2000);
    click(locators.getCss());
        Thread.sleep(2000);
    }
}
