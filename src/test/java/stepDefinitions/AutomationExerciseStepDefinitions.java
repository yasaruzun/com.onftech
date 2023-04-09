package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.geom.RectangularShape;

public class AutomationExerciseStepDefinitions {


    AutomationExercise automationExercise=new AutomationExercise();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();

    @Given("Launch browser and Navigate to url {string}")
    public void launchBrowserAndNavigateToUrl(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String expectedUrl= Driver.getDriver().getCurrentUrl();
        String actualUrl=ConfigReader.getProperty("url");
        Assert.assertEquals(expectedUrl,actualUrl);

    }

    @Then("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {

        Assert.assertTrue(automationExercise.newUserSingupText.isDisplayed());

    }
    @Then("Enter name and email address")
    public void enter_name_and_email_address() {
        actions=new Actions(Driver.getDriver());
    automationExercise.nameBox.sendKeys(ConfigReader.getProperty("name"));
    actions.sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress()).perform();

    }
    @Then("Click Signup button")
    public void click_signup_button() {
    automationExercise.singupButton.click();
    ReusableMethods.bekle(2);

    }
    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {

        Assert.assertTrue(automationExercise.enterAccountText.isDisplayed());

    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() throws InterruptedException {

        actions=new Actions(Driver.getDriver());
    automationExercise.titleGender.click();

    automationExercise.passwordBox.sendKeys(faker.internet().password());

    actions.sendKeys(Keys.PAGE_DOWN).perform();

    automationExercise.days.sendKeys("5");
    automationExercise.month.sendKeys("june");
    automationExercise.year.sendKeys("2000");


    }
    @Then("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {

        automationExercise.newsLetterButton.click();
        ReusableMethods.bekle(3);


    }
    @Then("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {

        automationExercise.optinButton.click();

    }
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        actions=new Actions(Driver.getDriver());
        actions.click(automationExercise.firstNameBox).
                sendKeys(ConfigReader.getProperty("name")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("lastname")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("company")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("address")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("address2")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("country")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("state")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("city")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("zipcode")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("mobilenumber")).
                perform();
 ;




    }
    @Then("Click Create Account button")
    public void click_create_account_button() {
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        automationExercise.createAccount.click();
        ReusableMethods.bekle(1);


    }
    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        Assert.assertTrue(automationExercise.accountCreatedText.isDisplayed());
    }
    @Then("Click Continue button")
    public void click_continue_button() {
        automationExercise.continueButton.click();

        ReusableMethods.bekle(1);

    }
    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(automationExercise.loggedInAs.isDisplayed());

    }
    @Then("Click Delete Account button")
    public void click_delete_account_button() {
        automationExercise.deleteAccount.click();
        ReusableMethods.bekle(2);

    }
    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
        Assert.assertTrue(automationExercise.accountDeledtedText.isDisplayed());
        automationExercise.continueButton.click();
        ReusableMethods.bekle(2);
    }

    @Then("Click on Signup Login button")
    public void clickOnSignupLoginButton() {
        automationExercise.singUpLoginButton.click();
        ReusableMethods.bekle(3);

    }


}
