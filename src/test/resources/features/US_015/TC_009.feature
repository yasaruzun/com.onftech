

  Feature: US 015 Dashboard page on the site to control my operations and settings on the site.

    Scenario: TC_009 Product in Cart See All button

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And  Product in Cart link is displayed
      And Product in Cart SEE ALL link click
      And Product in Cart page is displayed
      And closes the page
