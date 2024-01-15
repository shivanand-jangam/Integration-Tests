Feature: Rsestful-booker API scenarios
  As a user
  I want to test API endpoints
  So that I can verify the functionality

  @APITest1
  Scenario: Verify POST request to Create a Booking
    Given I have the API endpoint "/booking"
    When I provided the content type as "application/json"
    When I provided the body for create booking as firstname is "Shiva" and lastname is "nand"
    And I make a "POST" request
    Then the response status code should be 200
    And the verify booking id is generated

  @APITest1
  Scenario Outline: Verify POST request to Create a Booking
    Given I have the API endpoint "/booking"
    When I provided the content type as "application/json"
    When I provided the body for create booking as firstname is <FirstName> and lastname is <LastName>
    And I make a "POST" request
    Then the response status code should be 200
    And the verify booking id is generated

    Examples: 
      | FirstName | LastName |
      | Shiva     | Nand     |

  @APITest1
  Scenario: Verify POST request to Create a Booking
    Given I have the API endpoint "/booking"
    When I provided the content type as "application/json"
    When I provided the body for create booking
    And I make a "POST" request
    Then the response status code should be 200
    And the verify booking id is generated

  @APITest2
  Scenario: Verify PUT request for Booking ID
    Given I have the API endpoint "/booking/4952"
    When I provided the content type as "application/json"
    When I provided the body for update booking
    And I make a "PUT" request
    Then the response status code should be 200

  @APITest3
  Scenario: Verify GET request for Booking ID
    Given I have the API endpoint "/booking/4952"
    When I provided the content type as "application/json"
    And I make a "GET" request
    Then the response status code should be 200
