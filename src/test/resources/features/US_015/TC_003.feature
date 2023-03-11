

  Feature: US 015 Dashboard page on the site to control my operations and settings on the site.

    Scenario: TC_003 Boards are visible on the Dashboard page.

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And All Order  boards are is displayed
      And closes the page

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And My Wishlist boards is displayed
      And closes the page

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Refund Success boards  is displayed
      And closes the page

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Product in Cart  is displayed
      And closes the page


      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Coupon Used boards  is displayed
      And closes the page

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Completed Order boards is displayed
      And closes the page


