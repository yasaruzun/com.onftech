Feature: US_007 :As a user, I want to be able to register on the site in order to benefit from the functions of the site
  @wip
  Scenario: TC_007 When the information that meets the criteria is entered, the registration process should be verified when the Sign Up button is clicked.

    Given go to the "useUrl"
    And click register button on the top right
    And enter the required information according to the criteria and click the signup button
    And verifies that the record information is navigated to the appropriate dashboard
