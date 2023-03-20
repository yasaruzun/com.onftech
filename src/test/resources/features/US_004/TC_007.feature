Feature: Verify that the functions in the submenu of the Home page are visible and active

  Scenario: TC_007 Verify that clicking the Go to Top button goes to the top of the home page

    Given go to the "userUrl"
    Then wait 2 second
    Then click subscribe quick
    Then wait 1 second
    Then sayfanın en asagisina in
    Then wait 1 second
    And  click the Go to top button
    Then wait 2 second
    Then verify that it is scrolled to the top of the home page