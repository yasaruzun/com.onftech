Feature: US_010 As a user, I would like to have a cart page where I can send the products I intend to buy while shopping and then do my shopping.

  Scenario: TC_006 When the Continue Shopping button is pressed, it should be verified that it redirects to the homepage.

    Given go to the "useUrl"
    And click login button
    And enter email address and password information then click the sign in button
    And add to cart by hovering over a product selected on the
    And click on View Cart on the incoming screen
    And click to Continue Shopping button and verify that redirect to the home page
