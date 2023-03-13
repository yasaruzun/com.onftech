

  Feature: US 015 Dashboard page on the site to control my operations and settings on the site.

    Scenario: TC_004 Verify that the Total Balance amount

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Total Balance boards  is displayed
      And logout link is click
      And closes the page
