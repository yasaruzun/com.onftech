Feature: Verify that the functions in the submenu of the Home page are visible and active

  Scenario: TC_001 Verify that My Account, Order Status, Referral, Coupons links are visible

    Given go to the "userUrl"
    Then wait 2 second
    Then click subscribe quick
    Then wait 1 second
    Then sayfanın en asagisina in
    Then wait 2 second
    Then test that my account,order status,referral and coupons are visible