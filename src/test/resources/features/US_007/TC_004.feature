Feature: US_007 :As a user, I want to be able to register on the site in order to benefit from the functions of the site
  @wip
  Scenario: TC_004 It should be verified that it is possible to register with the e-mail address entered in accordance with the criterias.

    Given go to the "useUrl"
    And click register button on the top right
    And click on email and Enter an email address without the @ sign and verify that the warning "the email must be a valid email adress" is displayed
    And enter a valid email adress and verify that no warnings has been displayed
    