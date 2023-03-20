Feature: Verify that the functions in the submenu of the Home page are visible and active

  Scenario: TC_002 As a user, verify that clicking
                   the My Account, Order Status, Referral, Coupons links redirects to the relevant page

    Given go to the "userUrl"
    Then wait 2 second
    Then click subscribe quick
    Then wait 1 second
    Then click the login button
    Then wait 2 second
    Then enter the email and password
    Then wait 1 second
    And  click the sign in button
    Then wait 2 second
    And  sayfanın en asagisina in
    Then wait 1 second
    Then test that the My Account, Order Status, Referral, Coupons links redirects to the relevant page