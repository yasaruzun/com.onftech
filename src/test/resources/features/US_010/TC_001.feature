Feature: US_010 As a user, I would like to have a cart page where I can send the products I intend to buy while shopping and then do my shopping.

  Scenario: TC_001 It should be verified that the texts Shipping charge free from,Order Summary,Subtotal,Shipping Charge,Discount,VAT/TAX/GST and Total are visible.

    Given go to the "useUrl"
    And click login button
    And enter email address and password information then click the sign in button
    And add to cart by hovering over a product selected on the
    And click on View Cart on the incoming screen
    Then Verified that the texts Shipping charge free from, Order Summary, Subtotal,Shipping Charge,Discount,VAT-TAX-GST and Total are visible
