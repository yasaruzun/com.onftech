

  Feature: US 016 Reviewing the Purchase History page as a user

    Scenario: TC_001 The Purchase History Link leads to the Purchase History page

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar Purchase History link.click
      And Purchase History page is displayed
      And logout link is click
      And closes the page








