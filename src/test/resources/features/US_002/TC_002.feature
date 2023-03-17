Feature:US_002 Verify that the functions in the top menu of the home page are active

  Scenario:TC_002 Track Your Order button should lead to the relevant page

    Given go to the "userUrl"
    Then  click subscribe quick
    And   wait 3 second
    Then click the Track Your Order link
    And  wait 1 second
    Then test that the Track Now Link is visible
