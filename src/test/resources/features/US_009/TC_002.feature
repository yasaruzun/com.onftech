Feature: US_009 :As a user, I would like to have a page where I can compare similar products on the site.
  @wip
  Scenario: TC_002:When the Reset Compare button is clicked, it should be verified that the products selected for comparison are deleted from the Compare page.

    Given go to the "useUrl"
    And click login button
    And enter email address and password information then click the sign in button
    And select the products on the homepage and click on it
    And click the Reset button and verified that the products selected for comparision are deleted from the Compare page
