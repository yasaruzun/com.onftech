

  Feature: US 016 Reviewing the Purchase History page as a user

    Background:
      Given User goes to "Url"

    Scenario: TC_003 The Purchase History Link leads to the Order Summary

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar Purchase History link.click
      And Order Summary is displayed
      And logout link is click
      And closes the page


    Scenario: TC_003 The Purchase History Link leads to the Order Summary


      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar Purchase History link.click
      And Order Bill is enable
      And logout link is click
      And closes the page








