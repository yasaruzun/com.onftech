Feature: Verify that the functions in the submenu of the Home page are visible and active

  Scenario: TC_009 Verify that clicking on facebook, twitter, linkedin and instagram icons redirects to the relevant page


    Given go to the "userUrl"
    Then wait 2 second
    Then click subscribe quick
    Then wait 1 second
    Then sayfanın en asagisina in
    Then wait 1 second
    Then click the twitter icon
    Then wait 2 second
    Then verify that twitter icon redirects to the relevant page
    Then wait 1 second
    Then navigate back
    Then wait 2 second
    And sayfanın en asagisina in
    Then wait 1 second
    Then click the linkedin icon
    Then wait 2 second
    Then verify that linkedin icon redirects to the relevant page
    Then wait 1 second
    Then navigate back
    And sayfanın en asagisina in
    Then wait 2 second
    And sayfanın en asagisina in
    Then wait 1 second
    Then click the instagram icon
    Then wait 2 second
    Then verify that instagram icon redirects to the relevant page
    Then wait 1 second
    Then navigate back
    Then wait 2 second
    And sayfanın en asagisina in
    Then wait 1 second
    Then click the facebook icon
    Then wait 2 second
    Then verify that facebook icon redirects to the relevant page



    # son step bug