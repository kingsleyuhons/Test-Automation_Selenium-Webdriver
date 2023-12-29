Feature: Update Address

  Scenario:

    Given that I am logged into my account
    When I click on the my address button
    And I clicked on the update button
    And I enter the required details to be updated
    When I click on the save button
    Then my address should be saved successfully