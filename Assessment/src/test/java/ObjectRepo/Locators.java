package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Locators {
    public Locators(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //for name
    @FindBy(name = "")
    private WebElement username;
    //for Tagname
    @FindBy(tagName = "logo-icon")
    private WebElement tagName;
    //classname
    @FindBy(className = "ytd-searchbox")
    private  WebElement className;
    //linktext

    //paralinktext

    //id
    @FindBy(id="logo-icon")
    private WebElement id;
    //cssselector

    //xpath


}