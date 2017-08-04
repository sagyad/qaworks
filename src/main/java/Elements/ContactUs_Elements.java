package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import sun.awt.windows.WEmbeddedFrame;

/**
 * Created by Owner on 03/08/2017.
 */
public class ContactUs_Elements {
    WebDriver driver;
    public static String qaQAworksURL = "http://qaworks.com/";

    public ContactUs_Elements(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(xpath = ".//*[@id='menu']/li[1]/a")
    public WebElement contactUsClick;

    @FindBy(id = "ctl00_MainContent_NameBox")
    public WebElement name;

    @FindBy(id = "ctl00_MainContent_EmailBox")
    public WebElement email;

    @FindBy(id = "ctl00_MainContent_MessageBox")
    public WebElement message;

    @FindBy(id = "ctl00_MainContent_SendButton")
    public WebElement send;
}
