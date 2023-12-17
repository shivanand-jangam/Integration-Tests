Feature: Shopping and Checkout

  @MyFirstOne @SmokeTest @Regression
  Scenario: Verify search functionality add to cart and verify cart
    Given the user is on the homepage
    When the user types "Tomato" in the search bar
    And the user clicks on the Add to Cart button for "Tomato"
    And adds "1" quantity of "Tomato" to the cart
    Then the user should see that "Tomato" is added to the cart
    And the user proceeds to checkout button
    Then Verify user should navigate to Cart page
    #And Verify item image is not broken
    And Verify Product Name as "Tomato"
    And Verify item quanity is displayed as "1"
    And Verify Subtotal item price is displayed as "16"
    #And verify Total Amount is displayed as "16"
    #When User click on Place order button
    #Then User should navigated to country selection page
    #When User select Country as "India"
    #And User click on Agree to the Terms and Conditions Checkbox
    #And User click on Proceed button
    #Then Verify message is displayed as "Thank you, your order has been placed successfully"
    
  Scenario Outline: Verify search functionality for multiple products and verify cart
    When the user types "Beans" in the search bar
    And selects the product "Beans" from the search results
    And clicks on the "Add to Cart" button for "Beans"
    And adds 1 quantity of "Beans" to the cart
    Then the user should see that "Beans" is added to the cart
    And verifies the subtotal of the product with a quantity
    Then User is navigate to Home page
    When the user types "Brinjal" in the search bar
    And selects the product "Brinjal" from the search results
    And clicks on the "Add to Cart" button for "Brinjal"
    And adds 1 quantity of "Brinjal" to the cart
    Then the user should see that "Brinjal" is added to the cart
    And verifies the subtotal of the product with a quantity
    And the user proceeds to checkout button
    And views the shopping cart
    Then Verify user should navigate to Cart page
    And Verify item image is not broken
    And Verify item name as "Beans"
    And Verify item quanity is displayed as "1"
    And Verify Subtotal item price is displayed as "82"
    And verify Total Amount is displayed as "82"
    And Verify item image is not broken
    And Verify item name as "Beans"
    And Verify item quanity is displayed as "1"
    And Verify Subtotal item price is displayed as "35"
    And verify Total Amount is displayed as "35"
    When User click on Place order button
    Then User should navigated to country selection page
    When User select Country as "India"
    And User click on Agree to the Terms and Conditions Checkbox
    And User click on Proceed button
    Then Verify message is displayed as "Thank you, your order has been placed successfully"
    Examples: 
      | item     | Price |
      | Brocolli |   120 |
