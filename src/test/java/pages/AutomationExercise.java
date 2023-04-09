package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercise {
    public AutomationExercise() {
        PageFactory.initElements(Driver.getDriver(), this);

    }



    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement singUpLoginButton;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement newUserSingupText;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBox;

    @FindBy(xpath = "//button[text()='Signup']")
    public WebElement singupButton;

    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enterAccountText;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement titleGender;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//label[text()='Sign up for our newsletter!']")
    public WebElement newsLetterButton;

    @FindBy (xpath = "//label[text()='Receive special offers from our partners!']")
    public WebElement optinButton;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//button[text()='Create Account']")
    public WebElement createAccount;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@id='dismiss-button']")
    public WebElement closePopup;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement loggedInAs;

    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//*[text()='Account Deleted!']")
    public WebElement accountDeledtedText;

    @FindBy (xpath = "//select[@id='days']")
    public WebElement days;

    @FindBy (xpath = "//select[@id='months']")
    public WebElement month;

    @FindBy (xpath = "//select[@id='years']")
    public WebElement year;
}