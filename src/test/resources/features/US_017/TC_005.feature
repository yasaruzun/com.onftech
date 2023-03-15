

  Feature: US 017 As a user, I would like to have a special dashboard page on the site to control my operations and settings on the site.

    Background:
      Given User goes to "Url"

    Scenario: TC_005_01 Dashboard page, it should be verified that it redirects to the relevant page.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  Prev link is enabled
      And logout link is click
      And closes the page

    Scenario: TC_005_02 Dashboard page, it should be verified that it redirects to the relevant page.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  Next link is enabled
      And logout link is click
      And closes the page





















