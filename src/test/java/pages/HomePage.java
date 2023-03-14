package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
  public HomePage() {

    PageFactory.initElements(Driver.getDriver(), this);
  }
     /*
        15-100 yasar
        105-200 mustafa talip
        205-300 bülent
        305-400 yavuz
         */
     @FindBy(xpath="//span[text()='Play store']")
     public WebElement playStoreLinki;
     @FindBy(xpath="//span[text()='App store']")
     public WebElement appStoreLinki;
     @FindBy(xpath="(//div[@class='close_modal'])[1]")
     public WebElement subscribeQuick;


























































































































































































    // bulent locate
  // homepage>About us Link
@FindBy(xpath = "(//a[@ href='https://qa.trendlifebuy.com/about-us'])[1]")
public WebElement AboutUsLink;

// homepage>About us> Quality and reasonable text
    @FindBy(xpath = "//span[ text()='Quality and Reasonable Prices']")
    public WebElement QualityAndReasoanblePriceText;

  // homepage>About us> clientWorldwidetext
    @FindBy(xpath = "(//div[@ class='col-xl-3 col-lg-3 col-md-6'])[1]")
    public WebElement clientWorldwidetext;

    // homepage>About us> SuccesfulProjecttext
    @FindBy(xpath = "(//div[@ class='col-xl-3 col-lg-3 col-md-6'])[2]")
    public WebElement SuccesfulProjecttext;
    // homepage>About us> work employed
    @FindBy(xpath = "(//div[@ class='col-xl-3 col-lg-3 col-md-6'])[3]")
    public WebElement workemployedtext;

    // homepage>About us> Planning Service
    @FindBy(xpath = "(//div[@ class='col-xl-3 col-lg-3 col-md-6'])[4]")
    public WebElement PlanningServicetext;

    // homepage>About us> online shopping easy and cost=efficient text
    @FindBy(xpath = "//span[text()='online shopping easy and cost-efficient']")
    public WebElement onlineSoppingtext;

    // homepage>About us> TeamMemberText
    @FindBy(xpath = "//span[text()='Team member']")
    public WebElement TeamMemberText;

    // homepage>About us> Teammember > Robert Pattinson
    @FindBy(xpath = "(//div[@ class='col-lg-3 col-md-6'])[1]")
    public WebElement RobertPattinson;

    @FindBy(xpath = "(//div[@ class='thumb'])[1]")
    public WebElement RobertThumb;

    // homepage>About us> Teammember > Johnny Depp
    @FindBy(xpath = "(//div[@ class='col-lg-3 col-md-6'])[2]")
    public WebElement JohnyDepp;

   @FindBy(xpath = "(//div[@ class='thumb'])[2]")
   public WebElement JohnnyThumb;

    // homepage>About us> Teammember > Jason Statham
    @FindBy(xpath = "(//div[@ class='col-lg-3 col-md-6'])[3]")
    public WebElement JasonStatham;

    @FindBy(xpath = "(//div[@ class='thumb'])[3]")
    public WebElement JasonThumb;

    // homepage>About us> Teammember > Harry Cooper
    @FindBy(xpath = "(//div[@ class='col-lg-3 col-md-6'])[4]")
    public WebElement HarryCooper;

    @FindBy(xpath = "(//div[@ class='thumb'])[1]")
    public WebElement HarryThumb;

    //homepage>subscribe to our newsletter
    @FindBy(xpath = "(//div[@ class='close_modal'])[1]")
     public WebElement SubscribeLink;

    //https://qa.trendlifebuy.com/contact-us>
    @FindBy(xpath="(//a [@href='https://qa.trendlifebuy.com/contact-us' ])[1]")
    public WebElement contacUs;
    //https://qa.trendlifebuy.com/contact-us>  Get in Touch section Enter Name box
    @FindBy(id="name")
    public WebElement boxEnterName;

    //https://qa.trendlifebuy.com/contact-us>  Get in Touch section Enter Email Address box
    @FindBy(id="email")
    public WebElement boxEnterEmailAddress;

    //https://qa.trendlifebuy.com/contact-us>  Get in Touch section Installation/Customer/Product Returns dropdown
    @FindBy(xpath="//span[@class='current']")
    public WebElement installationCustomerProductReturns;

    //https://qa.trendlifebuy.com/contact-us>  Get in Touch section Product Returns
    @FindBy(xpath="//li[@data-value='3']")
    public WebElement productReturns;

    //https://qa.trendlifebuy.com/contact-us>  Get in Touch section Write Message box
    @FindBy(id="message")
    public WebElement boxWriteMessage;

    //https://qa.trendlifebuy.com/contact-us>  Get in Touch section SEND MESSAGE button
    @FindBy(id="contactBtn")
    public WebElement buttonSendMessage;





























































































































}






