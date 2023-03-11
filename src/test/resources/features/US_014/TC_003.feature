
  Feature: US014 user tests on Trendlifebuy.com

    Scenario: TC003 About us page review is display

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      Then User goes to About us page
      And Client Worldwide board get text is displayed
      And closes the page

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      Then User goes to About us page
      And  Successful Project board get text is displayed
      And closes the page

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      Then User goes to About us page
      And  Work Employed board get text is displayed
      And closes the page

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      Then User goes to About us page
      And  Planning Services board get text is displayed
      And closes the page


