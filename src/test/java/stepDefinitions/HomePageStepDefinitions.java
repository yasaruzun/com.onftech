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

    @Given("User goes to {string}")
    public void userGoesTo(String UserUrl) {Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
    }

    @Given("Home Page is display {string}")
    public void home_page_is_display(String expectUrl) {
        homePage = new HomePage();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectUrl));

    }


    @Then("About us page is display")
    public void about_us_page_is_display() {

        String expected="about";
        String actual=Driver.getDriver().getCurrentUrl();

    }

    @Then("closes the page")
    public void closes_the_page() {
        homePage = new HomePage();
        Driver.closeDriver();

    }


    @Then("User goes to About us page")
    public void userGoesToAboutUsPage() {
        homePage.AboutUsLink.click();
    }

    @And("QUALITY AND REASONABLE PRICES text is display")
    public void qualıtyANDREASONABLEPRICESTextIsDisplay() {

        String actualtext=homePage.QualityAndReasoanblePriceText.getText();
        String expectedtext="QUALITY AND REASONABLE PRICES";
        Assert.assertEquals(expectedtext, actualtext);

    }

    @Then("Client Worldwide board get text is displayed")
    public void client_worldwide_board_get_text_is_displayed() {

        Assert.assertTrue(homePage.clientWorldwidetext.getText().contains("11,000+"));

    }
    @Then("Successful Project board get text is displayed")
    public void successful_project_board_get_text_is_displayed() {
        Assert.assertTrue(homePage.SuccesfulProjecttext.getText().contains("42M+"));

    }
    @Then("Work Employed board get text is displayed")
    public void work_employed_board_get_text_is_displayed() {
        Assert.assertTrue(homePage.workemployedtext.getText().contains("8.3M+"));

         }
    @Then("Planning Services board get text is displayed")
    public void planning_services_board_get_text_is_displayed() {
        Assert.assertTrue(homePage.PlanningServicetext.getText().contains("295"));
       }
    @Then("Online Shopping Easy Cost-Efficient text is displayed")
    public void online_shopping_easy_cost_efficient_text_is_displayed() {
        String actualtext=homePage.onlineSoppingtext.getText();
        String expectedtext="ONLINE SHOPPING EASY AND COST-EFFICIENT";
        Assert.assertEquals(expectedtext, actualtext);
    }
    @Then("Team Member text is displayed")
    public void team_member_text_is_displayed() {
        String actualtext=homePage.TeamMemberText.getText();
        String expectedtext="TEAM MEMBER";
        Assert.assertEquals(expectedtext, actualtext);
    }
    @Then("Robert Pattinson picture and station is displayed")
    public void robert_pattinson_picture_and_station_is_displayed() {
        Assert.assertTrue(homePage.RobertPattinson.getText().contains("Founder & CEO"));
        Assert.assertTrue(homePage.RobertThumb.isDisplayed());

    }
    @Then("Johnny Depp picture and station is displayed")
    public void johnny_depp_picture_and_station_is_displayed() {
        Assert.assertTrue(homePage.JohnyDepp.getText().contains("Founder & CEO"));
        Assert.assertTrue(homePage.JohnnyThumb.isDisplayed());
    }
    @Then("Jason Statham picture and station is displayed")
    public void jason_statham_picture_and_station_is_displayed() {
        Assert.assertTrue(homePage.JasonStatham.getText().contains("Founder & CEO"));
        Assert.assertTrue(homePage.JasonThumb.isDisplayed());
    }
    @Then("Bradley Cooper picture and station is displayed")
    public void bradley_cooper_picture_and_station_is_displayed() {
        Assert.assertTrue(homePage.HarryCooper.getText().contains("Founder & CEO"));
        Assert.assertTrue(homePage.HarryThumb.isDisplayed());
    }
    @And("cookies canceled")
    public void cookiesCanceled() {
        homePage.SubscribeLink.click();
    }
    @And("contact  click")
    public void contactClick() {
        homePage.contacUs.click();
    }
    @And("enter name")
    public void enterName() {
        homePage.boxEnterName.sendKeys("ali");
    }
    @And("enters his e-mail")
    public void entersHisEMail() {
        homePage.boxEnterEmailAddress.sendKeys("ali@gm.com");
    }
    @And("select dropdawn")
    public void selectDropdawn() {
        homePage.installationCustomerProductReturns.click();
        homePage.productReturns.sendKeys("customer");
    }
    @And("write message")
    public void writeMessage() {
        homePage.boxWriteMessage.sendKeys("deneme");
    }
    @And("send message")
    public void sendMessage() {
        homePage.buttonSendMessage.click();
    }
}


