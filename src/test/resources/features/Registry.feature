@test
Feature: Registry

  @registry
  Scenario: Verify user can edit and search criteria after user find and edit the criteria in registry page
    Given Users access to the amazon web
    And Users goes to the registry page
    When User search registrant name "John"
    And User select type is "Birthday Gift List"
    And User edit criteria with date range "January" 2021 to "April" 2021
    Then User verify date time accordance to that times