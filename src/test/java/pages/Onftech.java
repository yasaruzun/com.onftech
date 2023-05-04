package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Onftech {
    public Onftech() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//h2[text()='Contact Us']")
    public WebElement contactUsLetter;

    @FindBy(xpath = "//span[text()='Contact Us']")
    public WebElement contactUsIcon;

    @FindBy(xpath = "//input[@id='PageBody_name']")
    public WebElement namePlace;

    @FindBy(xpath = "//input[@id='PageBody_btnSend']")
    public WebElement sendMessageButton;


}