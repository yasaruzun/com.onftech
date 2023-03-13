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
    @FindBy(xpath = "//a[text()='Login']")      // HomePage Login
    public WebElement LoginLink;
    @FindBy(xpath = "//a[@ class='log_out']")    //  home page logout
    public WebElement LogoutLink;
    @FindBy(xpath = "//input[@ id='text']")    // HomePage >Sign In> email adress
    public WebElement UserEmailAdress;
    @FindBy(xpath = "//input[@ id='password']")   // HomePage >Sign In> Password
    public WebElement UserPassword;
    @FindBy(xpath = "//button [@ id='sign_in_btn']")       // HomePage >Sign In> Sign in buton
    public WebElement SignInButton;
    @FindBy(xpath = "(//a [text()='Dashboard'])[1]")        // HomePage >Sign In> Sign in buton> Dashboard
    public WebElement DashboardButton;
    @FindBy(xpath = "(//div[@ class='container'])[5]")     // HomePage >Sign In> Sign in buton> DashboardScreen
    public WebElement DashboardScreen;
    @FindBy(xpath = "//h4[@ class='font_20 f_w_700']")     // HomePage >Sign In> Sign in buton> DashboardScreen>Profilusername
    public WebElement ProfilUsername;
    @FindBy(xpath = "//span [@class='email_text font_14 f_w_400 mute_text position-relative']")    // HomePage >Sign In> Sign in buton> DashboardScreen>Profiluseremail
    public WebElement ProfilUseremail;
    @FindBy(xpath = "(//span[@ class='font_14 f_w_500'])[1]")   // HomePage >Sign In> Sign in buton> DashboardScreen>All Order
    public WebElement AllOrderlink;
    @FindBy(xpath = "(//span[@ class='font_14 f_w_500'])[2]")    // HomePage >Sign In> Sign in buton> DashboardScreen>MyWishlist
    public WebElement MyWishlist;
    @FindBy(xpath = "(//span[@ class='font_14 f_w_500'])[3]")     // HomePage >Sign In> Sign in buton> DashboardScreen>Refund Success
    public WebElement RefundSuccess;
    @FindBy(xpath = "(//span[@ class='font_14 f_w_500'])[4]")      // HomePage >Sign In> Sign in buton> DashboardScreen>Product in Cart
    public WebElement ProductInCart;
    @FindBy(xpath = "(//span[@ class='font_14 f_w_500'])[5]")      // HomePage >Sign In> Sign in buton> DashboardScreen>Coupon Used
    public WebElement CouponUsed;
    @FindBy(xpath = "(//span[@ class='font_14 f_w_500'])[6]")    // HomePage >Sign In> Sign in buton> DashboardScreen>Completed Order
    public WebElement CompletedOrder;
    @FindBy(xpath = "//h4[@ class='font_30 f_w_700 secondary_text mb_25']")    // HomePage >Sign In> Sign in buton> DashboardScreen>Total Balance
    public WebElement TotalBalance;
    @FindBy(xpath= "//button[@ class='recharge_wallet_btn d-flex align-items-center justify-content-center gap_10 w-100 dynamic_svg']")   // HomePage >Sign In> Sign in buton> DashboardScreen>RechargeWallet
    public WebElement RechargeWallet;
    @FindBy(xpath = "//input[@ placeholder='Enter Recharge Amount']")     // HomePage >Sign In> Sign in buton> DashboardScreen>RechargeWallet> Recharge Amount
    public WebElement RechargeAmount;
    @FindBy(xpath = "//button[@ class='amaz_primary_btn style2 text-nowrap']")   // HomePage >Sign In> Sign in buton> DashboardScreen>RechargeWallet> AddFund
    public WebElement AddFund;
    @FindBy(xpath = "//input [@ name='recharge_amount']")      // HomePage >Sign In> Sign in buton> DashboardScreen>RechargeWallet> RechargeAmountLink
    public WebElement RechargeAmountLink;
    @FindBy(xpath = "//img [@class='img-fluid']")    // HomePage >Sign In> Sign in buton> DashboardScreen>RechargeWallet> AddFund > Stripe
    public WebElement Stripe;
    @FindBy(xpath = "//div[@ class='dashboard_white_box_header d-flex align-items-center gap_15 pb_10 mb_5']")  // HomePage >Sign In> Sign in buton> DashboardScreen>Purchase History
    public WebElement Purchasehistorylink;
    @FindBy(xpath = "//a[@ class='amaz_badge_btn2 text-uppercase text-nowrap']")   // HomePage >Sign In> Sign in buton> DashboardScreen>Purchase History>SeeAll
    public WebElement PurchasehistorySeeAll;
    @FindBy(xpath = "//h3[@ class='font_20 f_w_700 mb-0 ']")    // HomePage >Sign In> Sign in buton> DashboardScreen>Purchase History>purchaseHistoryScreen
    public WebElement PurchasehistoryScreen;
    @FindBy(xpath = "(//h3[@ class='font_20 f_w_700 mb-0  flex-fill'])[2]")  // HomePage >Sign In> Sign in buton> DashboardScreen>MyWishList
    public WebElement MyWishListLink;
    @FindBy(xpath = "(//a[@ class='amaz_badge_btn2 text-uppercase'])[1]")   // HomePage >Sign In> Sign in buton> DashboardScreen>MyWishList>SeeAll
    public WebElement MyWishListSeeAll;
    @FindBy(xpath = "//div[@ class='dashboard_white_box style2 bg-white mb_25']")   // HomePage >Sign In> Sign in buton> DashboardScreen>MyWishListcsreen
    public WebElement MyWishListScreen;
    @FindBy(xpath = "(//h3[@ class='font_20 f_w_700 mb-0  flex-fill'])[3]")      // HomePage >Sign In> Sign in buton> DashboardScreen>RecentOrder
    public WebElement recentorderLink;
    @FindBy(xpath = "(//a[ text()='See All'])[3]")      // HomePage >Sign In> Sign in buton> DashboardScreen>Recent order>SeeAll
    public WebElement RecentorderSeeAll;
    @FindBy(xpath = "(//a[@ class='amaz_primary_btn style2 text-nowrap '])[1]")     // HomePage >Sign In> Sign in buton> DashboardScreen>RecentOrder
    public WebElement OrderDetailButton;
    @FindBy(xpath = "//h3[ text()='Product in Cart']")      // HomePage >Sign In> Sign in buton> DashboardScreen>product in cart
    public WebElement ProductInCartLink;
    @FindBy(xpath = "(//a[@ class='amaz_badge_btn2 text-uppercase'])[3]")   // HomePage >Sign In> Sign in buton> DashboardScreen>ProductIncart>SeeAll
    public WebElement ProductInCartSeeAll;
    @FindBy(xpath = "//a[@ class='amaz_primary_btn min_200 style2 cursor_pointer  process_to_checkout_check ']")    // HomePage >Sign In> Sign in buton> DashboardScreen>ProductIncartscreen
    public WebElement ProductInCartProceedCheckout;
    @FindBy(xpath = "(//a[@ href='https://qa.trendlifebuy.com/profile/dashboard'])[3]")    // HomePage >Sign In> Sign in buton> DashboardScreen>SideBarDashboardLink
    public WebElement SideBarDashboardLink;
    @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[1]")   // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarPurchase history
    public WebElement SideBarPurchaseHistory;
    @FindBy(xpath = "(//a[@ href='https://qa.trendlifebuy.com/my-wishlist'])[2]")   // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarWishList
    public WebElement SideBarWishlist;
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center'])[3]")   // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarMyOrderLink   //a[normalize-space()='My Order']
    public WebElement SideBarMyOrderLink;
    @FindBy(xpath = "//a[@ href='https://qa.trendlifebuy.com/purchased-gift-cards']")    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarGiftcardLink
    public WebElement SideBarGiftcardLink;
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center '])[1]")    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarMyWalletLink
    public WebElement SideBarMyWalletLink;
    @FindBy(xpath = "(//a[@ href='https://qa.trendlifebuy.com/profile/coupons'])[1]")   // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarMyCouponsLink
    public WebElement SideBarMyCuponsLink;
    @FindBy(xpath = "//a[@  href='https://qa.trendlifebuy.com/refund/my-refund-list']")    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarRefundDisputeLink
    public WebElement SideBarRefundDisputeLink;
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center'])[7]")   // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarMyAccountLink
    public WebElement SideBarMyAccountLink;
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center'])[8]")   // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarDigitalProductsLink
    public WebElement SideBarDigitalProductsLink;
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center'])[9]")     // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarReferralLink
    public WebElement SideBarReferralLink;
    @FindBy(xpath= "(//a[@ href='https://qa.trendlifebuy.com/profile/notifications'])[2]")     // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarNotificationLink
    public WebElement SideBarNotificationLink;
    @FindBy(xpath = "(//a[@ class='position-relative d-flex align-items-center '])[2]")    // /HomePage >Sign In> Sign in buton> DashboardScreen>SideBarSupportTicketLink
    public WebElement SideBarSupportticketLink;
    @FindBy(xpath = "//div[@ id='myTabContent']")   // /HomePage >Sign In> Sign in buton> DashboardScreen>MyOrderPage
    public WebElement MyOrderPage;
    @FindBy(xpath = "(//div[@ class='table-responsive'])[1]")   // /HomePage >Sign In> Sign in buton> DashboardScreen>GiftcardPage
    public WebElement GiftcardPage;
    @FindBy(xpath = "//div[@ class='dashboard_wallet_boxes mb_40']")  // /HomePage >Sign In> Sign in buton> DashboardScreen>MyWalletPage
    public WebElement MyWalletPage;
    @FindBy(xpath = "//form[@ id='couponForm']")   // /HomePage >Sign In> Sign in buton> DashboardScreen>MyCouponsPage
    public WebElement MyCouponsPage;
    @FindBy(xpath = "//div[@ class='alert alert-dark']")    // /HomePage >Sign In> Sign in buton> DashboardScreen>MyRefundDisputePage
    public WebElement RefundDisputePage;
    @FindBy(xpath = "//form [@ id='basic_info']")  // /HomePage >Sign In> Sign in buton> DashboardScreen>MyAccountPage
    public WebElement MyAccountPage;
    @FindBy(xpath = "//h3[@ class='font_20 f_w_700 mb-0 ']")    // /HomePage >Sign In> Sign in buton> DashboardScreen>DigitalProductPage
    public WebElement DigitalProductPage;
    @FindBy(xpath = "//h4[text()='My referral code']")   // /HomePage >Sign In> Sign in buton> DashboardScreen>ReferralPage
    public WebElement ReferralPage;
    @FindBy(xpath = "//div[@ class='table-responsive mb_30']")  // /HomePage >Sign In> Sign in buton> DashboardScreen>SuportTicketPage
    public WebElement SupportticketPage;
    @FindBy(xpath = "//h4[@ class='font_24 f_w_700 flex-fill m-0']")    // /HomePage >Sign In> Sign in buton> DashboardScreen>NatificationPage
    public WebElement NotificationPage;
    @FindBy (xpath = "(//li[@class='option'])[1]" )     // /HomePage >Sign In> Sign in buton> DashboardScreen>PurchaseHistoryPage>All history link
    public WebElement PurchaseHistoryAllHistoryLink;
    @FindBy (xpath = "(//li[@class='option'])[2]" )      // /HomePage >Sign In> Sign in buton> DashboardScreen>PurchaseHistoryPage>PendingOrderlink
    public WebElement PurchaseHistoryPendingOrderLink;
    @FindBy (xpath = "(//li[@class='option'])[3]" )     // /HomePage >Sign In> Sign in buton> DashboardScreen>PurchaseHistoryPage>Completed order link
    public WebElement PurchaseHistoryCompletedOrderLink;
    @FindBy (xpath = "(//li[@class='option'])[4]" )      // /HomePage >Sign In> Sign in buton> DashboardScreen>PurchaseHistoryPage>Refused Canceled link
    public WebElement PurchaseHistoryrefusedCancelledOrderLink;
    @FindBy (xpath = "//li[@ data-value='confirm']" )     // /HomePage >Sign In> Sign in buton> DashboardScreen>PurchaseHistoryPage>confirmed Order link
    public WebElement PurchaseHistoryConfirmedOrderLink;
    @FindBy (xpath = "(//button[@ class='amazy_status_btn purchase_show'])[1]")     // /HomePage >Sign In> Sign in buton> DashboardScreen>PurchaseHistoryPage> summary Order link
    public WebElement PurchaseHistorySummaryOrderLink;
    @FindBy(xpath = "(//h5[@ class='font_14 f_w_600 m-0 pb_10'])[1]")      // /HomePage >Sign In> Sign in buton> DashboardScreen>PurchaseHistoryPage>Summary Page link
    public WebElement PurchaseHistoryOrderSummarypage;
    @FindBy(xpath = "(//i[@ class='ti-close'])[2]")      // /HomePage >Sign In> Sign in buton> DashboardScreen>PurchaseHistoryPage>Summary page close button
    public WebElement PurchaseHistoryOrderSummarypageClose;
    @FindBy(xpath = "(//a[@class='amazy_status_btn'])[1]")     // /HomePage >Sign In> Sign in buton> DashboardScreen>PurchaseHistoryPage>Download billing link
    public WebElement PurchaseHistoryOrderDownloadBilling;
    @FindBy(xpath = "(//a[@class='amaz_primary_btn style2 text-nowrap '])[2]")   // /HomePage >Sign In> Sign in buton> DashboardScreen>My order page>Order detail
    public WebElement MyorderPageOrderDetailButton;
    @FindBy(xpath = "//button[@ id='home-tab']")   // /HomePage >Sign In> Sign in buton> DashboardScreen>My order page>All link
    public WebElement MyorderPageAllLink;
    @FindBy(xpath = "//button[@id='Pay-tab'] ")   // /HomePage >Sign In> Sign in buton> DashboardScreen>My order page>ToPay link
    public WebElement MyorderPageToPayLink;
    @FindBy(xpath = "//button[@ id='Ship-tab'] ")   // /HomePage >Sign In> Sign in buton> DashboardScreen>My order page>To Ship link
    public WebElement MyorderPageToShipLink;
    @FindBy(xpath = "//button[@ id='Receive-tab'] ")   // /HomePage >Sign In> Sign in buton> DashboardScreen>My order page>To Receive link
    public WebElement MyorderPageToReceiveLink;
    @FindBy(xpath = "(//div[@ class='d-flex align-items-center flex-wrap gap_5'])[1] ")   // /HomePage >Sign In> Sign in buton> DashboardScreen>My order page>To Receive link
    public WebElement MyorderPageOrderIDLink;
    @FindBy(xpath = "(//div[@ class='d-flex align-items-center flex-wrap gap_5'])[2] ")   // /HomePage >Sign In> Sign in buton> DashboardScreen>My order page>To Receive link
    public WebElement MyorderPageOrderDateLink;
    @FindBy(xpath = "(//div[@ class='d-flex align-items-center flex-wrap gap_5'])[3] ")   // /HomePage >Sign In> Sign in buton> DashboardScreen>My order page>To Receive link
    public WebElement MyorderPageStatusLink;
    @FindBy(xpath = "(//div[@ class='d-flex align-items-center flex-wrap gap_5'])[4] ")   // /HomePage >Sign In> Sign in buton> DashboardScreen>My order page>To Receive link
    public WebElement MyorderPageOrderAmountLink;
    @FindBy(xpath = "(//div[@ class='d-flex align-items-center flex-wrap gap_5'])[5] ")   // /HomePage >Sign In> Sign in buton> DashboardScreen>My order page>To Receive link
    public WebElement MyorderPagePaidbyLink;
    @FindBy(xpath = "//div[@ class='nice-select amaz_select5'] ")   // /HomePage >Sign In> Sign in buton> DashboardScreen>My order page>Numberofproducts
    public WebElement MyorderPageNumberofproductsLink;

}
