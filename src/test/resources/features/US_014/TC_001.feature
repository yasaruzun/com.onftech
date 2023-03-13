
  Feature: US014 user tests on Trendlifebuy.com

    Scenario: TC001 About us page is display

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      Then User goes to About us page
      And About us page is display
      And closes the page
