package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CustomerPage;
import pages.HomePage;
import utilities.ConfigReader;

import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomerPageStepDefinitions {

   CustomerPage customerPage=new CustomerPage();
    HomePage homePage= new HomePage();
   Actions actions ;


    @Then("Login link is click")
    public void login_link_is_click() {

        customerPage.LoginLink.click();
    }
    @Then("Writes {string} in the user box")
    public void writes_in_the_user_box(String string) {
     customerPage.UserEmailAdress.sendKeys(ConfigReader.getProperty("userEmail047"));
    }
    @Then("Writes {string} in the password box")
    public void writes_in_the_password_box(String string) {
     customerPage.UserPassword.sendKeys(ConfigReader.getProperty("password047"));
    }
    @Then("Sign in link is click")
    public void sign_in_link_is_click() {
     customerPage.SignInButton.click();
    }
    @Then("Dashboard link click")
    public void dashboard_link_click() {
     customerPage.DashboardButton.click();

    }
    @Then("Dashboard Page is displayed")
    public void dashboard_page_is_displayed() {     Assert.assertTrue(customerPage.DashboardScreen.isDisplayed());   }

 @And("UserName  are displayed")
 public void usernameAreDisplayed() {     Assert.assertTrue(customerPage.ProfilUsername.isDisplayed()); }

 @And("User email address are displayed")
 public void userEmailAddressAreDisplayed() {
     Assert.assertTrue(customerPage.ProfilUseremail.isDisplayed());
 }

 @Then("{string} seconds wait")
 public void secondsWait(String string) {
  ReusableMethods.bekle(3); }

 @Then("All Order  boards are is displayed")
 public void all_order_boards_are_is_displayed() {    Assert.assertTrue(customerPage.AllOrderlink.isDisplayed()); }
 @Then("My Wishlist boards is displayed")
 public void my_wishlist_boards_is_displayed() {    Assert.assertTrue(customerPage.MyWishlist.isDisplayed()); }
 @Then("Refund Success boards  is displayed")
 public void refund_success_boards_is_displayed() {     Assert.assertTrue(customerPage.RefundSuccess.isDisplayed()); }
 @Then("Coupon Used boards  is displayed")
 public void coupon_used_boards_is_displayed() {    Assert.assertTrue(customerPage.CouponUsed.isDisplayed()); }
 @Then("Completed Order boards is displayed")
 public void completed_order_boards_is_displayed() {
     Assert.assertTrue(customerPage.CompletedOrder.isDisplayed());
 }

 @And("Product in Cart  is displayed")
 public void productInCartIsDisplayed() {
     Assert.assertTrue(customerPage.ProductInCart.isDisplayed());
 }

 @And("Total Balance boards  is displayed")
 public void totalBalanceBoardsIsDisplayed() {     Assert.assertTrue(customerPage.TotalBalance.isDisplayed()); }
 @And("RECHARGE WALLET is display")
 public void rechargeWALLETIsDisplay() {
     Assert.assertTrue(customerPage.RechargeWallet.isDisplayed());
 }

 @And("RECHARGE WALLET Click")
 public void rechargeWALLETClick() {
     customerPage.RechargeWallet.click();
 }

 @And("Recharge Amount is displayed")
 public void rechargeAmountIsDisplayed() {
     Assert.assertTrue(customerPage.RechargeAmount.isDisplayed());
 }

 @And("Recharge Amount link send keys money ADD FUND link click")
 public void rechargeAmountLinkSendKeysMoneyADDFUNDLinkClick() {
    customerPage.RechargeAmountLink.sendKeys("100");
    customerPage.AddFund.click();
 }
 @Then("Stripe Link is display")
 public void stripeLinkIsDisplay() {     Assert.assertTrue(customerPage.Stripe.isDisplayed()); }
 @And("Purchase History link is displayed")
 public void purchaseHistoryLinkIsDisplayed() {
     Assert.assertTrue(customerPage.Purchasehistorylink.isDisplayed());
 }

 @And("Purchase SEE ALL link click")
 public void purchaseSEEALLLinkClick() {
     customerPage.PurchasehistorySeeAll.click();
 }

 @And("Purchase History page is displayed")
 public void purchaseHistoryPageIsDisplayed() {
     Assert.assertTrue(customerPage.PurchasehistoryScreen.isDisplayed());
 }

 @And("My Wishlist link is displayed")
 public void myWishlistLinkIsDisplayed() {
     Assert.assertTrue(customerPage.MyWishListLink.isDisplayed());
 }

 @And("My Wishlist SEE ALL link click")
 public void myWishlistSEEALLLinkClick() {
     customerPage.MyWishListSeeAll.click();
 }

 @And("My Wishlist page is displayed")
 public void myWishlistPageIsDisplayed() {
        customerPage.MyWishListScreen.isDisplayed();
 }
    @And("Recent Order link is displayed")
    public void recentOrderLinkIsDisplayed() {
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(customerPage.recentorderLink.isDisplayed());
    }
    @And("Recent Order SEE ALL link click")
    public void recentOrderSEEALLLinkClick() {
         customerPage.RecentorderSeeAll.click();
    }
    @And("Recent Order page is displayed")
    public void recentOrderPageIsDisplayed() {
        Assert.assertTrue(customerPage.OrderDetailButton.isDisplayed());
    }

    @And("Product in Cart link is displayed")
    public void productInCartLinkIsDisplayed() {
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(customerPage.ProductInCartLink.isDisplayed());
    }
    @And("Product in Cart SEE ALL link click")
    public void productInCartSEEALLLinkClick() {
        customerPage.ProductInCartSeeAll.click();
    }
    @And("Product in Cart page is displayed")
    public void productInCartPageIsDisplayed() {
        Assert.assertTrue(customerPage.ProductInCartProceedCheckout.isDisplayed());
    }
   @And("Side Bar Dashboard link.click")
    public void sideBarDashboardLinkClick() {
        actions=new Actions(Driver.getDriver());
        customerPage.SideBarDashboardLink.click();
    }
    @And("Dashboard page is displayed")
    public void dashboardPageIsDisplayed() {
        Assert.assertTrue(customerPage.DashboardScreen.isDisplayed());
    }
    @And("Side Bar Purchase History link.click")
    public void sideBarPurchaseHistoryLinkClick() {
        actions=new Actions(Driver.getDriver());
        customerPage.SideBarPurchaseHistory.click();
    }
    @And("Side Bar My Wishlist link.click")
    public void sideBarMyWishlistLinkClick() {
        actions=new Actions(Driver.getDriver());
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        customerPage.SideBarWishlist.click();
    }
    @And("Side Bar My Order link.click")
    public void sideBarMyOrderLinkClick() {
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        customerPage.SideBarMyOrderLink.click();
    }
    @And("My Order page is displayed")
    public void myOrderPageIsDisplayed() {
        Assert.assertTrue(customerPage.MyOrderPage.isDisplayed());
    }
    @And("Side Bar Giftcard link.click")
    public void sideBarGiftcardLinkClick() {
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        customerPage.SideBarGiftcardLink.click();
    }
    @And("Giftcard page is displayed")
    public void giftcardPageIsDisplayed() {
        Assert.assertTrue(customerPage.GiftcardPage.isDisplayed());
    }
    @And("Side Bar My Wallet link.click")
    public void sideBarMyWalletLinkClick() {
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        customerPage.SideBarMyWalletLink.click();
    }
    @And("My Wallet page is displayed")
    public void myWalletPageIsDisplayed() {
        Assert.assertTrue(customerPage.MyWalletPage.isDisplayed());
    }

    @And("Side Bar My Coupons link.click")
    public void sideBarMyCouponsLinkClick() {
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        customerPage.SideBarMyCuponsLink.click();
    }
    @And("My Coupons page is displayed")
    public void myCouponsPageIsDisplayed() {
        Assert.assertTrue(customerPage.MyCouponsPage.isDisplayed());
    }

    @And("Side Bar Refund &Dispute link.click")
    public void sideBarRefundDisputeLinkClick() {
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        customerPage.SideBarRefundDisputeLink.click();
    }
    @And("Refund &Dispute page is displayed")
    public void refundDisputePageIsDisplayed() {
        Assert.assertTrue(customerPage.RefundDisputePage.isDisplayed());
    }

    @And("Side Bar My Account link.click")
    public void sideBarMyAccountLinkClick() {
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        customerPage.SideBarMyAccountLink.click();
    }
    @And("My Account page is displayed")
    public void myAccountPageIsDisplayed() {
        Assert.assertTrue(customerPage.MyAccountPage.isDisplayed());
    }
    @And("Side Bar Digital Products link.click")
    public void sideBarDigitalProductsLinkClick() {
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        customerPage.SideBarDigitalProductsLink.click();
    }

    @And("Digital Products page is displayed")
    public void digitalProductsPageIsDisplayed() {
        Assert.assertTrue(customerPage.DigitalProductPage.isDisplayed());
    }

    @And("Side Bar Referral click")
    public void sideBarReferralClick() {
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        customerPage.SideBarReferralLink.click();
    }
    @And("Referral  page is displayed")
    public void referralPageIsDisplayed() {
        Assert.assertTrue(customerPage.ReferralPage.isDisplayed());
    }
    @And("Side Bar  Support Ticket link click")
    public void sideBarSupportTicketLinkClick() {
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        customerPage.SideBarSupportticketLink.click();
    }
    @And("Support Ticket page is displayed")
    public void supportTicketPageIsDisplayed() {
        Assert.assertTrue(customerPage.SupportticketPage.isDisplayed());
    }

    @And("Side Bar Notification link.click")
    public void sideBarNotificationLinkClick() {
        actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        customerPage.SideBarNotificationLink.click();
    }
    @And("Side Bar Notification page is displayed")
    public void sideBarNotificationPageIsDisplayed() {
       Assert.assertTrue(customerPage.NotificationPage.isDisplayed());
    }

    @And("logout link is click")
    public void logoutLinkIsClick() {
        customerPage.LogoutLink.click();
    }
    @And("All history links enabled")
    public void allHistoryLinksEnabled() {
        Assert.assertTrue(customerPage.PurchaseHistoryAllHistoryLink.isEnabled());
    }
    @And("Pending Order links enabled")
    public void pendingOrderLinksEnabled() {    Assert.assertTrue(customerPage.PurchaseHistoryPendingOrderLink.isEnabled());    }
    @And("Confirmed Order links enabled")
    public void confirmedOrderLinksEnabled() {  Assert.assertTrue(customerPage.PurchaseHistoryConfirmedOrderLink.isEnabled());   }
    @And("Completed Order links enabled")
    public void completedOrderLinksEnabled() {    Assert.assertTrue(customerPage.PurchaseHistoryCompletedOrderLink.isEnabled());    }
    @And("Refused cancelled order links enabled")
    public void refusedCancelledOrderLinksEnabled() {   Assert.assertTrue(customerPage.PurchaseHistoryrefusedCancelledOrderLink.isEnabled());    }
    @And("Order Summary is displayed")
    public void orderSummaryIsDisplayed() throws InterruptedException {
        customerPage.PurchaseHistorySummaryOrderLink.click();
        Thread.sleep(3000);
        Assert.assertTrue(customerPage.PurchaseHistoryOrderSummarypage.isDisplayed());
        customerPage.PurchaseHistoryOrderSummarypageClose.click();
    }
    @And("Order Bill is enable")
    public void orderBillIsEnable() {
        Assert.assertTrue(customerPage.PurchaseHistoryOrderDownloadBilling.isEnabled());
    }
    @And("All link is enable")
    public void allLinkIsEnable() {
        Assert.assertTrue(customerPage.MyorderPageAllLink.isEnabled());
    }
    @And("To Pay link is enable")
    public void toPayLinkIsEnable() {
        Assert.assertTrue(customerPage.MyorderPageToPayLink.isEnabled());
    }
    @And("To Ship link is enable")
    public void toShipLinkIsEnable() {
        Assert.assertTrue(customerPage.MyorderPageToShipLink.isEnabled());
    }
    @And("To Receive link is enable")
    public void toReceiveLinkIsEnable() {
        Assert.assertTrue(customerPage.MyorderPageToReceiveLink.isEnabled());
    }
    @And("Order ID is displayed")
    public void orderIDIsDisplayed() { Assert.assertTrue(customerPage.MyorderPageOrderIDLink.isDisplayed());    }
    @And("Status is displayed")
    public void statusIsDisplayed() {    Assert.assertTrue(customerPage.MyorderPageStatusLink.isDisplayed());    }
    @And("Order date is displayed")
    public void orderDateIsDisplayed() {  Assert.assertTrue(customerPage.MyorderPageOrderDateLink.isDisplayed());    }
    @And("Order Amount is displayed")
    public void orderAmountIsDisplayed() { Assert.assertTrue(customerPage.MyorderPageOrderAmountLink.isDisplayed());    }
    @And("Paid By is displayed")
    public void paidByIsDisplayed() { Assert.assertTrue(customerPage.MyorderPagePaidbyLink.isDisplayed());    }

    @Then("click the cart button")
    public void clickTheCartButton() {
        homePage= new HomePage();
        homePage.cartButton.click();
    }

    @Then("test that relevant web site's title contains cart")
    public void testThatRelevantWebSiteSTitleContainsCart() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="cart";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }
}
