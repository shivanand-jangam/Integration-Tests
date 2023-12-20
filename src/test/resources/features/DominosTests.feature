@Regression
Feature: verify product add to cart dominoes feature
  I want to use this template for my feature file

  @AddTOCartTestSuite
  Scenario: Verify Add product to Cart scenario
    Given User is on Dominos Home page
    And User click on OUR MENU
    Then Verify User Navigates to menu page
    When User click on veg pizzas
    Then User click on Order now for "Margherita"
    Then User enter the delivery location
    Then Verify Cart is Empty
    #When User click on add to cart button for "Margherita"
    #And Click NO THANKS on Make my pizza more yummy popup
    #Then Verify Individual product total as "239.00"
    #When User navigated to the Beverages menu
    #Then verify user is on Beverages page
    #When User click on add to cart button for "Pepsi 475ml"
    #Then Verify Individual product total as "60.00"
    #Then Verify Sub Total Value in Menu page as "299.00"

  Scenario Outline: Veriy 12 types of menu is displayed and its clickable
    Given User Navigate to "www.dominos.co.in"
    When User is on home menu page
    Then Verify that menu tabs should be "12"
    When User click on <TabName> menu
    Then Verify user navigate to <TabName> menu

    Examples: 
      | TabName              |
      | veg pizzas           |
      | non veg pizzas       |
      | Side Orders          |
      | Beverages            |
      | Choice Of Crusts     |
      | Choice Of Toppings   |
      | Pasta                |
      | Pizza Mania          |
      | Burger Pizza         |
      | chicken wings        |
      | Chicken Lovers Pizza |
      | PARATHA PIZZA        |

  @tag1
  Scenario Outline: Verify end to end flow of order online flow of dominoes
    Given User is on Dominos Home page
    And User click on "OUR MENU"
    Then User Nvigates to menu page
    When User click on "Tab Name"
    Then User click on "order now" for "margherita"
    Then User enter the delivery location
    And User click on "Allow" for popup
    Then Verify Cart is Empty
    When User click on add to cart button for "Margherita"
    And Click NO THANKS on Make my pizza more yummy popup
    Then Verify Individual product total as "239.00"
    When User navigated to the Beverages menu
    Then verify user is on Beverages page
    When User click on add to cart button for "Pepsi 475ml"
    Then Verify Individual product total as "60.00"
    Then Verify Sub Total Value in Menu page as "299.00"
    When User click on "place order button"
    Then User navigates to fill address details window
    And User enter mendetary field details as below
      | First Name    | vitthal                    |
      | Last Name     | patil                      |
      | mobile no     |                 1234567890 |
      | Email address | itthal.pathrikar@gmail.com |
      | Address       | abc                        |
      | House No      |                        401 |
    When User click on "save and continue" button
    Then Verify user is navigates to paments method page

    Examples: 
      | Tab Name             |
      | veg pizzas           |
      | non veg pizzas       |
      | Side Orders          |
      | Beverages            |
      | Choice Of Crusts     |
      | Choice Of Toppings   |
      | Pasta                |
      | Pizza Mania          |
      | Burger Pizza         |
      | chicken wings        |
      | Chicken Lovers Pizza |
      | PARATHA PIZZA        |
