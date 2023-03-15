

  Feature: US 018 As a user, I would like to have a special dashboard page on the site to control my operations and settings on the site.

    Background:
      Given User goes to "Url"

    Scenario: TC_006 Dashboard page, it should be confirmed that the entered order is canceled when a selection is made from the Reason dropbox and the send button is clicked


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
      And Select  reason and send link click
      And order is canceled is displayed
      And logout link is click






















