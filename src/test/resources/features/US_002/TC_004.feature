Feature:US_002 Verify that the functions in the top menu of the home page are active

  Scenario:TC_004 After logging in as a user, the Wishlist button should redirect to the relevant page.

    Given go to the "userUrl"
    Then click subscribe quick
    And  wait 3 second
    Then click the login button
    Then enter the email and password
    Then click the sign in button
    And  wait 3 second
    Then click the wishlist button
    And  wait 1 second
    Then test that relevant web site's title contains wishlist