

  Feature: US 015 Dashboard page on the site to control my operations and settings on the site.

    Scenario: TC_010 Dashboard page, it should be verified that it redirects to the relevant page.

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar  Support Ticket link click
      And  Support Ticket page is displayed
      And logout link is click
      And closes the page