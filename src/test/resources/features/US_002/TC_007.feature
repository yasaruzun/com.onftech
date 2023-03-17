Feature:US_002 Verify that the functions in the top menu of the home page are active

  Scenario:TC_007 It should be possible to search for products from the search box

    Given go to the "userUrl"
    Then wait 2 second
    Then click subscribe quick
    Then wait 2 second
    Then enter "wantedProduct" in search box and press the enter
    And wait 3 second
    Then test that the brandingText contains "wantedProduct"