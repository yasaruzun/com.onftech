

  Feature: US 015 Dashboard page on the site to control my operations and settings on the site.

    Scenario: TC_008 Recent Order See All button

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And  Recent Order link is displayed
      And Recent Order SEE ALL link click
      And Recent Order page is displayed
      And logout link is click

