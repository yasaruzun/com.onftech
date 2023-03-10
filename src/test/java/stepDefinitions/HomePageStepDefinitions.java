package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePageStepDefinitions {


    HomePage homePage=new HomePage();
    @Given("go to the {string}")
    public void go_to_the(String istenenUrl) {
        homePage=new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }
    @Then("test that the url contains {string}")
    public void testThatTheUrlContains(String istenenkelime) {
        homePage=new HomePage();
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenkelime));

    }

    @Then("sayfayi kapat")
    public void sayfayiKapat() {
        homePage=new HomePage();
        Driver.closeDriver();


    }
}
