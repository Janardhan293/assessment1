package TestCase;

import Utilities.Common_Functions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.File;
import ObjectRepo.*;
import java.io.IOException;

public class DropDown extends Common_Functions {
    WebDriver driver = null;

    @BeforeClass
    public void launchBrowser() throws IOException {
        driver = browserLaunch2();
    }
    @Test
    public void toHandle() throws IOException
    {
        Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
        dropdown.selectByIndex(2);
        dropdown.selectByValue("search-alias=mi");
        dropdown.selectByVisibleText("Books");
    }
}