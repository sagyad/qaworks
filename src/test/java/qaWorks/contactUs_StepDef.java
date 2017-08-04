package qaWorks;

import Pages.ContactUsPage;
import Pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

/**
 * Created by Owner on 03/08/2017.
 */
public class contactUs_StepDef {
    ContactUsPage contactUsPage = new ContactUsPage();

    @Given("^I am QAWorks Site$")
    public void i_am_QAWorks_Site() throws Throwable {
        contactUsPage.launchQAWorks();
    }

    @Given("^I click on Contact$")
    public void i_click_on_Contact() throws Throwable {
        contactUsPage.clickOnContactUs();
    }


    @Given("^I enter name as \"([^\"]*)\"$")
    public void i_enter_name_as(String name) throws Throwable {
        contactUsPage.enterUserName(name);
    }

    @Given("^I enter email as \"([^\"]*)\"$")
    public void i_enter_email_as(String email) throws Throwable {
        contactUsPage.enterEmail(email);
    }

    @Given("^I enter my message as \"([^\"]*)\"$")
    public void i_enter_my_message_as(String message) throws Throwable {
        contactUsPage.enterMessage(message);
    }

    @When("^I click on \"([^\"]*)\" button$")
    public void i_click_on_button(String arg1) throws Throwable {
        contactUsPage.clickOnSendButton();
    }
}
