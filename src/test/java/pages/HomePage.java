package pages;

import org.openqa.selenium.By;
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
       405-600- yasar2
        */
    @FindBy(xpath = "//span[text()='Play store']")
    public WebElement playStoreLinki;
    @FindBy(xpath = "//span[text()='App store']")
    public WebElement appStoreLinki;
    @FindBy(xpath = "(//div[@class='close_modal'])[1]")
    public WebElement subscribeQuick;
    @FindBy(xpath = "//span[text()='Track Your Order']")
    public WebElement trackYourOrderLink;
    @FindBy(xpath = "//button[text()='Track Now']")
    public WebElement trackNowButton;


    @FindBy(xpath = "//a[@href='https://qa.trendlifebuy.com/compare']")
    public WebElement compareButton;

    @FindBy(xpath = "(//a[@href='https://qa.trendlifebuy.com/login'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement emailSpace;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordSpace;

    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//span[text()='Wishlist (']")
    public WebElement wishlistButton;

    @FindBy(xpath = "//span[text()='Cart (']")
    public WebElement cartButton;

    @FindBy(xpath = "//div[@class='logo_img']")
    public WebElement logobutton;

    @FindBy(xpath = "(//input[@id='inlineFormInputGroup'])[1]")
    public WebElement seachBox;

    @FindBy(xpath = "//button[text()='Filter']")
    public WebElement filterButton;

    @FindBy(xpath = "//h3[@class='branding_text']")
    public WebElement brandingText;

    @FindBy(xpath = "//a[text()='/ Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//h3[text()='Sign Up']")
    public WebElement signUp;

    @FindBy(xpath = "(//a[text()='Home'])[1]")
    public WebElement homeButton;

    @FindBy(xpath = "(//a[text()='Blog'])[1]")
    public WebElement blogButton;

    @FindBy(xpath = "(//a[text()='About Us'])[1]")
    public WebElement aboutButton;
    @FindBy(xpath = "(//a[text()='Contact'])[1]")
    public WebElement contactButton;

    @FindBy(xpath = "//span[text()='New User Zone']")
    public WebElement newUserZoneButton;

    @FindBy(xpath = "//div[@class='dropdown show category_menu']")
    public WebElement allCategoriesDropDownMenu;

    @FindBy(xpath = "//i[@class='fas fa-desktop']")
    public WebElement ComputerAccessoriesLinki;

    @FindBy(xpath = "//i[@class='fas fa-vote-yea']")
    public WebElement ElectronicsDevicesLinki;

    @FindBy(xpath = "//i[@class='far fa-clock']")
    public WebElement WatchesAccessoriesLinki;

    @FindBy(xpath = "//i[@class='ti-stamp']")
    public WebElement FashionsLinki;


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
    @FindBy(xpath = "(//a [@href='https://qa.trendlifebuy.com/contact-us' ])[1]")
    public WebElement contacUs;
    //https://qa.trendlifebuy.com/contact-us>  Get in Touch section Enter Name box
    @FindBy(id = "name")
    public WebElement boxEnterName;

    //https://qa.trendlifebuy.com/contact-us>  Get in Touch section Enter Email Address box
    @FindBy(id = "email")
    public WebElement boxEnterEmailAddress;

    //https://qa.trendlifebuy.com/contact-us>  Get in Touch section Installation/Customer/Product Returns dropdown
    @FindBy(xpath = "//span[@class='current']")
    public WebElement installationCustomerProductReturns;

    //https://qa.trendlifebuy.com/contact-us>  Get in Touch section Product Returns
    @FindBy(xpath = "//li[@data-value='3']")
    public WebElement productReturns;

    //https://qa.trendlifebuy.com/contact-us>  Get in Touch section Write Message box
    @FindBy(id = "message")
    public WebElement boxWriteMessage;

    //https://qa.trendlifebuy.com/contact-us>  Get in Touch section SEND MESSAGE button
    @FindBy(id = "contactBtn")
    public WebElement buttonSendMessage;


    //yasar
    @FindBy(xpath = "//i[@class='fab fa-kickstarter-k']")
    public WebElement ToysKidsBabiesLinki;

    @FindBy(xpath = "//i[@class='fas fa-shopping-bag']")
    public WebElement BagShoesLinki;
    @FindBy(xpath = "//i[@class='fas fa-home']")
    public WebElement LifestyleHomeLinki;
    @FindBy(xpath = "//i[@class='fas fa-tv']")
    public WebElement TVHomeAppliancesLinki;

    @FindBy(xpath = "//i[@class='fas fa-bicycle']")
    public WebElement AutoMobilesbikesLinki;

    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myAccount;

    @FindBy(xpath = "//a[text()='Order Status']")
    public WebElement orderStatus;

    @FindBy(xpath = "//a[text()='Referral']")
    public WebElement referral;
    @FindBy(xpath = "//a[text()='Coupons']")
    public WebElement coupons;

    @FindBy(xpath = "//a[text()='About Us']")
    public WebElement aboutUsLinkYasar;
    @FindBy(xpath = "//a[text()='Contact Us']")
    public WebElement contactUsLinkYasar;
    @FindBy(xpath = "//a[text()='Career']")
    public WebElement careerLinkYasar;

    @FindBy(xpath = "//a[text()='Refund Policy']")
    public WebElement refundPolicyLinkYasar;

    @FindBy(xpath = "//a[text()='Terms & Condition']")
    public WebElement termsConditionLinkYasar;

    @FindBy(xpath = "//div[@id='back-top']")
    public WebElement goToTop;

    @FindBy(xpath = "//i[@class='fab fa-twitter']")
    public WebElement twitterIcon;
    @FindBy(xpath = "//i[@class='fab fa-linkedin']")
    public WebElement linkedinIcon;
    @FindBy(xpath = "//i[@class='fab fa-instagram']")
    public WebElement instagramIcon;
    @FindBy(xpath = "//i[@class='fab fa-facebook-f']")
    public WebElement facebookIcon;

    @FindBy(xpath = "//h3[text()='Trending Products']")
    public WebElement trendingProducts;
    @FindBy(xpath = "//h3[text()='Hot  Categories']")
    public WebElement hotCategories;

    @FindBy(xpath = "//h4[text()='House Appliances']")
    public WebElement houseAppliances;

    @FindBy(xpath = "//h4[text()='Recommendation For You']")
    public WebElement recommendationForYou;
    @FindBy(xpath = "//h3[text()='Top Brand']")
    public WebElement topBrand;

    @FindBy(xpath = "//h3[text()='Popular Searches']")
    public WebElement popularSearches;
    @FindBy(xpath = "//h3[text()='Trendlifebuy | ONLINE SHOPPING']")
    public WebElement trendlifebuOnlineShopping;
    @FindBy(xpath = "(//span[text()='View All'])[1]")
    public WebElement viewAllButton;
    @FindBy(xpath = "//h3[@class='branding_text']")
    public WebElement brandingTextviewAll;
    @FindBy(xpath = "//span[text()='More Deals']")
    public WebElement moreDetails;

    @FindBy(xpath = "//a[@id='loadmore']")
    public WebElement loadMore;


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
    @FindBy(xpath = "(//*[@class='add_cart add_to_cart addToCartFromThumnail'])[9]")
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

    @FindBy(xpath = "//*[@class='close_icon style_2 lh-1 cart_item_delete_btn cursor_pointer']")
    public WebElement buttonDelete;

    @FindBy(xpath = "//*[text()='No product found']")
    public WebElement textNoProductFound;

    @FindBy(xpath = "(//*[@class='ti-close'])[4]")
    public WebElement buttonCloseShoppingCart;


}






