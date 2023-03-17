package stepDefinitions;

import com.google.j2objc.annotations.Weak;
import io.cucumber.java.en.*;
import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;


public class HomePageStepDefinitions {


    HomePage homePage = new HomePage();
    Actions actions=new Actions(Driver.getDriver());
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


    @Given("User goes to {string}")
    public void userGoesTo(String UserUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
    }

        @Given("User goes to Url")
        public void user_goes_to_url () {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();

        }

        @Given("Home Page is display {string}")
        public void home_page_is_display (String expectUrl){
            homePage = new HomePage();
            String actualUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(actualUrl.contains(expectUrl));

        }


        @Then("About us page is display")
        public void about_us_page_is_display () {

            String expected = "about";
            String actual = Driver.getDriver().getCurrentUrl();

        }

        @Then("closes the page")
        public void closes_the_page () {
            homePage = new HomePage();
            Driver.closeDriver();

        }


        @Then("User goes to About us page")
        public void userGoesToAboutUsPage () {
            homePage.AboutUsLink.click();
        }

        @And("QUALITY AND REASONABLE PRICES text is display")
        public void qualıtyANDREASONABLEPRICESTextIsDisplay () {

            String actualtext = homePage.QualityAndReasoanblePriceText.getText();
            String expectedtext = "QUALITY AND REASONABLE PRICES";
            Assert.assertEquals(expectedtext, actualtext);

        }

        @Then("Client Worldwide board get text is displayed")
        public void client_worldwide_board_get_text_is_displayed () {

            Assert.assertTrue(homePage.clientWorldwidetext.getText().contains("11,000+"));

        }
        @Then("Successful Project board get text is displayed")
        public void successful_project_board_get_text_is_displayed () {
            Assert.assertTrue(homePage.SuccesfulProjecttext.getText().contains("42M+"));

        }
        @Then("Work Employed board get text is displayed")
        public void work_employed_board_get_text_is_displayed () {
            Assert.assertTrue(homePage.workemployedtext.getText().contains("8.3M+"));

        }
        @Then("Planning Services board get text is displayed")
        public void planning_services_board_get_text_is_displayed () {
            Assert.assertTrue(homePage.PlanningServicetext.getText().contains("295"));
        }
        @Then("Online Shopping Easy Cost-Efficient text is displayed")
        public void online_shopping_easy_cost_efficient_text_is_displayed () {
            String actualtext = homePage.onlineSoppingtext.getText();
            String expectedtext = "ONLINE SHOPPING EASY AND COST-EFFICIENT";
            Assert.assertEquals(expectedtext, actualtext);
        }
        @Then("Team Member text is displayed")
        public void team_member_text_is_displayed () {
            String actualtext = homePage.TeamMemberText.getText();
            String expectedtext = "TEAM MEMBER";
            Assert.assertEquals(expectedtext, actualtext);
        }
        @Then("Robert Pattinson picture and station is displayed")
        public void robert_pattinson_picture_and_station_is_displayed () {
            Assert.assertTrue(homePage.RobertPattinson.getText().contains("Founder & CEO"));
            Assert.assertTrue(homePage.RobertThumb.isDisplayed());

        }
        @Then("Johnny Depp picture and station is displayed")
        public void johnny_depp_picture_and_station_is_displayed () {
            Assert.assertTrue(homePage.JohnyDepp.getText().contains("Founder & CEO"));
            Assert.assertTrue(homePage.JohnnyThumb.isDisplayed());
        }
        @Then("Jason Statham picture and station is displayed")
        public void jason_statham_picture_and_station_is_displayed () {
            Assert.assertTrue(homePage.JasonStatham.getText().contains("Founder & CEO"));
            Assert.assertTrue(homePage.JasonThumb.isDisplayed());
        }
        @Then("Bradley Cooper picture and station is displayed")
        public void bradley_cooper_picture_and_station_is_displayed () {
            Assert.assertTrue(homePage.HarryCooper.getText().contains("Founder & CEO"));
            Assert.assertTrue(homePage.HarryThumb.isDisplayed());
        }
        @And("cookies canceled")
        public void cookiesCanceled () {
            homePage.SubscribeLink.click();
        }
        @And("contact  click")
        public void contactClick () {
            homePage.contacUs.click();
        }
        @And("enter name")
        public void enterName () {
            homePage.boxEnterName.sendKeys("ali");
        }
        @And("enters his e-mail")
        public void entersHisEMail () {
            homePage.boxEnterEmailAddress.sendKeys("ali@gm.com");
        }
        @And("select dropdawn")
        public void selectDropdawn () {
            homePage.installationCustomerProductReturns.click();
            homePage.productReturns.sendKeys("customer");
        }
        @And("write message")
        public void writeMessage () {
            homePage.boxWriteMessage.sendKeys("deneme");
        }
        @And("send message")
        public void sendMessage () {
            homePage.buttonSendMessage.click();}

            @Then("confirm that the title is Trendlifebuy Online Shopping")
            public void confirmThatTheTitleIsTrendlifebuyOnlineShopping () {
                homePage = new HomePage();
                String actualTitle = Driver.getDriver().getTitle();
                String expectedTitle = "Trendlifebuy Online Shopping";

                Assert.assertEquals(expectedTitle, actualTitle);

            }

            @Then("click to the Play Store link")
            public void click_to_the_play_store_link () {
                homePage = new HomePage();
                homePage.playStoreLinki.click();

            }

