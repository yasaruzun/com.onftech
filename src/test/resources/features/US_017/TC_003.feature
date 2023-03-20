

  Feature: US 017 As a user, I would like to have a special dashboard page on the site to control my operations and settings on the site.

    Background: User goes to Url
      Given User goes to "Url"

    Scenario: TC_003_01 Dashboard page, My Order page order detail test.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  Order ID is displayed
      And logout link is click


    Scenario: TC_003_02 Dashboard page, My Order page order detail test.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And   Status is displayed
      And logout link is click



    Scenario: TC_003_03 Dashboard page, My Order page order detail test.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  Order date is displayed
      And logout link is click


    Scenario: TC_003_04 Dashboard page, My Order page order detail test.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  Order Amount is displayed
      And logout link is click


    Scenario: TC_003_05 Dashboard page, My Order page order detail test.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  Paid By is displayed
      And logout link is click












