
  Feature: US014 user tests on Trendlifebuy.com

    Background:
      Given User goes to "Url"

     Scenario: TC_003_01    About us page review is display

      Then  Home Page is display "trendlifebuy"
      Then User goes to About us page
      And Client Worldwide board get text is displayed
      And closes the page

    Scenario: TC_003_02    About us page review is display

      Then  Home Page is display "trendlifebuy"
      Then User goes to About us page
      And  Successful Project board get text is displayed


    Scenario: TC_003_03   About us page review is display

      Then  Home Page is display "trendlifebuy"
      Then User goes to About us page
      And  Work Employed board get text is displayed


    Scenario: TC_003_04 About us page review is display

      Then  Home Page is display "trendlifebuy"
      Then User goes to About us page
      And  Planning Services board get text is displayed