            @Then("test that it should be redirected to play store page")
            public void test_that_it_should_be_redirected_to_play_store_page () {
                homePage = new HomePage();
                String actualUrl = Driver.getDriver().getCurrentUrl();
                String expectedUrl = "https://play.google.com/store/games";
                Assert.assertEquals(expectedUrl, actualUrl);

            }

            @Then("nagigate back to the home page from play store page")
            public void nagigate_back_to_the_home_page_from_play_store_page () {
                homePage = new HomePage();
                Driver.getDriver().navigate().back();

            }

            @Then("wait {int} second")
            public void wait_second ( int saniye){
                homePage = new HomePage();
                try {
                    Thread.sleep(1000 * saniye);
                } catch (InterruptedException e) {

                }

            }

            @Then("click to the apple store link")
            public void click_to_the_apple_store_link () {
                homePage = new HomePage();
                homePage.appStoreLinki.click();

            }

            @Then("test that it should be redirected to apple store page")
            public void test_that_it_should_be_redirected_to_apple_store_page () {
                homePage = new HomePage();
                String actualUrl = Driver.getDriver().getCurrentUrl();
                String expectedUrl = "https://www.apple.com/app-store/";
                Assert.assertEquals(expectedUrl, actualUrl);


            }

            @And("click subscribe quick")
            public void clickSubscribeQuick () {
                homePage = new HomePage();
                homePage.subscribeQuick.click();


            }

            @Then("verify that the title is Trendlifebuy Online Shopping")
            public void verifyThatTheTitleIsTrendlifebuyOnlineShopping() {

            String actualTitle=Driver.getDriver().getTitle();
            String expectedTitle="Trendlifebuy Online Shopping";

            Assert.assertEquals(expectedTitle,actualTitle);


    }

            @Then("click the Track Your Order link")
            public void clickTheTrackYourOrderLink() {
            homePage = new HomePage();
            homePage.trackYourOrderLink.click();

    }

            @Then("test that the Track Now Link is visible")
            public void testThatTheTrackNowLinkIsVisible() {
            homePage = new HomePage();
            WebElement tracknowButton= homePage.trackNowButton;
            Assert.assertTrue(tracknowButton.isDisplayed());
    }

            @Then("click the compare button")
             public void clickTheCompareButton() {
            homePage = new HomePage();
            homePage.compareButton.click();
    }

    @Then("test that relevant web site's title contains compare")
    public void testThatRelevantWebSiteSTitleContainsCompare() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="compare";

        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }
    @Then("click the login button")
    public void click_the_login_button() {
        homePage = new HomePage();
        homePage.loginButton.click();

    }
    @Then("enter the email and password")
    public void enter_the_email_and_password() {
        homePage = new HomePage();
        homePage.emailSpace.sendKeys(ConfigReader.getProperty("user09Email"));
        homePage.passwordSpace.sendKeys(ConfigReader.getProperty("user09Password"));

    }
    @Then("click the sign in button")
    public void click_the_sign_in_button() {
        homePage = new HomePage();
        homePage.signInButton.click();

    }
    @Then("click the wishlist button")
    public void click_the_wishlist_button() {
        homePage = new HomePage();
        homePage.wishlistButton.click();

    }
    @Then("test that relevant web site's title contains wishlist")
    public void test_that_relevant_web_site_s_title_contains_wishlist() {
        homePage = new HomePage();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="wishlist";
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }

    @Then("click to the logo")
    public void clickToTheLogo() {
        homePage = new HomePage();
        homePage.logobutton.click();
    }

    @Then("test that the current url is homepage")
    public void testThatTheCurrentUrlIsHomepage() {
        homePage = new HomePage();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl=ConfigReader.getProperty("userUrl");

        Assert.assertEquals(expectedUrl,actualUrl);

    }

    @Then("enter {string} in search box and press the enter")
    public void enterInSearchBoxAndPressTheEnter(String wantedProduct) {
        homePage = new HomePage();
        homePage.seachBox.sendKeys(ConfigReader.getProperty(wantedProduct)+Keys.ENTER);


    }


    @Then("test that the brandingText contains {string}")
    public void testThatTheBrandingTextContains(String wantedProduct) {
        homePage = new HomePage();
        String actualKelime=homePage.brandingText.getText().toLowerCase();
        String expectedKelime=ConfigReader.getProperty("wantedProduct");

        Assert.assertTrue(actualKelime.contains(expectedKelime));

    }

    @Then("test that sign in button is visible")
    public void testThatSignInButtonIsVisible() {
        homePage = new HomePage();
        Assert.assertTrue(homePage.signInButton.isDisplayed());

    }

    @Then("click the register button")
    public void clickTheRegisterButton() {
        homePage = new HomePage();
        homePage.registerButton.click();

    }

    @And("test that the sign up should be visible")
    public void testThatTheSignUpShouldBeVisible() {
        homePage = new HomePage();
        Assert.assertTrue(homePage.signUp.isDisplayed());

    }

    @And("click the home button")
    public void clickTheHomeButton() {
        homePage = new HomePage();
        homePage.homeButton.click();
    }

    @And("test that the home button should redirect to the relevant page")
    public void testThatTheHomeButtonShouldRedirectToTheRelevantPage() {

        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl=ConfigReader.getProperty("userUrl");
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @And("click the blog button")
    public void clickTheBlogButton() {
        homePage = new HomePage();
        homePage.blogButton.click();
    }

    @And("test that the blog button should redirect to the relevant page")
    public void testThatTheBlogButtonShouldRedirectToTheRelevantPage() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedKelime="blog";
        Assert.assertTrue(actualUrl.contains(expectedKelime));

    }
}



