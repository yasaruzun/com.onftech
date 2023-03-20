Feature: Verify that the functions in the submenu of the Home page are visible and active

  Scenario: TC_004 As a visitor, verify that clicking on About Us, Contact Us, Career, Refund Policy,
                      Terms & Condition links redirects to the relevant pages

    Given go to the "userUrl"
    Then wait 2 second
    Then click subscribe quick
    Then wait 1 second
    Then sayfanın en asagisina in
    Then wait 2 second
    Then verify that clicking on About Us, Contact Us, Career, Terms & Condition links redirects to the relevant pages
    And verify that clicking Refund Policy links redirects to the relevant pages

    #son step de bug var