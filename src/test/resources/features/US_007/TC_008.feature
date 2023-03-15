Feature: US_007 :As a user, I want to be able to register on the site in order to benefit from the functions of the site
  @wip
  Scenario: TC_008 It should be verified that the Sign In link next to Already have an Account? text leads to the relevant page

    Given go to the "useUrl"
    And click register button on the top right
    And verify that the "Already have an Account? Sign In" at the bottom of the page is visible
    And click the "Sign In" link and verify that link leads to the relevant page