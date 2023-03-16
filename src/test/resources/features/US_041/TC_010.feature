Feature: US_041 As an administrator, I want the support ticket page to be in order to be able to handle the opened support tickets.

  Scenario: TC_010 It should be verified that Select One, Pending, On Going, Completed, Closed options are visible and selectable
  from Status dropdown on Support Ticket page

    Given goes to "adminUrl".
    Then enters his e-mail address and password to access the site as admin.
    And clicks on the "SIGN IN" button and accesses the site as admin.
    When clicks on the "Support Ticket" title from the menu on the left side.
    Then after clicking on the "Support Ticket" title, click on the "Support Ticket" title from the menu that opens in the lower section.
    And clicks on the "Status" dropdown option
    When tests that "Select One", "Pending", "On Going", "Completed", "Closed" are visible in the dropdown options
    Then tests that "Select One", "Pending", "On Going", "Completed", "Closed" are selectable in the dropdown options