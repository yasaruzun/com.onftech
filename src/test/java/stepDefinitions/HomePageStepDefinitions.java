package stepDefinitions;


import com.google.j2objc.annotations.Weak;
import io.cucumber.java.en.*;
import io.cucumber.java.en.*;

import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.cucumber.java.en.*;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

import javax.swing.*;

import static utilities.ReusableMethods.bekle;


public class HomePageStepDefinitions {


    HomePage homePage = new HomePage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker = new Faker();



    @Given("go to the {string}")
    public void go_to_the(String istenenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

    }

    @Then("test that the url contains {string}")
    public void testThatTheUrlContains(String istenenkelime) {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertTrue(actualUrl.contains(istenenkelime));

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
    public void user_goes_to_url() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

    }

    @Given("Home Page is display {string}")
    public void home_page_is_display(String expectUrl) {
        homePage = new HomePage();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectUrl));

    }


    @Then("About us page is display")
    public void about_us_page_is_display() {

        String expected = "about";
        String actual = Driver.getDriver().getCurrentUrl();


    }

    @And("click register button on the top right")
    public void clickRegisterButtonOnTheTopRight() {
        homePage.bottonRegister.click();
    }

    @And("verify access to the sign up page")
    public void verifyAccessToTheSignUpPage() {
        assertTrue(homePage.textSignUp.isDisplayed());
    }

    @And("click on first name and enter a single letter")
    public void clickOnFirstNameAndEnterASingleLetter() {
        homePage.sectionFirstName.sendKeys("a");

    }

    @And("click on last name and enter a single letter")
    public void clickOnLastNameAndEnterASingleLetter() {
        homePage.sectionLastName.sendKeys("a");

    }

    @And("click the Sign Up button at the bottom of the page")
    public void clickTheSignUpButtonAtTheBottomOfThePage() {
        homePage.sectionFirstName.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.bekle(2);
        homePage.buttonSignUp.click();
    }

    @And("click on first name and enter a valid first name")
    public void clickOnFirstNameAndEnterAValidFirstName() {
        homePage.sectionFirstName.sendKeys("Everest");
    }

    @And("verify that the warning {string} isn't seen")
    public void verifyThatTheWarningIsnTSeen(String arg0) {
        assertFalse(homePage.missingFirstNameWarning.isDisplayed());
    }

    @And("click on email and Enter an email address without the @ sign and verify that the warning {string} is displayed")
    public void clickOnEmailAndEnterAnEmailAddressWithoutTheSignAndVerifyThatTheWarningIsDisplayed(String arg0) {
        homePage.sectionEmail.sendKeys(ConfigReader.getProperty("missingEmail"));
        ReusableMethods.bekle(2);
        homePage.sectionEmail.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.bekle(2);

        homePage.buttonSignUp.click();
        assertTrue(homePage.missingEmailWarning.isDisplayed());

    }

    @And("enter a valid email adress and verify that no warnings has been displayed")
    public void enterAValidEmailAdressAndVerifyThatNoWarningsHasBeenDisplayed() {

        homePage.sectionEmail.clear();
        ReusableMethods.bekle(2);
        homePage.sectionEmail.sendKeys(faker.internet().emailAddress());
        ReusableMethods.bekle(2);
        homePage.sectionEmail.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.bekle(2);
        homePage.buttonSignUp.click();
        assertFalse(homePage.missingEmailWarning.isDisplayed());

    }

    @And("enter an any {int}-character password ın the password sectıon and confırm password sectıon and verıfy that the warnıng ıs dısplayed")
    public void enterAnAnyCharacterPasswordInThePasswordSectıonAndConfırmPasswordSectıonAndVerıfyThatTheWarnıngIsDısplayed(int arg0) {
        homePage.sectionPassword.sendKeys(ConfigReader.getProperty("wrongPassword"));
        homePage.sectionConfirmPassword.sendKeys(ConfigReader.getProperty("wrongPassword"));

        ReusableMethods.bekle(2);
        homePage.sectionEmail.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.bekle(2);
        homePage.buttonSignUp.click();
        assertTrue(homePage.wrongPasswordWarning.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("enter a password in the password and confirm password section according to minimum of {int} characters and a combination of uppercase letters, lowercase letters, numbers, or symbols specifications")
    public void enterAPasswordInThePasswordAndConfirmPasswordSectionAccordingToMinimumOfCharactersAndACombinationOfUppercaseLettersLowercaseLettersNumbersOrSymbolsSpecifications(int arg0) {

        homePage.sectionPassword.sendKeys(ConfigReader.getProperty("user003Password"));
        homePage.sectionConfirmPassword.sendKeys(ConfigReader.getProperty("user003Password"));

    }

    @And("click the sign up checkbox at the bottom of the page and verify the warning is displayed at right up corner on the page")
    public void clickTheSignUpCheckboxAtTheBottomOfThePageAndVerifyTheWarningIsDisplayedAtRightUpCornerOnThePage() {
        homePage.sectionEmail.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.bekle(2);
        homePage.checkboxSigningUp.click();
        homePage.buttonSignUp.click();
        assertTrue(homePage.privacyError.isDisplayed());
    }

    @And("click the checkbox related to {string} and click the sign up button")
    public void clickTheCheckboxRelatedToAndClickTheSignUpButton(String arg0) {
        homePage.sectionEmail.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.bekle(2);
        homePage.checkboxSigningUp.click();
        homePage.buttonSignUp.click();
//        assertFalse(homePage.privacyError.isDisplayed());
    }

    @And("enter the required information according to the criteria and click the signup button")
    public void enterTheRequiredInformationAccordingToTheCriteriaAndClickTheSignupButton() {
        homePage.sectionFirstName.sendKeys(faker.name().firstName());
        homePage.sectionLastName.sendKeys(faker.name().lastName());
        homePage.sectionEmail.sendKeys(faker.internet().emailAddress());
        homePage.sectionPassword.sendKeys(ConfigReader.getProperty("user003Password"));
        homePage.sectionConfirmPassword.sendKeys(ConfigReader.getProperty("user003Password"));
        homePage.sectionConfirmPassword.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.bekle(2);
        homePage.buttonSignUp.click();


    }

    @And("verifies that the record information is navigated to the appropriate dashboard")
    public void verifiesThatTheRecordInformationIsNavigatedToTheAppropriateDashboard() {

        assertTrue(Driver.getDriver().getCurrentUrl().contains("/dashboard"));
    }

    @And("verify that the {string} at the bottom of the page is visible")
    public void verifyThatTheAtTheBottomOfThePageIsVisible(String arg0) {
        homePage.sectionConfirmPassword.sendKeys(Keys.PAGE_DOWN);
        assertTrue(homePage.linkSignIn.isDisplayed());
    }

    @And("click the {string} link and verify that link leads to the relevant page")
    public void clickTheLinkAndVerifyThatLinkLeadsToTheRelevantPage(String arg0) {
        ReusableMethods.bekle(2);
        homePage.linkSignIn.click();
        assertTrue(homePage.textSignIn.isDisplayed());
    }

    @And("verify that the warning {string} is seen")
    public void verifyThatTheWarningIsSeen(String arg0) {
        assertFalse(homePage.missingLastNameWarning.isDisplayed());
    }


    @And("click login button")
    public void clickLoginButton() {
        homePage.linkLogin.click();
    }

    @And("enter email address and password information then click the sign in button")
    public void enterEmailAddressAndPasswordInformationThenClickTheSignInButton() {
        homePage.sectionLoginEmail.sendKeys(ConfigReader.getProperty("user003Email"));
        homePage.sectionLoginPassword.sendKeys(ConfigReader.getProperty("user003Password"));
        homePage.buttonLoginSignIn.click();
    }

    @And("select the products on the homepage and click on it")
    public void selectTheProductsOnTheHomepageAndClickOnIt() {
        ReusableMethods.bekle(5);
        homePage.AboutUsLink.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.bekle(3);
        ReusableMethods.hover(homePage.firstProduct);
        homePage.iconCompareFirstElement.click();
        ReusableMethods.hover(homePage.secondProduct);
        ReusableMethods.bekle(1);
        homePage.iconCompareSecondElement.click();
        ReusableMethods.bekle(2);

    }

    @And("Verifies that images and content information of products added to the compare page are displayed side by side")
    public void verifiesThatImagesAndContentInformationOfProductsAddedToTheComparePageAreDisplayedSideBySide() {
        ReusableMethods.bekle(5);
        homePage.linkComparePage.click();
        assertTrue(homePage.compareProduct1.isDisplayed());
        assertTrue(homePage.compareProduct2.isDisplayed());
    }

    @And("click the Reset button and verified that the products selected for comparision are deleted from the Compare page")
    public void clickTheResetButtonAndVerifiedThatTheProductsSelectedForComparisionAreDeletedFromTheComparePage() {
        ReusableMethods.bekle(5);
        homePage.linkComparePage.click();
        ReusableMethods.bekle(2);
        homePage.buttonResetCompare.click();
        assertTrue(homePage.textCompareListEmpty.isDisplayed());


    }


    @And("add to cart by hovering over a product selected on the")
    public void addToCartByHoveringOverAProductSelectedOnThe() {
        ReusableMethods.bekle(5);
        homePage.AboutUsLink.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.bekle(3);
        ReusableMethods.hover(homePage.firstProduct);
        homePage.linkAddToCartFirstProduct.click();
        ReusableMethods.bekle(5);
        homePage.buttonCloseCart.click();
        ReusableMethods.hover(homePage.secondProduct);
        ReusableMethods.bekle(1);
        homePage.linkAddToCartSecondProduct.click();
        ReusableMethods.bekle(2);
    }

    @And("click on View Cart on the incoming screen")
    public void clickOnViewCartOnTheIncomingScreen() {
        homePage.buttonViewCart.click();
    }

    @Then("Verified that the texts Shipping charge free from, Order Summary, Subtotal,Shipping Charge,Discount,VAT-TAX-GST and Total are visible")
    public void verifiedThatTheTextsShippingChargeFreeFromOrderSummarySubtotalShippingChargeDiscountVATTAXGSTAndTotalAreVisible() {
        ReusableMethods.bekle(3);
        assertTrue(homePage.textShippingCargeFreeFrom.isDisplayed());
        homePage.AboutUsLink.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.bekle(2);
        assertTrue(homePage.textOrderSummary.isDisplayed());
        assertTrue(homePage.textSubtotal.isDisplayed());
        assertTrue(homePage.textShippingCharge.isDisplayed());
        assertTrue(homePage.textDiscount.isDisplayed());
        assertTrue(homePage.textVATTAXGST.isDisplayed());
        assertTrue(homePage.textTotal.isDisplayed());


    }

    @And("the desired number of products can be increased or decreased by clicking on +, - in the quantity section")
    public void theDesiredNumberOfProductsCanBeIncreasedOrDecreasedByClickingOnInTheQuantitySection() {
        ReusableMethods.bekle(2);
        String firstSituation = homePage.sectionQuantity.getText();
        homePage.buttonQuantityPlus.click();
        ReusableMethods.bekle(2);
        String secondSituation = homePage.sectionQuantity.getText();
        ReusableMethods.bekle(2);
        assertNotSame(firstSituation, secondSituation);
    }

    @And("the desired number of products should be entered by clicking on the quantity section")
    public void theDesiredNumberOfProductsShouldBeEnteredByClickingOnTheQuantitySection() {
        homePage.sectionQuantity.sendKeys("4");
        String firstSituation = (homePage.sectionQuantity.getText());
        assertSame(firstSituation, 4);

    }

    @And("verified that the product price changes when the number of products in the quantity section changes")
    public void verifiedThatTheProductPriceChangesWhenTheNumberOfProductsInTheQuantitySectionChanges() {

        String firstSituation = homePage.textTotalPrice.getText();
        homePage.buttonQuantityMinus.click();
        String secondSituation = homePage.textTotalPrice.getText();

        assertNotSame(firstSituation, secondSituation);

    }

    @And("verified that the unit price of the product and the amount of discount, if any, are written in the Price section.")
    public void verifiedThatTheUnitPriceOfTheProductAndTheAmountOfDiscountIfAnyAreWrittenInThePriceSection() {
        assertTrue(homePage.sectionUnitPrice.isDisplayed());
    }

    @And("click on the Proceed To Checkout button and verified that redirect to the relevant page")
    public void clickOnTheProceedToCheckoutButtonAndVerifiedThatRedirectToTheRelevantPage() {
        ReusableMethods.bekle(2);
        homePage.AboutUsLink.sendKeys(Keys.PAGE_DOWN);
        homePage.buttonProceedToCheckout.click();
        assertTrue(Driver.getDriver().getCurrentUrl().contains("checkout"));
    }

    @And("click to Continue Shopping button and verify that redirect to the home page")
    public void clickToContinueShoppingButtonAndVerifyThatRedirectToTheHomePage() {
        ReusableMethods.bekle(2);
        homePage.AboutUsLink.sendKeys(Keys.PAGE_DOWN);
        homePage.buttonContinueShopping.click();
        assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("userUrl"));
    }

    @And("click the delete icon in the remove section and verify that the product in the cart has been deleted")
    public void clickTheDeleteIconInTheRemoveSectionAndVerifyThatTheProductInTheCartHasBeenDeleted() {
        homePage.buttonDelete.click();
        ReusableMethods.bekle(5);
        homePage.buttonCloseShoppingCart.click();
        ReusableMethods.bekle(2);
        homePage.buttonDelete.click();
        assertTrue(homePage.textNoProductFound.isDisplayed());


    }


    //   }

    @Then("closes the page")
    public void closes_the_page() {

        Driver.closeDriver();

    }


    @Then("User goes to About us page")
    public void userGoesToAboutUsPage() {
        homePage.AboutUsLink.click();
    }

    @Then("confirm that the title is Trendlifebuy Online Shopping")
    public void confirmThatTheTitleIsTrendlifebuyOnlineShopping() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Trendlifebuy Online Shopping";

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @Then("click to the Play Store link")
    public void click_to_the_play_store_link() {

        homePage.playStoreLinki.click();

    }

    @Then("test that it should be redirected to play store page")
    public void test_that_it_should_be_redirected_to_play_store_page() {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://play.google.com/store/games";
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    @Then("nagigate back to the home page from play store page")
    public void nagigate_back_to_the_home_page_from_play_store_page() {

        Driver.getDriver().navigate().back();

    }

    @Then("wait {int} second")
    public void wait_second(int saniye) {

        try {
            Thread.sleep(1000 * saniye);
        } catch (InterruptedException e) {

        }

    }

    @Then("click to the apple store link")
    public void click_to_the_apple_store_link() {

        homePage.appStoreLinki.click();

    }

    @Then("test that it should be redirected to apple store page")
    public void test_that_it_should_be_redirected_to_apple_store_page() {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.apple.com/app-store/";
        Assert.assertEquals(expectedUrl, actualUrl);


    }

    @And("click subscribe quick")
    public void clickSubscribeQuick() {
        homePage=new HomePage();
        homePage.subscribeQuick.click();

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

            @Then("verify that the title is Trendlifebuy Online Shopping")
            public void verifyThatTheTitleIsTrendlifebuyOnlineShopping() {

            String actualTitle=Driver.getDriver().getTitle();
            String expectedTitle="Trendlifebuy Online Shopping";

            Assert.assertEquals(expectedTitle,actualTitle);


    }

            @Then("click the Track Your Order link")
            public void clickTheTrackYourOrderLink() {

            homePage.trackYourOrderLink.click();

    }

            @Then("test that the Track Now Link is visible")
            public void testThatTheTrackNowLinkIsVisible() {

            WebElement tracknowButton= homePage.trackNowButton;
            Assert.assertTrue(tracknowButton.isDisplayed());
    }

            @Then("click the compare button")
             public void clickTheCompareButton() {

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

        homePage.loginButton.click();

    }
    @Then("enter the email and password")
    public void enter_the_email_and_password() {

        homePage.emailSpace.sendKeys(ConfigReader.getProperty("user09Email"));
        homePage.passwordSpace.sendKeys(ConfigReader.getProperty("user09Password"));

    }
    @Then("click the sign in button")
    public void click_the_sign_in_button() {

        homePage.signInButton.click();

    }
    @Then("click the wishlist button")
    public void click_the_wishlist_button() {

        homePage.wishlistButton.click();

    }
    @Then("test that relevant web site's title contains wishlist")
    public void test_that_relevant_web_site_s_title_contains_wishlist() {

        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="wishlist";
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }

    @Then("click to the logo")
    public void clickToTheLogo() {

        homePage.logobutton.click();
    }

    @Then("test that the current url is homepage")
    public void testThatTheCurrentUrlIsHomepage() {

        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl=ConfigReader.getProperty("userUrl");

        Assert.assertEquals(expectedUrl,actualUrl);

    }

    @Then("enter {string} in search box and press the enter")
    public void enterInSearchBoxAndPressTheEnter(String wantedProduct) {

        homePage.seachBox.sendKeys(ConfigReader.getProperty(wantedProduct)+Keys.ENTER);


    }


    @Then("test that the brandingText contains {string}")
    public void testThatTheBrandingTextContains(String wantedProduct) {

        String actualKelime=homePage.brandingText.getText().toLowerCase();
        String expectedKelime=ConfigReader.getProperty("wantedProduct");

        Assert.assertTrue(actualKelime.contains(expectedKelime));

    }

    @Then("test that sign in button is visible")
    public void testThatSignInButtonIsVisible() {

        Assert.assertTrue(homePage.signInButton.isDisplayed());

    }

    @Then("click the register button")
    public void clickTheRegisterButton() {

        homePage.registerButton.click();

    }

    @And("test that the sign up should be visible")
    public void testThatTheSignUpShouldBeVisible() {

        Assert.assertTrue(homePage.signUp.isDisplayed());

    }

    @And("click the home button")
    public void clickTheHomeButton() {

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

        homePage.blogButton.click();
    }

    @And("test that the blog button should redirect to the relevant page")
    public void testThatTheBlogButtonShouldRedirectToTheRelevantPage() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedKelime="blog";
        Assert.assertTrue(actualUrl.contains(expectedKelime));

    }

    @And("click the about button")
    public void clickTheAboutButton() {

        homePage.aboutButton.click();
    }

    @And("test that the about button should redirect to the relevant page")
    public void testThatTheAboutButtonShouldRedirectToTheRelevantPage() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedKelime="about";
        Assert.assertTrue(actualUrl.contains(expectedKelime));
    }

    @And("click the contact button")
    public void clickTheContactButton() {

        homePage.contactButton.click();
    }

    @And("test that the contact button should redirect to the relevant page")
    public void testThatTheContactButtonShouldRedirectToTheRelevantPage() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedKelime="contact";
        Assert.assertTrue(actualUrl.contains(expectedKelime));

    }

    @And("click the New User Zone button")
    public void clickTheNewUserZoneButton() {

        homePage.newUserZoneButton.click();
    }

    @And("test that the New User Zone button should redirect to the relevant page")
    public void testThatTheNewUserZoneButtonShouldRedirectToTheRelevantPage() {

        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedKelime="user-zone";
        Assert.assertTrue(actualUrl.contains(expectedKelime));
    }

    @Then("click the all Categories")
    public void clickTheAllCategories() {

        homePage.allCategoriesDropDownMenu.click();

    }

    @And("test that all categories are viisible")
    public void testThatAllCategoriesAreViisible() {

        Assert.assertTrue(homePage.ComputerAccessoriesLinki.isDisplayed());
        Assert.assertTrue(homePage.ElectronicsDevicesLinki.isDisplayed());
        Assert.assertTrue(homePage.WatchesAccessoriesLinki.isDisplayed());
        Assert.assertTrue(homePage.FashionsLinki.isDisplayed());
        Assert.assertTrue(homePage.ToysKidsBabiesLinki.isDisplayed());
        Assert.assertTrue(homePage.BagShoesLinki.isDisplayed());
        Assert.assertTrue(homePage.LifestyleHomeLinki.isDisplayed());
        Assert.assertTrue(homePage.TVHomeAppliancesLinki.isDisplayed());
        Assert.assertTrue(homePage.AutoMobilesbikesLinki.isDisplayed());

    }

    @And("test that all categories are active")
    public void testThatAllCategoriesAreActive() {

        Assert.assertTrue(homePage.ComputerAccessoriesLinki.isEnabled());
        Assert.assertTrue(homePage.ElectronicsDevicesLinki.isEnabled());
        Assert.assertTrue(homePage.WatchesAccessoriesLinki.isEnabled());
        Assert.assertTrue(homePage.FashionsLinki.isEnabled());
        Assert.assertTrue(homePage.ToysKidsBabiesLinki.isEnabled());
        Assert.assertTrue(homePage.BagShoesLinki.isEnabled());
        Assert.assertTrue(homePage.LifestyleHomeLinki.isEnabled());
        Assert.assertTrue(homePage.TVHomeAppliancesLinki.isEnabled());
        Assert.assertTrue(homePage.AutoMobilesbikesLinki.isEnabled());


    }

    @Then("sayfanın en asagisina in")
    public void sayfanınEnAsagisinaIn() {
        Actions actions1=new Actions(Driver.getDriver());
        actions1.sendKeys(Keys.END).perform();

    }

    @Then("test that my account,order status,referral and coupons are visible")
    public void testThatMyAccountOrderStatusReferralAndCouponsAreVisible() {

        Assert.assertTrue(homePage.myAccount.isDisplayed());
        Assert.assertTrue(homePage.orderStatus.isDisplayed());
        Assert.assertTrue(homePage.referral.isDisplayed());
        Assert.assertTrue(homePage.coupons.isDisplayed());


    }

    @Then("test that the My Account, Order Status, Referral, Coupons links redirects to the relevant page")
    public void testThatTheMyAccountOrderStatusReferralCouponsLinksRedirectsToTheRelevantPage() {
        //myaccount
        homePage.myAccount.click();
        String actualMyAccountUrl=Driver.getDriver().getCurrentUrl();
        String expectedKelime="profile";
        Assert.assertTrue(actualMyAccountUrl.contains(expectedKelime));
        Driver.getDriver().navigate().back();

        //order Status
        homePage.orderStatus.click();
        String actualOrderStatusUrl=Driver.getDriver().getCurrentUrl();
        String expectedKelimeOrderStatus="purchase-orders";
        Assert.assertTrue(actualOrderStatusUrl.contains(expectedKelimeOrderStatus));
        Driver.getDriver().navigate().back();

        //Referral
        homePage.referral.click();
        String actualReferralUrl=Driver.getDriver().getCurrentUrl();
        String expectedKelimeReferral="referral";
        Assert.assertTrue(actualReferralUrl.contains(expectedKelimeReferral));
        Driver.getDriver().navigate().back();

        //coupons
        homePage.coupons.click();
        String actualCouponsUrl=Driver.getDriver().getCurrentUrl();
        String expectedKelimeCoupons="coupons";
        Assert.assertTrue(actualCouponsUrl.contains(expectedKelimeCoupons));

    }

    @Then("test that the About Us, Contact Us, Career, Refund Policy, Terms & Condition links are visible")
    public void testThatTheAboutUsContactUsCareerRefundPolicyTermsConditionLinksAreVisible() {

        Assert.assertTrue(homePage.aboutUsLinkYasar.isDisplayed());
        Assert.assertTrue(homePage.contactUsLinkYasar.isDisplayed());
        Assert.assertTrue(homePage.careerLinkYasar.isDisplayed());
        Assert.assertTrue(homePage.refundPolicyLinkYasar.isDisplayed());
        Assert.assertTrue(homePage.termsConditionLinkYasar.isDisplayed());

    }

    @Then("verify that clicking on About Us, Contact Us, Career, Terms & Condition links redirects to the relevant pages")
    public void verifyThatClickingOnAboutUsContactUsCareerTermsConditionLinksRedirectsToTheRelevantPages() {

        //about us
        homePage.aboutUsLinkYasar.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedKelime="about-us";
        Assert.assertTrue(actualUrl.contains(expectedKelime));
        Driver.getDriver().navigate().back();

        //contact us
        homePage.contactUsLinkYasar.click();
        String actualUrlContactUs=Driver.getDriver().getCurrentUrl();
        String expectedKelimeContact="contact-us";
        Assert.assertTrue(actualUrlContactUs.contains(expectedKelimeContact));
        Driver.getDriver().navigate().back();

        //career
        homePage.careerLinkYasar.click();
        String actualUrlCareer=Driver.getDriver().getCurrentUrl();
        String expectedKelimeCareer="career";
        Assert.assertTrue(actualUrlCareer.contains(expectedKelimeCareer));
        Driver.getDriver().navigate().back();

        //term and conditions
        homePage.termsConditionLinkYasar.click();
        String actualUrlTerms=Driver.getDriver().getCurrentUrl();
        String expectedKelimeTerms="terms-condition";
        Assert.assertTrue(actualUrlTerms.contains(expectedKelimeTerms));
        Driver.getDriver().navigate().back();
    }

    @And("verify that clicking Refund Policy links redirects to the relevant pages")
    public void verifyThatClickingRefundPolicyLinksRedirectsToTheRelevantPages() {

        //Refund Policy
        homePage.refundPolicyLinkYasar.click();
        String actualUrlRefund=Driver.getDriver().getCurrentUrl();
        String expectedKelimeRefund="refund-policy";
        Assert.assertTrue(actualUrlRefund.contains(expectedKelimeRefund));

    }

    @Then("Verify that the Google Play and Apple Store buttons are visible")
    public void verifyThatTheGooglePlayAndAppleStoreButtonsAreVisible() {

        Assert.assertTrue(homePage.playStoreLinki.isDisplayed());
        Assert.assertTrue(homePage.appStoreLinki.isDisplayed());

    }

    @And("click the Go to top button")
    public void clickTheGoToTopButton() {
        homePage=new HomePage();
        homePage.goToTop.click();

    }

    @Then("verify that it is scrolled to the top of the home page")
    public void verifyThatItIsScrolledToTheTopOfTheHomePage() {
        homePage=new HomePage();
        Assert.assertTrue(homePage.seachBox.isDisplayed());

    }

    @Then("Verify that facebook, twitter, linkedin and instagram icons are visible")
    public void verifyThatFacebookTwitterLinkedinAndInstagramIconsAreVisible() {

        Assert.assertTrue(homePage.twitterIcon.isDisplayed());
        Assert.assertTrue(homePage.linkedinIcon.isDisplayed());
        Assert.assertTrue(homePage.instagramIcon.isDisplayed());
        Assert.assertTrue(homePage.facebookIcon.isDisplayed());
    }

    @Then("click the twitter icon")
    public void clickTheTwitterIcon() {

        homePage.twitterIcon.click();

    }

    @Then("verify that twitter icon redirects to the relevant page")
    public void verifyThatTwitterIconRedirectsToTheRelevantPage() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedKelime="twitter";
        Assert.assertTrue(actualUrl.contains(expectedKelime));


    }

    @Then("navigate back")
    public void navigateBack() {
        Driver.getDriver().navigate().back();
    }

    @Then("click the linkedin icon")
    public void clickTheLinkedinIcon() {

        homePage.linkedinIcon.click();

    }

    @Then("verify that linkedin icon redirects to the relevant page")
    public void verifyThatLinkedinIconRedirectsToTheRelevantPage() {
        String actualUrlLinkedin=Driver.getDriver().getCurrentUrl();
        String expectedKelimeLinkedin="linkedin";
        Assert.assertTrue(actualUrlLinkedin.contains(expectedKelimeLinkedin));

    }

    @Then("click the instagram icon")
    public void clickTheInstagramIcon() {

        homePage.instagramIcon.click();
    }

    @Then("verify that instagram icon redirects to the relevant page")
    public void verifyThatInstagramIconRedirectsToTheRelevantPage() {
        String actualUrlInstagram=Driver.getDriver().getCurrentUrl();
        String expectedKelimeInstagram="instagram";
        Assert.assertTrue(actualUrlInstagram.contains(expectedKelimeInstagram));

    }

    @Then("click the facebook icon")
    public void clickTheFacebookIcon() {

        homePage.facebookIcon.click();
    }

    @Then("verify that facebook icon redirects to the relevant page")
    public void verifyThatFacebookIconRedirectsToTheRelevantPage() {
        String actualUrlFacebook=Driver.getDriver().getCurrentUrl();
        String expectedKelimeFacebook="facebook";
        Assert.assertTrue(actualUrlFacebook.contains(expectedKelimeFacebook));

    }

    @Then("verify that Trending Products is visible")
    public void verifyThatTrendingProductsIsVisible() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 500)");

        Assert.assertTrue(homePage.trendingProducts.isDisplayed());

    }
    @Then("verify that Hot Categories is visible")
    public void verify_that_hot_categories_is_visible() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 500)");

        Assert.assertTrue(homePage.hotCategories.isDisplayed());

    }
    @Then("verify that House Appliances is visible")
    public void verify_that_house_appliances_is_visible() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 500)");

        Assert.assertTrue(homePage.houseAppliances.isDisplayed());
    }
    @Then("verify that Recommendation For You is visible")
    public void verify_that_recommendation_for_you_is_visible() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 500)");

        Assert.assertTrue(homePage.recommendationForYou.isDisplayed());
    }
    @Then("verify that Top Brand is visible")
    public void verify_that_top_brand_is_visible() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 500)");

        Assert.assertTrue(homePage.topBrand.isDisplayed());
    }
    @Then("verify that Popular Searches is visible")
    public void verify_that_popular_searches_is_visible() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 500)");

        Assert.assertTrue(homePage.popularSearches.isDisplayed());
    }
    @Then("verify that Trendlifebuy | Verify that ONLINE SHOPPING is visible")
    public void verify_that_trendlifebuy_verify_that_online_shopping_is_visible() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 500)");

        Assert.assertTrue(homePage.trendlifebuOnlineShopping.isDisplayed());
    }

    @Then("click the view all button")
    public void clickTheViewAllButton() {

        JavascriptExecutor jse =(JavascriptExecutor)Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",homePage.allCategoriesDropDownMenu);
        bekle(2);
        homePage.viewAllButton.click();
    }

    @Then("Verify that the View All button redirects to the relevant page")
    public void verifyThatTheViewAllButtonRedirectsToTheRelevantPage() {

        Assert.assertTrue(homePage.brandingTextviewAll.isDisplayed());


    }

    @Then("click the more details button")
    public void clickTheMoreDetailsButton() {

        JavascriptExecutor jse =(JavascriptExecutor)Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",homePage.houseAppliances);
        bekle(2);

        homePage.moreDetails.click();
    }

    @Then("Verify that the More Deals button redirects to the relevant page")
    public void verifyThatTheMoreDealsButtonRedirectsToTheRelevantPage() {

        Assert.assertTrue(homePage.brandingTextviewAll.isDisplayed());
    }

    @Then("test that The home page must be accessible when the URL is entered")
    public void testThatTheHomePageMustBeAccessibleWhenTheURLIsEntered() {

        Assert.assertTrue(homePage.seachBox.isEnabled());
    }

    @Then("click to the load link")
    public void clickToTheLoadLink() {
     homePage.loadMore.click();
    }
}








