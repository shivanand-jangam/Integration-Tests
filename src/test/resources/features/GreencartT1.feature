Feature: Product Count

  @MyFirstOne @SmokeTest @Regression
  Scenario: Home page: Verify and print all products details
    Given User Navigate to the Greenkart website
    Then User verify product count as 30 and print all product names and its price
    When User is on Greenkart Home page
    Then User verify product count should be 30
    And User prints the names and price of all products

  @MyFirstOne @SmokeTest @Regression
  Scenario Outline: Home page: Verify and print all products details
    Given User Navigate to the Greenkart website
    Then User verify product count as 30 and print all product names and its price
    When User is on Greenkart Home page
    Then User verify product count should be 30
    And User prints the names and price of all products

    Examples: 
      | Product  | Price |
      | Beetroot |    32 |
      | Potato   |    25 |
