

  Feature: US 015 Dashboard page on the site to control my operations and settings on the site.

    Background:

      Given User goes to "Url"

    Scenario: TC_002_01  The dashboard UserName control

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And UserName  are displayed
      And logout link is click
      And closes the page

    Scenario: TC_002_02   The dashboard  User Email address control

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And User email address are displayed
      And logout link is click
      And closes the page


