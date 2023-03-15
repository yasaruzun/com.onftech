Feature: US_007 :As a user, I want to be able to register on the site in order to benefit from the functions of the site
  @wip
  Scenario: TC_002 It must be verified that the First Name Text Box is registered with a name of at least 2 letters

    Given go to the "useUrl"
    And click register button on the top right
    And click on first name and enter a single letter
    And click the Sign Up button at the bottom of the page
    And verify that the warning "The firstname field minimum 2 chareacter." is seen
    And click on first name and enter a valid first name
    And click the Sign Up button at the bottom of the page
    And verify that the warning "The firstname field minimum 2 chareacter." isn't seen
