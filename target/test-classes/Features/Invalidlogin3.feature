Feature: Login Functionality

  Background:
    Given I am on the app homepage
    And I click the signin

  Scenario Outline: Invalid username or password should return a correct error message

    When I enter "<Username>"
    And I input "<Password>"
    When I click login
    Then I should get the correct "<error message>"

    Examples:
    | Username                   | Password                        | error message                  |
    | lanre_april@gmail.com      | test                            | Invalid password.              |
    | lanre_@gmail.com           | testing                         | Authentication failed.         |
    |                            |                                 | An email address required.  |