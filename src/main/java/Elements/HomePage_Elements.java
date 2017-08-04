package Elements;

import Utility.Browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Owner on 03/08/2017.
 */
public class HomePage_Elements {
    WebDriver driver;


    @FindBy(linkText = "Contact")
    public WebElement contactUs;



    public HomePage_Elements(WebDriver driver) {
        this.driver = driver;
    }

}
