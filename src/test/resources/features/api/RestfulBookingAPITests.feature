Feature: Rsestful-booker API scenarios
  As a user
  I want to test API endpoints
  So that I can verify the functionality

  @Akshay1
  Scenario Outline: Verify POST request to Create a Booking
    Given I have the API endpoint "/booking"
    When I provided the content type as "application/json"
    When I provided the body for create booking as firstname is "<FirstName>" and lastname is "<LastName>"
    And I make a "POST" request
    Then the response status code should be 200
    And the verify booking id is generated
    And Verify Firstname as "<FirstName>" after booking created

    Examples: 
      | FirstName | LastName |
      | Shiva     | N        |
      | Akshay    | N        |
      | Vitthal   | P        |

  @Akshay2
  Scenario Outline: Verify totalprice of POST request to Create a Booking
    Given I have the API endpoint "/booking"
    When I provided the content type as "application/json"
    When I provided the body for create booking as firstname is "<FirstName>" and lastname is "<LastName>" and Total Price as "<Totalprice>"
    And I make a "POST" request
    Then the response status code should be 200
    And the verify booking id is generated
    And Verify Firstname as "<FirstName>" after booking created
    And Verify Totalprice as "<Totalprice>"

    Examples: 
      | FirstName | LastName | Totalprice |
      | Shiva     | N        |       1001 |

  @Akshay3
  Scenario Outline: Verify totalprice of POST request to Create a Booking
    Given I have the API endpoint "/booking"
    When I provided the content type as "application/json"
    When I provided the body for create booking as firstname is "<FirstName>" and lastname is "<LastName>" and Additionalneeds as "<Additionalneeds>"
    And I make a "POST" request
    Then the response status code should be 200
    And the verify booking id is generated
    And Verify Firstname as "<FirstName>" after booking created
    And Verify Additionalneeds as "<Additionalneeds>"

    Examples: 
      | FirstName | LastName | Additionalneeds |
      | Shiva     | N        | Lunch       |

  @Vitthal1
  Scenario Outline: Verify GET request for Created Booking
    Given I have the API endpoint "/booking/1"
    When I provided the content type as "application/json"
    And I make a "GET" request
    Then the response status code should be 200
    And Verify Firstname as "<FirstName>" for created booking

    Examples: 
      | FirstName | LastName |
      | Jim       | Wilson   |

  @Vitthal2
  Scenario Outline: Verify GET request for Created Booking
    Given I have the API endpoint "/booking/2735"
    When I provided the content type as "application/json"
    And I make a "GET" request
    Then the response status code should be 200
    And Verify Firstname as "<FirstName>" for created booking
    And Verify Totalprice as "<Totalprice>"

    Examples: 
      | FirstName | LastName | Totalprice |
      | Josh      | Allen    |        111 |

  @Vitthal3
  Scenario Outline: Verify GET request for Created Booking
    Given I have the API endpoint "/booking/2735"
    When I provided the content type as "application/json"
    And I make a "GET" request
    Then the response status code should be 200
    And Verify Firstname as "<FirstName>" for created booking
    And Verify Additionalneeds as "<Additionalneeds>"

    Examples: 
      | FirstName | LastName | Additionalneeds |
      | Josh      | Allen    | Breakfast       |

  @APITest1
  Scenario: Verify POST request to Create a Booking
    Given I have the API endpoint "/booking"
    When I provided the content type as "application/json"
    When I provided the body for create booking as firstname is "Shiva" and lastname is "nand"
    And I make a "POST" request
    Then the response status code should be 200
    And the verify booking id is generated

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
