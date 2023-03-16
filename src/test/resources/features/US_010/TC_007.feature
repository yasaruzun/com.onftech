Feature: US_010 As a user, I would like to have a cart page where I can send the products I intend to buy while shopping and then do my shopping.

  Scenario: TC_007  When the delete icon in the Remove section is clicked, it should be verified that the product in the basket has been deleted and the total price has changed.

    Given go to the "useUrl"
    And click login button
    And enter email address and password information then click the sign in button
    And add to cart by hovering over a product selected on the
    And click on View Cart on the incoming screen
    And click the delete icon in the remove section and verify that the product in the cart has been deleted
