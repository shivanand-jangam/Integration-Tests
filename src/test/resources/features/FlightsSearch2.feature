Feature: Search Flights Feature
  I want to verify search Flights Feature

  Scenario: Verify Flights Search results are showing correctly
    Given Navigate to Agoda Website
    Then Verify User is Navigated to the Agoda Official Site
    When User Click on Flights Link
    And User Selects One-way as trip type
    Then User Enter Fying From as "Pune"
    And User Enter Fying To as "Mumbai"
    And User Selects the Departure Date as next day
    And Click on Search Fligh button
    Then Verify user is navigated to Agoda Flights search results Page
    When Verify 23 flights shown in the results

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
