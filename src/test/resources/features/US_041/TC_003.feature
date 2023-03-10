Feature: US_041 As an administrator, I want the support ticket page to be in order to be able to handle the opened support tickets.

  Scenario: TC_003 It should be confirmed that Subject, User List, Assign to, Description, Category List, Priority, Status,
  Attach File information is requested to be entered on a new ticket opening page.

    Given goes to "adminUrl".
    Then enters his e-mail address and password to access the site as admin.
    And clicks on the "SIGN IN" button and accesses the site as admin.
    When clicks on the "Support Ticket" title from the menu on the left side.
    Then after clicking on the "Support Ticket" title, click on the "Support Ticket" title from the menu that opens in the lower section.
    Then clicks on the "ADD NEW" button
    And tests that the user is asked to enter information under the headings Subject, User List, Assign to, Description, Category List, Priority, Status, Attach File.
