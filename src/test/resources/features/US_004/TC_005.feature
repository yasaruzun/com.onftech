Feature: Verify that the functions in the submenu of the Home page are visible and active

  Scenario: TC_005 Verify that the Google Play and Apple Store buttons are visible

    Given go to the "userUrl"
    Then wait 2 second
    Then click subscribe quick
    Then wait 1 second
    Then Verify that the Google Play and Apple Store buttons are visible