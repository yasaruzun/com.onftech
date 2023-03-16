

  Feature: US 016 Reviewing the Purchase History page as a user
    Background:
      Given User goes to "Url"

    Scenario: TC_002_01 The Purchase History Link leads to the Purchase History page

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar Purchase History link.click
      And All history links enabled
      And logout link is click
      And closes the page


    Scenario: TC_002_02 The Purchase History Link leads to the Purchase History page

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar Purchase History link.click
      And Pending Order links enabled
      And logout link is click
      And closes the page

    Scenario: TC_002_03 The Purchase History Link leads to the Purchase History page

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar Purchase History link.click
      And Confirmed Order links enabled
      And logout link is click
      And closes the page

    Scenario: TC_002_04  The Purchase History Link leads to the Purchase History page

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar Purchase History link.click
      And Completed Order links enabled
      And logout link is click
      And closes the page

    Scenario: TC_002_05    The Purchase History Link leads to the Purchase History page

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar Purchase History link.click
      And Refused cancelled order links enabled
      And logout link is click






