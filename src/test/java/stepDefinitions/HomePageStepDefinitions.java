package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;


public class HomePageStepDefinitions {


    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();


    @Given("go to the {string}")
    public void go_to_the(String istenenUrl) {
        homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

    }

    @Then("test that the url contains {string}")
    public void testThatTheUrlContains(String istenenkelime) {
        homePage = new HomePage();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertTrue(actualUrl.contains(istenenkelime));

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
        assertSame(firstSituation,4);

    }

    @And("verified that the product price changes when the number of products in the quantity section changes")
    public void verifiedThatTheProductPriceChangesWhenTheNumberOfProductsInTheQuantitySectionChanges() {

        String firstSituation = homePage.textTotalPrice.getText();
        homePage.buttonQuantityMinus.click();
        String secondSituation = homePage.textTotalPrice.getText();

        assertNotSame(firstSituation,secondSituation);

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
        assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("userUrl"));
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
}



