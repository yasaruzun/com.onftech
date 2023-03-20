Feature: US_010 As a user, I would like to have a cart page where I can send the products I intend to buy while shopping and then do my shopping.

  Scenario: TC_003 It should be verified that the Total fee changes according to the number of pieces in the Quantity section.


    Given go to the "useUrl"
    And click login button
    And enter email address and password information then click the sign in button
    And add to cart by hovering over a product selected on the
    And click on View Cart on the incoming screen
    And the desired number of products can be increased or decreased by clicking on +, - in the quantity section
    And verified that the product price changes when the number of products in the quantity section changes