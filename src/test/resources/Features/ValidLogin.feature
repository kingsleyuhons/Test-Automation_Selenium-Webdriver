Feature: Login functionality

  Background:
    Given I am on the app homepage
    And I click the signin

  Scenario: Users should be able to login with valid credentials

    And I enter a valid username
    And I enter a valid password
    When I click the log in button
    Then I should be signed in successfully