package stepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;


public class HomePageStepDefinitions {


    HomePage homePage = new HomePage();

    @Given("go to the {string}")
    public void go_to_the(String istenenUrl) {
        homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @Then("test that the url contains {string}")
    public void testThatTheUrlContains(String istenenkelime) {
        homePage = new HomePage();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenkelime));

    }

    @Then("sayfayi kapat")
    public void sayfayiKapat() {
        homePage = new HomePage();
        Driver.closeDriver();

    }

    @Given("User goes to Url")
    public void user_goes_to_url() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Home Page is display")
    public void home_page_is_display() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User goes to About us page")
    public void user_goes_to_about_us_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("About us page is display")
    public void about_us_page_is_display() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("closes the page")
    public void closes_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}


