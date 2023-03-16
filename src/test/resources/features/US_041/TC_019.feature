Feature:US_041 As an administrator, I want the support ticket page to be in order to be able to handle the opened support tickets.

  Scenario:TC_019 On the Update Edit page that opens when clicking the edit link in the select tab under the Action heading,
  it should be confirmed that a new priority has been saved with the Add New link next to Priority.

    Given goes to "adminUrl".
    Then enters his e-mail address and password to access the site as admin.
    And clicks on the "SIGN IN" button and accesses the site as admin.
    When clicks on the "Support Ticket" title from the menu on the left side.
    Then after clicking on the "Support Ticket" title, click on the "Support Ticket" title from the menu that opens in the lower section.
    And clicks on the Edit link in the "Select" tab under the "Action" heading.
    When "Update Ticket" page, the user clicks on the "Add New" link next to the Priority title
    Then Click on the "Add New" link, enter the name Priority in the "Name" box and then click on the "save" button
    And tests that a new Priority has been added.