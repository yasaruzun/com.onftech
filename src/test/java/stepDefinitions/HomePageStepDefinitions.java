package stepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.By;
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

    @Then("close the page")
    public void closeThePage() {
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


    @Then("confirm that the title is Trendlifebuy Online Shopping")
    public void confirmThatTheTitleIsTrendlifebuyOnlineShopping() {
        homePage = new HomePage();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Trendlifebuy Online Shopping";

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @Then("click to the Play Store link")
    public void click_to_the_play_store_link() {
        homePage = new HomePage();
        homePage.playStoreLinki.click();

    }

    @Then("test that it should be redirected to play store page")
    public void test_that_it_should_be_redirected_to_play_store_page() {
        homePage = new HomePage();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://play.google.com/store/games";
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    @Then("nagigate back to the home page from play store page")
    public void nagigate_back_to_the_home_page_from_play_store_page() {
        homePage = new HomePage();
        Driver.getDriver().navigate().back();

    }

    @Then("wait {int} second")
    public void wait_second(int saniye) {
        homePage = new HomePage();
        try {
            Thread.sleep(1000 * saniye);
        } catch (InterruptedException e) {

        }

    }

    @Then("click to the apple store link")
    public void click_to_the_apple_store_link() {
        homePage = new HomePage();
        homePage.appStoreLinki.click();

    }

    @Then("test that it should be redirected to apple store page")
    public void test_that_it_should_be_redirected_to_apple_store_page() {
        homePage = new HomePage();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.apple.com/app-store/";
        Assert.assertEquals(expectedUrl, actualUrl);


    }

    @And("click subscribe quick")
    public void clickSubscribeQuick() {
        homePage = new HomePage();
        homePage.subscribeQuick.click();

    }
}



