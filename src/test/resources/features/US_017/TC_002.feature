

  Feature: US 017 As a user, I would like to have a special dashboard page on the site to control my operations and settings on the site.

    Background:

      Given User goes to "Url"

    Scenario: TC_002_01 Dashboard page, My Order page detail test.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  All link is enable
      And logout link is click


    Scenario: TC_002_02 Dashboard page, My Order page detail test.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  To Pay link is enable
      And logout link is click


    Scenario: TC_002_03 Dashboard page, My Order page detail test.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  To Ship link is enable
      And logout link is click


    Scenario: TC_002_04 Dashboard page, My Order page detail test.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And   To Receive link is enable
      And logout link is click























