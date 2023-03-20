Feature: US_010 As a user, I would like to have a cart page where I can send the products I intend to buy while shopping and then do my shopping.

  Scenario: TC_005 When the Proceed to checkout button is clicked, it should be verified that it redirects to the relevant page.

    Given go to the "useUrl"
    And click login button
    And enter email address and password information then click the sign in button
    And add to cart by hovering over a product selected on the
    And click on View Cart on the incoming screen
    And click on the Proceed To Checkout button and verified that redirect to the relevant page

