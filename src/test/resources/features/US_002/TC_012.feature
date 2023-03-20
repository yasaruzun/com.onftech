Feature:US_002 Verify that the functions in the top menu of the home page are active

  Scenario:TC_012 About Us button should lead to the relevant page

    Given go to the "userUrl"
    Then wait 2 second
    Then click subscribe quick
    Then wait 1 second
    And click the about button
    Then wait 1 second
    And test that the about button should redirect to the relevant page