Feature:US_002 Verify that the functions in the top menu of the home page are active

  Scenario:TC_003 Compare button should lead to the relevant page

    Given go to the "userUrl"
    Then click subscribe quick
    And wait 3 second
    Then click the compare button
    Then wait 2 second
    Then test that relevant web site's title contains compare