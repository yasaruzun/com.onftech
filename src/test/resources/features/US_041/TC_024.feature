Feature:US_041 As an administrator, I want the support ticket page to be in order to be able to handle the opened support tickets.

  Scenario:TC_024 It should be confirmed that the information can be edited with the Update button after entering the
  current information on the Update Edit page that opens when clicking the edit link in the select tab under the Action title.

    Given goes to "adminUrl".
    Then enters his e-mail address and password to access the site as admin.
    And clicks on the "SIGN IN" button and accesses the site as admin.
    When clicks on the "Support Ticket" title from the menu on the left side.
    Then after clicking on the "Support Ticket" title, click on the "Support Ticket" title from the menu that opens in the lower section.
    And clicks on the Edit link in the "Select" tab under the "Action" heading.
    When enters all the information on the edit page to update.
    Then click on "Update Ticket" button.
    And tests that the information is updated.