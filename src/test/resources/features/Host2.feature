Feature: Search Hotels Feature
  I want to verify Search Hotels Feature

  Scenario: Verify Hotels Search results are showing correctly
    Given Navigate to Agoda Website
    Then Verify User is Navigated to the Agoda Official Site
    When User Click on Hotels Link

  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
