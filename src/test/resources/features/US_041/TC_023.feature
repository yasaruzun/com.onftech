Feature:US_041 As an administrator, I want the support ticket page to be in order to be able to handle the opened support tickets.

  Scenario:TC_023 If a browser button is created on the Update Edit page that opens when clicking the edit link
  in the select tab under the Action heading,
  it should be confirmed that the browser button can be deleted by clicking the delete icon next to the browser button.

    Given goes to "adminUrl".
    Then enters his e-mail address and password to access the site as admin.
    And clicks on the "SIGN IN" button and accesses the site as admin.
    When clicks on the "Support Ticket" title from the menu on the left side.
    Then after clicking on the "Support Ticket" title, click on the "Support Ticket" title from the menu that opens in the lower section.
    And clicks on the Edit link in the "Select" tab under the "Action" heading.
    And clicks on the "(+)" button next to the "Browser" button
    And clicks on the delete icon next to the new "Browser" button
    Then confirms that the newly opened "Browser" button is deleted after clicks the delete button.