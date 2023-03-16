

  Feature: US 015 Dashboard page on the site to control my operations and settings on the site.

    Background:
      Given User goes to "Url"

    Scenario: TC_003_01    Boards are visible on the Dashboard page.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Completed Order boards is displayed
      And logout link is click


    Scenario: TC_003_02   Boards are visible on the Dashboard page.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And My Wishlist boards is displayed
      And logout link is click


    Scenario: TC_003_03   Boards are visible on the Dashboard page.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Refund Success boards  is displayed
      And logout link is click


    Scenario: TC_003_04   Boards are visible on the Dashboard page.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Product in Cart  is displayed
      And logout link is click


    Scenario: TC_003_05    Boards are visible on the Dashboard page.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Coupon Used boards  is displayed
      And logout link is click


    Scenario: TC_003_06   Boards are visible on the Dashboard page.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And All Order  boards are is displayed
      And logout link is click




