Feature:US_041 As an administrator, I want the support ticket page to be in order to be able to handle the opened support tickets.

  Scenario: TC_011 It should be verified that Ticket List is created according to the
  filtering made from Category, Priority and Status tabs

    Given goes to "adminUrl".
    Then enters his e-mail address and password to access the site as admin.
    And clicks on the "SIGN IN" button and accesses the site as admin.
    When clicks on the "Support Ticket" title from the menu on the left side.
    Then after clicking on the "Support Ticket" title, click on the "Support Ticket" title from the menu that opens in the lower section.
    And filters from "Category", "Priority", "Status" dropdown options.
    When clicks on the Search button
    Then tests that a Ticket List is created according to the filtering he-she has selected