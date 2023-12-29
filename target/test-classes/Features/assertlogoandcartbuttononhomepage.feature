Feature: Homepage logo and Cart

  Scenario: Verify that logo and cart button are displayed on the homepage
    Given I launch the browser
    And I enter the application url
    When I wait for 5 seconds
    Then I should see the application logo and add cart button
