Feature: Verify that the functions in the submenu of the Home page are visible and active

  Scenario: TC_003 Verify that the About Us, Contact Us, Career, Refund Policy, Terms & Condition links are visible

    Given go to the "userUrl"
    Then wait 2 second
    Then click subscribe quick
    Then wait 1 second
    Then sayfanın en asagisina in
    Then wait 2 second
    Then test that the About Us, Contact Us, Career, Refund Policy, Terms & Condition links are visible