package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CustomerPage {

    public CustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    /*
    15-200 bülent
    205-400 mustafa talip
    405-600-hasan
    605-800 ibrahim
    805-1000
     */
    // HomePage Login
    @FindBy(xpath = "//a[text()='Login']")
    public WebElement LoginLink;
    // HomePage >Sign In> email adress
    @FindBy(xpath = "//input[@ id='text']")
    public WebElement UserEmailAdress;
    // HomePage >Sign In> Password
    @FindBy(xpath = "//input[@ id='password']")
    public WebElement UserPassword;
    // HomePage >Sign In> Sign in buton
    @FindBy(xpath = "//button [@ id='sign_in_btn']")
    public WebElement SignInButton;
    // HomePage >Sign In> Sign in buton> Dashboard
    @FindBy(xpath = "(//a [text()='Dashboard'])[1]")
    public WebElement DashboardButton;
    // HomePage >Sign In> Sign in buton> DashboardScreen
    @FindBy(xpath = "(//div[@ class='container'])[5]")
    public WebElement DashboardScreen;
    // HomePage >Sign In> Sign in buton> DashboardScreen>Profilusername
    @FindBy(xpath = "//h4[@ class='font_20 f_w_700']")
    public WebElement ProfilUsername;
    // HomePage >Sign In> Sign in buton> DashboardScreen>Profiluseremail
    @FindBy(xpath = "//span [@class='email_text font_14 f_w_400 mute_text position-relative']")
    public WebElement ProfilUseremail;
    // HomePage >Sign In> Sign in buton> DashboardScreen>All Order
    @FindBy(xpath = "(//span[@ class='font_14 f_w_500'])[1]")
    public WebElement AllOrderlink;
    // HomePage >Sign In> Sign in buton> DashboardScreen>MyWishlist
    @FindBy(xpath = "(//span[@ class='font_14 f_w_500'])[2]")
    public WebElement MyWishlist;
    // HomePage >Sign In> Sign in buton> DashboardScreen>Refund Success
    @FindBy(xpath = "(//span[@ class='font_14 f_w_500'])[3]")
    public WebElement RefundSuccess;
    // HomePage >Sign In> Sign in buton> DashboardScreen>Product in Cart
    @FindBy(xpath = "(//span[@ class='font_14 f_w_500'])[4]")
    public WebElement ProductInCart;
    // HomePage >Sign In> Sign in buton> DashboardScreen>Coupon Used
    @FindBy(xpath = "(//span[@ class='font_14 f_w_500'])[5]")
    public WebElement CouponUsed;
    // HomePage >Sign In> Sign in buton> DashboardScreen>Completed Order
    @FindBy(xpath = "(//span[@ class='font_14 f_w_500'])[6]")
    public WebElement CompletedOrder;
    // HomePage >Sign In> Sign in buton> DashboardScreen>Total Balance
    @FindBy(xpath = "//h4[@ class='font_30 f_w_700 secondary_text mb_25']")
    public WebElement TotalBalance;
    // HomePage >Sign In> Sign in buton> DashboardScreen>RechargeWallet
    @FindBy(xpath = "//span[@ class='font_14 f_w_700 secondary_text text-uppercase']")
    public WebElement RechargeWallet;
    // HomePage >Sign In> Sign in buton> DashboardScreen>RechargeWallet> Recharge Amount
    @FindBy(xpath = "//div [@class='payment_modal_wallet']")
    public WebElement RechargeAmount;
    // HomePage >Sign In> Sign in buton> DashboardScreen>RechargeWallet> AddFund
    @FindBy(xpath = "//button[@ class='amaz_primary_btn style2 text-nowrap']")
    public WebElement AddFund;
    // HomePage >Sign In> Sign in buton> DashboardScreen>RechargeWallet> RechargeAmountLink
    @FindBy(xpath = "//input [@ name='recharge_amount']")
    public WebElement RechargeAmountLink;
    // HomePage >Sign In> Sign in buton> DashboardScreen>RechargeWallet> AddFund > Stripe
    @FindBy(xpath = "//img [@class='img-fluid']")
    public WebElement Stripe;
    // HomePage >Sign In> Sign in buton> DashboardScreen>Purchase History
    @FindBy(xpath = "//div[@ class='dashboard_white_box_header d-flex align-items-center gap_15 pb_10 mb_5']")
    public WebElement Purchasehistorylink;
    // HomePage >Sign In> Sign in buton> DashboardScreen>Purchase History>SeeAll
    @FindBy(xpath = "//a[@ class='amaz_badge_btn2 text-uppercase text-nowrap']")
    public WebElement PurchasehistorySeeAll;
    // HomePage >Sign In> Sign in buton> DashboardScreen>Purchase History>purchaseHistoryScreen
    @FindBy(xpath = "//h3[@ class='font_20 f_w_700 mb-0 ']")
    public WebElement PurchasehistoryScreen;
    // HomePage >Sign In> Sign in buton> DashboardScreen>MyWishList
    @FindBy(xpath = "(//h3[@ class='font_20 f_w_700 mb-0  flex-fill'])[2]")
    public WebElement MyWishListLink;
    // HomePage >Sign In> Sign in buton> DashboardScreen>MyWishList>SeeAll
    @FindBy(xpath = "(//a[@ class='amaz_badge_btn2 text-uppercase'])[1]")
    public WebElement MyWishListSeeAll;

    // HomePage >Sign In> Sign in buton> DashboardScreen>MyWishListcsreen
    @FindBy(xpath = "//div[@ class='dashboard_white_box style2 bg-white mb_25']")
    public WebElement MyWishListScreen;

    // HomePage >Sign In> Sign in buton> DashboardScreen>RecentOrder
    @FindBy(xpath = "(//h3[@ class='font_20 f_w_700 mb-0  flex-fill'])[3]")
    public WebElement recentorderLink;

    // HomePage >Sign In> Sign in buton> DashboardScreen>Recent order>SeeAll
    @FindBy(xpath = "(//a[ text()='See All'])[3]")
    public WebElement RecentorderSeeAll;

    // HomePage >Sign In> Sign in buton> DashboardScreen>RecentOrder
    @FindBy(xpath = "//div[@ class='col-xl-8 col-lg-8']")
    public WebElement recentorderScreen;

    // HomePage >Sign In> Sign in buton> DashboardScreen>product in cart
    @FindBy(xpath = "//h3[ text()='Product in Cart']")
    public WebElement ProductInCartLink;

    // HomePage >Sign In> Sign in buton> DashboardScreen>ProductIncart>SeeAll
    @FindBy(xpath = "(//a[ text()='See All'])[4]")
    public WebElement ProductInCartSeeAll;

    // HomePage >Sign In> Sign in buton> DashboardScreen>ProductIncartscreen
    @FindBy(xpath = "//form[@ id='cart_form']")
    public WebElement ProductInCartScreen;

  // HomePage >Sign In> Sign in buton> DashboardScreen>SideBarDashboardLink
    @FindBy(xpath = "//a[@ class='position-relative d-flex align-items-center active'")
    public WebElement SideBarDashboardLink;

    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarPurchase history
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center'])[1]")
    public WebElement SideBarPurchaseHistory;

    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarWishList
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center'])[2]")
    public WebElement SideBarWishlist;

    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarMyOrderLink
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center'])[3]")
    public WebElement SideBarMyOrderLink;

    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarGiftcardLink
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center'])[4]")
    public WebElement SideBarGiftcardLink;

    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarMyWalletLink
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center '])[1]")
    public WebElement SideBarMyWalletLink;

    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarMyCouponsLink
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center'])[5]")
    public WebElement SideBarMyCuponsLink;

    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarRefundDisputeLink
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center'])[6]")
    public WebElement SideBarRefundDisputeLink;

    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarMyAccountLink
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center'])[7]")
    public WebElement SideBarMyAccountLink;
    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarDigitalProductsLink
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center'])[8]")
    public WebElement SideBarDigitalProductsLink;

    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarReferralLink
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center'])[9]")
    public WebElement SideBarReferralLink;

    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarNotificationLink
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center'])[10]")
    public WebElement SideBarNotificationLink;

    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarSupportTicketLink
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center '])[2]")
    public WebElement SideBarSupportticketLink;

    // /HomePage >Sign In> Sign in buton> DashboardScreen>MyOrderPage
    @FindBy(xpath = "//div[@ id='myTabContent']")
    public WebElement MyOrderPage;
    // /HomePage >Sign In> Sign in buton> DashboardScreen>GiftcardPage
    @FindBy(xpath = "(//div[@ class='table-responsive'])[1]")
    public WebElement GiftcardPage;
    // /HomePage >Sign In> Sign in buton> DashboardScreen>MyWalletPage
    @FindBy(xpath = "//div[@ class='dashboard_wallet_boxes mb_40']")
    public WebElement MyWalletPage;
    // /HomePage >Sign In> Sign in buton> DashboardScreen>MyCouponsPage
    @FindBy(xpath = "//form[@ id='couponForm']")
    public WebElement MyCouponsPage;
    // /HomePage >Sign In> Sign in buton> DashboardScreen>MyRefundDisputePage
    @FindBy(xpath = "")
    public WebElement RefundDisputePage;
    // /HomePage >Sign In> Sign in buton> DashboardScreen>MyAccountPage
    @FindBy(xpath = "//form [@ id='basic_info']")
    public WebElement MyAccountPage;
    // /HomePage >Sign In> Sign in buton> DashboardScreen>DigitalProductPage
    @FindBy(xpath = "//h3[@ class='font_20 f_w_700 mb-0 ']")
    public WebElement DigitalProductPage;

    // /HomePage >Sign In> Sign in buton> DashboardScreen>ReferralPage
    @FindBy(xpath = "//h4[text()='My referral code']")
    public WebElement ReferralPage;
    // /HomePage >Sign In> Sign in buton> DashboardScreen>SuportTicketPage
    @FindBy(xpath = "//div[@ class='table-responsive mb_30']")
    public WebElement SupportticketPage;

}
