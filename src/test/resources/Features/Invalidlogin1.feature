@ignore
Feature: Login functionality

  Scenario: Login with invalid credentials should return an error message

    Given that I am on the landing page
    When I select the sign link
    And I enter a correct username
    And I enter incorrect password
    When I click the login button
    Then I should the correct error message