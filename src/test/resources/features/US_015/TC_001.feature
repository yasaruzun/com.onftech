

  Feature: US 015 Dashboard page on the site to control my operations and settings on the site.

    Scenario: TC_001 The dashboard page is tested to appear

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Dashboard Page is displayed
      And closes the page
