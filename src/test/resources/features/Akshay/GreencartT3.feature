Feature: product flow

  @MyFirstOne @SmokeTest @Regression
  Scenario Outline: Verify end to end product flow for product purchase
    Given User is on Greenkart Home page
    When User click on add to cart button for "Beetroot"
    Then Verify user is able to see product is added in the Cart
    And Verify Cart amount is displayed "32"
    When User Click on Proceed to checkout
    Then Verify user should navigate to Cart page
    And Verify Product image is not broken
    And Verify product name as "Beetroot"
    And Veify product quanity is diaplayed as "1"
    And Veify product price is displayed as "32"
    And verify Total After Discount is displayed as "32"
    When User click on Place order button
    Then User should navigated to country selection page
    When User select Country as "India"
    And User click on Agree to the Terms and Conditions Checkbox
    And User click on Proceed button
    Then Verify message is displayed as "Thank you, your order has been placed successfully"
    Examples: 
      | item     | Price |
      | Brocolli |   120 |
