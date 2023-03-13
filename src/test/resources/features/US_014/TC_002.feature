
  Feature: US014 user tests on Trendlifebuy.com

    Scenario: TC002 Quality and Reasonable is display

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      Then User goes to About us page
      And QUALITY AND REASONABLE PRICES text is display
      And closes the page
