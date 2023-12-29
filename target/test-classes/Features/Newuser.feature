Feature: Create User

  Scenario: Create new user

    Given I get on the home screen
    When I get on the login screen
    And I enter email address for new account
    And I click the create account button
    When I enter all required details
    And I click the register button
    Then My account should be successfully created