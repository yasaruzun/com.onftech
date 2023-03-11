

  Feature: US 015 Dashboard page on the site to control my operations and settings on the site.

    Scenario: TC_002 The dashboard UserName and User Email address

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And UserName  are displayed
      And closes the page

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      Then "3" seconds wait
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And User email address are displayed
      And closes the page
