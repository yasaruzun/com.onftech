Feature:US_002 Verify that the functions in the top menu of the home page are active

  Scenario:TC_006 It should redirect to the home page when the logo is pressed.

    Given go to the "userUrl"
    Then click subscribe quick
    Then wait 2 second
    Then click to the logo
    Then wait 2 second
    Then test that the current url is homepage

