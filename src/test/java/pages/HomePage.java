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
    @FindBy(xpath = "//span[text()='Play store']")
    public WebElement playStoreLinki;
    @FindBy(xpath = "//span[text()='App store']")
    public WebElement appStoreLinki;
    @FindBy(xpath = "(//div[@class='close_modal'])[1]")
    public WebElement subscribeQuick;


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










































































































































































































































    //-----------------------------Yavuz--------------------------------
    @FindBy(xpath = "//*[text()='/ Register']")
    public WebElement bottonRegister;
    @FindBy(xpath = "(//*[text()='Sign Up'])[1]")
    public WebElement textSignUp;
    @FindBy(id = "first_name")
    public WebElement sectionFirstName;
    @FindBy(xpath = "(//*[@class='text-danger'])[1]")
    public WebElement missingFirstNameWarning;
    @FindBy(id = "last_name")
    public WebElement sectionLastName;
    @FindBy(xpath = "(//*[@class='text-danger'])[2]")
    public WebElement missingLastNameWarning;
    @FindBy(xpath = "(//*[text()='Sign Up'])[2]")
    public WebElement buttonSignUp;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement sectionEmail;
    @FindBy(xpath = "(//*[@class='text-danger'])[3]")
    public WebElement missingEmailWarning;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement sectionPassword;
    @FindBy(xpath = "//input[@id='password-confirm']")
    public WebElement sectionConfirmPassword;
    @FindBy(xpath = "(//*[@class='text-danger'])[5]")
    public WebElement wrongPasswordWarning;
    @FindBy(xpath = "//*[@class='checkmark mr_15']")
    public WebElement checkboxSigningUp;
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement linkSignIn;
    @FindBy(xpath = "(//*[text()='Sign In'])[1]")
    public WebElement textSignIn;

    @FindBy(xpath = "(//*[text()='Login'])[1]")
    public WebElement linkLogin;
    @FindBy(xpath = "//input[@name='login']")
    public WebElement sectionLoginEmail;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement sectionLoginPassword;

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement buttonLoginSignIn;
    @FindBy(xpath = "(//*[@class='product_thumb_upper'])[8]")
    public WebElement firstProduct;
    @FindBy(xpath = "(//i[@class='ti-control-shuffle'])[8]")
    public WebElement iconCompareFirstElement;
    @FindBy(xpath = "(//*[@class='product_thumb_upper'])[9]")
    public WebElement secondProduct;
    @FindBy(xpath = "(//i[@class='ti-control-shuffle'])[9]")
    public WebElement iconCompareSecondElement;
    @FindBy(xpath = "//*[text()='Compare list is empty.']")
    public WebElement textCompareListEmpty;
    @FindBy(xpath = "//*[text()='Compare(']")
    public WebElement linkComparePage;
    @FindBy(xpath = "(//*[@class='owl-item active'])[1]")
    public WebElement compareProduct1;
    @FindBy(xpath = "(//*[@class='owl-item active'])[2]")
    public WebElement compareProduct2;

    @FindBy(xpath = "//*[text()='Reset Compare']")
    public WebElement buttonResetCompare;

    @FindBy(xpath = "//*[text()='Error']")
    public WebElement privacyError;

    @FindBy(xpath = "(//*[@class='add_cart add_to_cart addToCartFromThumnail'])[8]")
    public WebElement linkAddToCartFirstProduct;
    @FindBy (xpath = "(//*[@class='add_cart add_to_cart addToCartFromThumnail'])[9]")
    public WebElement linkAddToCartSecondProduct;

    @FindBy(xpath = "//*[text()='View cart']")
    public WebElement buttonViewCart;
    @FindBy(xpath = "(//*[@class='ti-close'])[5]")
    public WebElement buttonCloseCart;

    @FindBy(xpath = "//*[text()='Shipping charge free from ']")
    public WebElement textShippingCargeFreeFrom;

    @FindBy(xpath = "//*[text()='Order Summary']")
    public WebElement textOrderSummary;

    @FindBy(xpath = "(//*[text()='Subtotal'])[2]")
    public WebElement textSubtotal;

    @FindBy(xpath = "//*[text()='Shipping Charge']")
    public WebElement textShippingCharge;

    @FindBy(xpath = "//*[text()='Discount']")
    public WebElement textDiscount;

    @FindBy(xpath = "//*[text()='VAT/TAX/GST']")
    public WebElement textVATTAXGST;

    @FindBy(xpath = "(//*[text()='Total'])[3]")
    public WebElement textTotal;

    @FindBy(xpath = "(//input[@class='count_single_item input-number qty'])[1]")
    public WebElement sectionQuantity;
    @FindBy(xpath = "(//button[@class='count_single_item number_increment change_qty'])[1]")
    public WebElement buttonQuantityPlus;

    @FindBy(xpath = "(//button[@class='count_single_item inumber_decrement change_qty'])[1]")
    public WebElement buttonQuantityMinus;

    @FindBy(xpath = "(//*[@class='total_text'])[2]")
    public WebElement textTotalPrice;

    @FindBy(xpath = "(//*[@class='col-lg col-4 order-1 order-lg-0 my-3 my-lg-0'])[1]")
    public WebElement sectionUnitPrice;

    @FindBy(xpath = "//*[text()='Proceed to checkout']")
    public WebElement buttonProceedToCheckout;

    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement buttonContinueShopping;

    @FindBy (xpath = "//*[@class='close_icon style_2 lh-1 cart_item_delete_btn cursor_pointer']")
    public WebElement buttonDelete;

    @FindBy(xpath = "//*[text()='No product found']")
    public WebElement textNoProductFound;

    @FindBy(xpath = "(//*[@class='ti-close'])[4]")
    public WebElement buttonCloseShoppingCart;

}






