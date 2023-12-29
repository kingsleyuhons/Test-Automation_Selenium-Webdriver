@ignore
Feature: Login functionality

  Scenario: Wrong username with correct password should return the correct error message

    Given I get on the landing page
    When I press the sign in button
    And I enter a wrong username
    And I enter correct password
    When I click the button to log in
    Then I should the right error message