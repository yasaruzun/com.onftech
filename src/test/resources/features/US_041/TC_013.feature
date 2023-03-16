Feature: US_041 As an administrator, I want the support ticket page to be in order to be able to handle the opened support tickets.

  Scenario: TC_013 In Ticket List, under Agent Assign, if there is no account to which the opened ticket is assigned,
  unassigned text should be displayed, if it is assigned,
  it should be verified that the account information to which it is assigned is displayed.

    Given goes to "adminUrl".
    Then enters his e-mail address and password to access the site as admin.
    And clicks on the "SIGN IN" button and accesses the site as admin.
    When clicks on the "Support Ticket" title from the menu on the left side.
    Then after clicking on the "Support Ticket" title, click on the "Support Ticket" title from the menu that opens in the lower section.
    And tests that the account information is visible if there is an account assigned from the tickets opened under "Agent Assign".
    When tests that the "unassigned" text is visible if an account is not specified in the tickets opened under "Agent Assign".