
  Feature: US014 user tests on Trendlifebuy.com

    Scenario: TC006 About us page review is display

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      Then User goes to About us page
      And  Robert Pattinson picture and station is displayed
      And closes the page

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      Then User goes to About us page
      And  Johnny Depp picture and station is displayed
      And closes the page

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      Then User goes to About us page
      And  Jason Statham picture and station is displayed
      And closes the page

      Given User goes to "Url"
      Then  Home Page is display "trendlifebuy"
      Then User goes to About us page
      And  Bradley Cooper picture and station is displayed
      And closes the page