Feature: US_007 :As a user, I want to be able to register on the site in order to benefit from the functions of the site
  @wip
  Scenario: TC_005 It should be verified that it is possible to register with a password that meets the specified criterias.

    Given go to the "useUrl"
    And click register button on the top right
    And enter an any 8-character password ın the password sectıon and confırm password sectıon and verıfy that the warnıng ıs dısplayed
    And enter a password in the password and confirm password section according to minimum of 8 characters and a combination of uppercase letters, lowercase letters, numbers, or symbols specifications
