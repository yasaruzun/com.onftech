Feature: US_041 As an administrator, I want the support ticket page to be in order to be able to handle the opened support tickets.

  Scenario:TC_021 It should be confirmed that the file can be added with the Browser button on the Update Edit page that
  opens when clicking the edit link in the select tab under the Action title.

    Given goes to "adminUrl".
    Then enters his e-mail address and password to access the site as admin.
    And clicks on the "SIGN IN" button and accesses the site as admin.
    When clicks on the "Support Ticket" title from the menu on the left side.
    Then after clicking on the "Support Ticket" title, click on the "Support Ticket" title from the menu that opens in the lower section.
    And clicks on the Edit link in the "Select" tab under the "Action" heading.
    Then clicks the "Browser" button next to the "Attach File" title on the "Update Ticket" page  and selects a file
    When tests that a new file has been added.