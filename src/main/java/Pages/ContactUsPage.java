package Pages;

import Elements.ContactUs_Elements;
import Elements.HomePage_Elements;
import Utility.Browsers;
import javafx.beans.property.SetProperty;
import org.openqa.jetty.html.Page;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Owner on 03/08/2017.
 */
public class ContactUsPage {

    WebDriver driver;
    ContactUs_Elements contactUs_elements = PageFactory.initElements(driver, ContactUs_Elements.class);

    public void launchQAWorks() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();

        PageFactory.initElements(this.driver, this);
        driver.get(contactUs_elements.qaQAworksURL);
    }


    public void clickOnContactUs() {
        System.out.println("********************** I have reaced to click on Contact us Page");
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        contactUs_elements.contactUsClick.click();
    }

    public String enterUserName(String entersName) {
        contactUs_elements.name.sendKeys(entersName);
        return entersName;
    }

    public String enterEmail(String entersEmail) {
        contactUs_elements.email.sendKeys(entersEmail);
        return entersEmail;
    }

    public String enterMessage(String entersMessage) {
        contactUs_elements.message.sendKeys(entersMessage);
        return entersMessage;
    }

    public void clickOnSendButton() {
        contactUs_elements.send.click();
    }

}
