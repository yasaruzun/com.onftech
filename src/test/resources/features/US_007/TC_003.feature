Feature: US_007 :As a user, I want to be able to register on the site in order to benefit from the functions of the site
  @wip
  Scenario: TC_003 It must be verified that the Last Name Text Box is registered with a name of at least 2 letters

    Given go to the "useUrl"
    And click register button on the top right
    And click on last name and enter a single letter
    And click the Sign Up button at the bottom of the page
    And verify that the warning "The lastname field minimum 2 chareacter." is seen
