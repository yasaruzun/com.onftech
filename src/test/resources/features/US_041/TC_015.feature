Feature:US_041 As an administrator, I want the support ticket page to be in order to be able to handle the opened support tickets.

  Scenario:TC_015 It should be verified that there are Show, Edit, Delete links in the Action /select tab

    Given goes to "adminUrl".
    Then enters his e-mail address and password to access the site as admin.
    And clicks on the "SIGN IN" button and accesses the site as admin.
    When clicks on the "Support Ticket" title from the menu on the left side.
    Then after clicking on the "Support Ticket" title, click on the "Support Ticket" title from the menu that opens in the lower section.
    And clicks on the "Select" tab under the "Action" heading.
    When clicking on the "Select" tab, tests that the "Show", "Edit", "Delete" links are visible.
