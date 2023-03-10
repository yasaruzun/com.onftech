package pages;

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



























































































































































































    // bulent locate
  // homepage>About us Link
@FindBy(xpath = "(//a[@ href='https://qa.trendlifebuy.com/about-us'])[1]")
public WebElement AboutUsLink;

// homepage>About us> Quality and reasonable text
    @FindBy(xpath = "//span[ text()='Quality and Reasonable Prices']")
    public WebElement QualityAndReasoanblePriceText;

  // homepage>About us> clientWorldwidetext
    @FindBy(xpath = "(//div[@ class='about_countBox mb_30 text-center'])[1]")
    public WebElement clientWorldwidetext;

    // homepage>About us> SuccesfulProjecttext
    @FindBy(xpath = "(//div[@ class='about_countBox mb_30 text-center'])[2]")
    public WebElement SuccesfulProjecttext;
    // homepage>About us> work employed
    @FindBy(xpath = "(//div[@ class='about_countBox mb_30 text-center'])[3]")
    public WebElement workemployedtext;

    // homepage>About us> Planning Service
    @FindBy(xpath = "(//div[@ class='about_countBox mb_30 text-center'])[4]")
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
    // homepage>About us> Teammember > Johnny Depp
    @FindBy(xpath = "(//div[@ class='col-lg-3 col-md-6'])[2]")
    public WebElement JohnnyDepp;
    // homepage>About us> Teammember > Jason Statham
    @FindBy(xpath = "(//div[@ class='col-lg-3 col-md-6'])[3]")
    public WebElement JasonStatham;
    // homepage>About us> Teammember > Harry Cooper
    @FindBy(xpath = "(//div[@ class='col-lg-3 col-md-6'])[4]")
    public WebElement HarryCooper;






























































































































}






