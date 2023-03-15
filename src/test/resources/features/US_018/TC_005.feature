

  Feature: US 018 As a user, I would like to have a special dashboard page on the site to control my operations and settings on the site.

    Background:
      Given User goes to "Url"

    Scenario: TC_005 Dashboard page, Verify that the Cancel Order button on the My Order page is visible and redirects to the Select cancel reason window.


      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  Order detail button click
      And Cancel Order is dislayed
      And Cancel Order button is click
      And Select cancel reason window is displayed
      And logout link is click






















