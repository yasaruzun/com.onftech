Feature:US_005 Verify that the functions in the body of the home page are active

  Scenario: TC_002 Verify that the View All button redirects to the relevant page


    Given go to the "userUrl"
    Then wait 2 second
    Then click subscribe quick
    Then wait 1 second
    Then click the view all button
    Then wait 2 second
    Then Verify that the View All button redirects to the relevant page

