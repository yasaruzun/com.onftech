
  Feature:US_002 Verify that the functions in the top menu of the home page are active

    Scenario:TC_001 Play store and apple store buttons should redirect to the relevant page

      Given go to the "userUrl"
      Then  click to the Play Store link
      And   test that it should be redirected to play store page
      Then  nagigate back to the home page from play store page
      Then  wait 1 second
      And   click subscribe quick
      Then  click to the apple store link
      Then  wait 1 second
      And   test that it should be redirected to apple store page
      Then  close the page
