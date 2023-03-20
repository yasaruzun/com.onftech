Feature:US_005 Verify that the functions in the body of the home page are active

  Scenario: TC_001 Trending Products, Hot Categories, House Appliances, Recommendation For You ,
                Top Brand, Popular Searches, Trendlifebuy | Verify that ONLINE SHOPPING is visible


    Given go to the "userUrl"
    Then wait 2 second
    Then click subscribe quick
    Then wait 1 second
    Then verify that Trending Products is visible
    Then wait 1 second
    Then verify that Hot Categories is visible
    Then wait 1 second
    Then verify that House Appliances is visible
    Then wait 1 second
    Then verify that Recommendation For You is visible
    Then wait 1 second
    Then verify that Top Brand is visible
    Then wait 1 second
    Then verify that Popular Searches is visible
    Then wait 1 second
    Then verify that Trendlifebuy | Verify that ONLINE SHOPPING is visible
