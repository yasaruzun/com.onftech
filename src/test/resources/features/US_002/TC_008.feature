Feature:US_002 Verify that the functions in the top menu of the home page are active

  Scenario:TC_008 login button should redirect to relevant page

    Given go to the "userUrl"
    Then  click subscribe quick
    Then  wait 1 second
    Then  click the login button
    Then  wait 2 second
    Then  test that sign in button is visible