Feature:US_005 Verify that the functions in the body of the home page are active

  Scenario: TC_003 Verify that the More Deals button redirects to the relevant page


    Given go to the "userUrl"
    Then wait 2 second
    Then click subscribe quick
    Then wait 1 second
    Then click the more details button
    Then wait 2 second
    Then Verify that the More Deals button redirects to the relevant page

