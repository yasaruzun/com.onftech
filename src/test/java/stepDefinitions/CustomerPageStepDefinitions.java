package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CustomerPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class CustomerPageStepDefinitions {

   CustomerPage customerPage=new CustomerPage();

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
    public void dashboard_page_is_displayed() {

     Assert.assertTrue(customerPage.DashboardScreen.isDisplayed());

    }

 @And("UserName  are displayed")
 public void usernameAreDisplayed() {
     Assert.assertTrue(customerPage.ProfilUsername.isDisplayed());
     
 }

 @And("User email address are displayed")
 public void userEmailAddressAreDisplayed() {
     Assert.assertTrue(customerPage.ProfilUseremail.isDisplayed());
 }

 @Then("{string} seconds wait")
 public void secondsWait(String string) {

  ReusableMethods.bekle(3);
 }

 @Then("All Order  boards are is displayed")
 public void all_order_boards_are_is_displayed() {
     Assert.assertTrue(customerPage.AllOrderlink.isDisplayed());

 }
 @Then("My Wishlist boards is displayed")
 public void my_wishlist_boards_is_displayed() {
     Assert.assertTrue(customerPage.MyWishlist.isDisplayed());

 }
 @Then("Refund Success boards  is displayed")
 public void refund_success_boards_is_displayed() {
     Assert.assertTrue(customerPage.RefundSuccess.isDisplayed());

 }
 @Then("Coupon Used boards  is displayed")
 public void coupon_used_boards_is_displayed() {
     Assert.assertTrue(customerPage.CouponUsed.isDisplayed());

 }
 @Then("Completed Order boards is displayed")
 public void completed_order_boards_is_displayed() {
     Assert.assertTrue(customerPage.CompletedOrder.isDisplayed());

 }

 @And("Product in Cart  is displayed")
 public void productInCartIsDisplayed() {
     Assert.assertTrue(customerPage.ProductInCart.isDisplayed());
 }

 @And("Total Balance boards  is displayed")
 public void totalBalanceBoardsIsDisplayed() {

     Assert.assertTrue(customerPage.TotalBalance.isDisplayed());
 }

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
 public void stripeLinkIsDisplay() {

     Assert.assertTrue(customerPage.Stripe.isDisplayed());
 }


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
        Assert.assertTrue(customerPage.recentorderLink.isDisplayed());
    }

    @And("Recent Order SEE ALL link click")
    public void recentOrderSEEALLLinkClick() {

         customerPage.RecentorderSeeAll.click();
    }

    @And("Recent Order page is displayed")
    public void recentOrderPageIsDisplayed() {
        Assert.assertTrue(customerPage.recentorderScreen.isDisplayed());
    }

    @And("Product in Cart link is displayed")
    public void productInCartLinkIsDisplayed() {
        Assert.assertTrue(customerPage.ProductInCartLink.isDisplayed());
    }

    @And("Product in Cart SEE ALL link click")
    public void productInCartSEEALLLinkClick() {

        customerPage.ProductInCartSeeAll.click();
    }

    @And("Product in Cart page is displayed")
    public void productInCartPageIsDisplayed() {
        Assert.assertTrue(customerPage.ProductInCartScreen.isDisplayed());
    }
}
