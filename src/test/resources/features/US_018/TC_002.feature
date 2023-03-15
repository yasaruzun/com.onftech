

  Feature: US 018 As a user, I would like to have a special dashboard page on the site to control my operations and settings on the site.

    Background:
      Given User goes to "Url"

    Scenario: TC_002_01  On the Order Details page, it should be verified reveal information is displayed.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  Order detail button click
      And Package Price is displayed
      And logout link is click
      And closes the page


    Scenario: TC_002_02  My Order page, it should be verified that it redirects to the relevant page.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  Order detail button click
      And Shipping info is displayed
      And logout link is click



    Scenario: TC_002_03 My order Page, it should be verified that it redirects to the relevant page.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  Order detail button click
      And Billing info is displayed
      And logout link is click



    Scenario: TC_002_04 My order Page, it should be verified that it redirects to the relevant page.

      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Side Bar My Order link.click
      And  Order detail button click
      And Payment Info is displayed
      And logout link is click















