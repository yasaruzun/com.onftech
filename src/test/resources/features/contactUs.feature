Feature:Contact Us


@yasar
  Scenario: TC_01 Contact US page should be accessible and when the necessary information is entered ,
                  The message should be sent

    Given Launch browser and Navigate to the "url"
    Then  click to the Contact Us icon
    And   Verify that Contact Us page is visible successfully
    Then  verify that user is in the contact us page
    And   type the required information to send a message
    Then  click to the send message button
    Then  verify that the message is sent

