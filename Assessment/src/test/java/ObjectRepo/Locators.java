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
    @FindBy(name = "email")//for name
    private WebElement name;
    @FindBy(tagName = "logo-icon")
    private WebElement tagName;//for Tagname
    @FindBy(className = "nav-line-1-container") //classname
    private  WebElement className;
    @FindBy(linkText = "Returns")//linktext
    private  WebElement linktext;
    @FindBy(partialLinkText = "Today's") //paralinktext
    private WebElement paralinktext;
    @FindBy(id="logo-icon")//id
    private WebElement id;
    @FindBy(css = "a[id=nav-cart]")//cssselector
    private WebElement css;
    @FindBy(xpath = "//a[@href='https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&']")
    private WebElement xpath; //xpath

    @FindBy(id = "twotabsearchtextbox")
    private WebElement send;

    public WebElement getSend() {
        return send;
    }

    public WebElement getClassName() {
        return className;
    }

    public WebElement getCss() {
        return css;
    }

    public WebElement getId() {
        return id;
    }

    public WebElement getLinktext() {
        return linktext;
    }

    public WebElement getParalinktext() {
        return paralinktext;
    }

    public WebElement getName() {
        return name;
    }

    public WebElement getTagName() {
        return tagName;
    }

    public WebElement getXpath() {
        return xpath;
    }
}