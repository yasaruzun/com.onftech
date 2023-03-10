

  Feature: US 015 Dashboard page on the site to control my operations and settings on the site.

    Scenario: TC_006 Purchase History board See All button

      Given User goes to Url
      And Home Page is display
      And Login link is click
      Then Writes "Username" in the user box
      Then Writes "Password" in the password box
      And  Sign in link is click
      And Dashboard link click
      And Purchase History link is displayed
      And Purchase SEE ALL link click
      And  Purchase History page is displayed
      And closes the page
