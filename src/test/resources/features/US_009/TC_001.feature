Feature: US_009 :As a user, I would like to have a page where I can compare similar products on the site.
  @wip
  Scenario: TC_001:It should be verified that the products that users put on the Compare page while shopping are displayed side by side with their pictures and content information.

    Given go to the "useUrl"
    And click login button
    And enter email address and password information then click the sign in button
    And select the products on the homepage and click on it
    And Verifies that images and content information of products added to the compare page are displayed side by side

