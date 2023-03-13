
  Feature: US014 user tests on Trendlifebuy.com

    Scenario: TC004 About us page is display

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      Then User goes to About us page
      And  Online Shopping Easy Cost-Efficient text is displayed
      And closes the page