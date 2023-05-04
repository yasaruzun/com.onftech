package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.Onftech;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class OnftechStepDefinitions {

        Onftech onftech=new Onftech();
        Actions actions=new Actions(Driver.getDriver());



    @Given("Launch browser and Navigate to the {string}")
    public void launch_browser_and_navigate_to_the(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("click to the Contact Us icon")
    public void click_to_the_contact_us_icon() {
        ReusableMethods.bekle(2);

        onftech.contactUsIcon.click();

        ReusableMethods.bekle(2);
    }
    @Given("Verify that Contact Us page is visible successfully")
    public void verify_that_contact_us_page_is_visible_successfully() {

        Assert.assertTrue(onftech.contactUsLetter.isDisplayed());


    }

    @Then("verify that user is in the contact us page")
    public void verify_that_user_is_in_the_contact_us_page() {

        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("contactUs"));


    }
    @Then("type the required information to send a message")
    public void type_the_required_information_to_send_a_message() {
        actions=new Actions(Driver.getDriver());

        ReusableMethods.bekle(2);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.bekle(2);

        actions.click(onftech.namePlace).
                sendKeys(ConfigReader.getProperty("name")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("email")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("subject")).
                sendKeys(Keys.TAB).
                sendKeys("message").
                perform();

        ReusableMethods.bekle(2);

    }
    @Then("click to the send message button")
    public void click_to_the_send_message_button() {

    onftech.sendMessageButton.click();

    ReusableMethods.waitForPageToLoad(10);
    }
    @Then("verify that the message is sent")
    public void verify_that_the_message_is_sent() {


    Assert.assertFalse(onftech.contactUsLetter.isDisplayed());

    ReusableMethods.bekle(2);
    }


}
