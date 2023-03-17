Feature:US_002 Verify that the functions in the top menu of the home page are active

  Scenario:TC_009 The register button should lead to the relevant page


    Given go to the "userUrl"
    Then wait 2 second
    Then click subscribe quick
    Then wait 1 second
    Then click the register button
    Then wait 2 second
    And test that the sign up should be visible