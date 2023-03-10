

  Feature: US 015 Dashboard page on the site to control my operations and settings on the site.

    Scenario: TC_005 The dashboard page Recharge Wallet button test

      Given User goes to Url
      And Home Page is display
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Dashboard Page is displayed
      And closes the page
