Feature:US_003 Verify that all categories under the All Categories menu are visible and active

  Scenario:TC_001 Verify that the categories Computer & Accessories, Electronics Devices, Watches & Accessories, Fashions,
                  Toys,Kids&Babies, Bag&Shoes, Lifestyle&Home, TV & Home Appliances, Auto Mobiles & bikes are visible


    Given go to the "userUrl"
    Then wait 2 second
    Then click subscribe quick
    Then wait 1 second
    Then click the all Categories
    Then wait 1 second
    And  test that all categories are viisible