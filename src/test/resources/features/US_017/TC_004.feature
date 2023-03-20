

  Feature: US 017 As a user, I would like to have a special dashboard page on the site to control my operations and settings on the site.

    Background:
      Given User goes to "Url"


    Scenario: TC_004_01 Number of products to be displayed on the Order page


      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  number of products Last 5 is displayed
      And logout link is click


    Scenario: TC_004_02 Number of products to be displayed on the Order page


      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  number of products Last 10 is displayed
      And logout link is click


    Scenario: TC_004_03 Number of products to be displayed on the Order page


      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  number of products Last 20 is displayed
      And logout link is click


    Scenario: TC_004_04 Number of products to be displayed on the Order page


      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  number of products Last 40 is displayed
      And logout link is click






















