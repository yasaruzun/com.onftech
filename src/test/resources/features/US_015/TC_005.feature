

  Feature: US 015 Dashboard page on the site to control my operations and settings on the site.

    Scenario: TC_005 The dashboard page Recharge Wallet button test

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And RECHARGE WALLET is display
      And RECHARGE WALLET Click
      And Recharge Amount link send keys money ADD FUND link click
      Then Stripe Link is display
      And logout link is click
      And closes the page
