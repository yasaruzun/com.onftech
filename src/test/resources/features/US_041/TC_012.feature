Feature:US_041 As an administrator, I want the support ticket page to be in order to be able to handle the opened support tickets.

  Scenario: TC_012 It should be verified that Tickets are listed under
  Subject, Category, User Name, priority, User Agent, Status, Agent Asign, Action headings in Ticket List

    Given goes to "adminUrl".
    Then enters his e-mail address and password to access the site as admin.
    And clicks on the "SIGN IN" button and accesses the site as admin.
    When clicks on the "Support Ticket" title from the menu on the left side.
    Then after clicking on the "Support Ticket" title, click on the "Support Ticket" title from the menu that opens in the lower section.
    And verifies that the tickets opened in Ticket List are listed under the headings "Subject", "Category", "User Name", "Priority", "User Agent", "Status", "Agent Asign" and "Action"