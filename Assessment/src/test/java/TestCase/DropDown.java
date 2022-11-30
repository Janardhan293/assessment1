package TestCase;

import Utilities.Common_Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class DropDown extends Common_Functions {
    WebDriver driver = null;

    @BeforeClass
    public void launchBrowser() throws IOException {
        driver = browserLaunch2();
    }
    @Test
    public void toHandleDropDown() throws InterruptedException
    {
        Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
        dropdown.selectByIndex(2);
        Thread.sleep(5000);
        dropdown.selectByValue("search-alias=mi");
        Thread.sleep(5000);
        dropdown.selectByVisibleText("Books");
        Thread.sleep(5000);
    }
    @AfterClass
    public void teardown() {
        driver.quit();
    }
}