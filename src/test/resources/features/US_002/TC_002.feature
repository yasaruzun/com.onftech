Feature:US_002 Verify that the functions in the top menu of the home page are active

  Scenario:TC_002 When going to the site,it should be verified that the title is Trendlifebuy Online Shopping

    Given go to the "userUrl"
    Then  click subscribe quick
    And   wait 1 second
    Then verify that the title is Trendlifebuy Online Shopping