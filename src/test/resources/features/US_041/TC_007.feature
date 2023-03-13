Feature: US_041 As an administrator, I want the support ticket page to be in order to be able to handle the opened support tickets.

  Scenario: TC_007 Verify that the options in the Category dropbox are visible and selectable on the Support Ticket page

    Given goes to "adminUrl".
    Then enters his e-mail address and password to access the site as admin.
    And clicks on the "SIGN IN" button and accesses the site as admin.
    When clicks on the "Support Ticket" title from the menu on the left side.
    Then after clicking on the "Support Ticket" title, click on the "Support Ticket" title from the menu that opens in the lower section.
    And clicks on the "Category" dropbox option
    When tests that the dropbox options are visible
    Then tests that the dropbox options are selectable
