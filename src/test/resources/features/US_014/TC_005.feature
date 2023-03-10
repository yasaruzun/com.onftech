
  Feature: US014 user tests on Trendlifebuy.com

    Scenario: TC005 About us page Team Member is display

      Given User goes to Url
      And Home Page is display
      Then User goes to About us page
      And  Team Member text is displayed
      And closes the page