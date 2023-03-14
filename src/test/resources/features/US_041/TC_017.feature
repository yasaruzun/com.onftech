Feature:US_041 As an administrator, I want the support ticket page to be in order to be able to handle the opened support tickets.

  Scenario:TC_017 It should be confirmed that it can be sent as a reply after adding additional files to the Ticket and changing
  its status on the page that opens when clicking the show link in the select tab under the Action heading

    Given goes to "adminUrl".
    Then enters his e-mail address and password to access the site as admin.
    And clicks on the "SIGN IN" button and accesses the site as admin.
    When clicks on the "Support Ticket" title from the menu on the left side.
    Then after clicking on the "Support Ticket" title, click on the "Support Ticket" title from the menu that opens in the lower section.
    And clicks on the "Show" link in the "Select" tab under the "Action" heading.
    When adds an additional file by clicking the Browse button in the "ATTACH FILE" section.
    Then its status is changed in the "STATUS" section.
    And the "REPLY TICKET" button.
    When tests that the changes are saved.