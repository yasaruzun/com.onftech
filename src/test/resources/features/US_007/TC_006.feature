Feature: US_007 :As a user, I want to be able to register on the site in order to benefit from the functions of the site
  @wip
  Scenario: TC_006 By signing up, you agree to Terms of Service and Privacy Policy CheckBox must be checked before it can be registered.

    Given go to the "useUrl"
    And click register button on the top right
    And click the sign up checkbox at the bottom of the page and verify the warning is displayed at right up corner on the page
    And click the checkbox related to "By signing up, you agree to Terms of Service and Privacy Policy" and click the sign up button