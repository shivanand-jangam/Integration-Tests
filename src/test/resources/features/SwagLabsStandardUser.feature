Feature: Swag Labs Standars User scenarios
  I want to verify Swag Labs Standars User scenarios

  @MyFirstOne @SmokeTest @Regression
  Scenario Outline: Verify Swag Labs Standars User End to End flow
    Given User is on Swag Labs Login Page
    When User enteres "standard_user" details
    Then Verify user is logged in
    And Navigate to the Cart Page
    When User Delete all products from Cart
    Then Verify Cart Should be Empty

    #When User Add Product <Product> into Cart
    #Then Verify Product Add to cart button is converted into Remove cart button
    #		And Verify Cart count is diplayed as 1
    #		When User Clicked on Cart Icon
    #		Then Verify user is navigated to Cart Page
    #		And Verify Product <Product> is added into the cart
    #		And Verify Product name as <Product> and price as <Price>
    #		And Verify Remove button is displayed aginst the product
    #		When User Clicked on Checkout button
    #		Then Verify user is navigated to Checkout One page
    #		When User Enter Checkout Details
    #		And User Click on Continue button
    #		Then Verify user is navigated to Checkout Two page
    #		And Verify Product name as <Product> and price as <Price>
    #		When User Click on Finish button
    #		Then Verify confirmation message as "Thank you for your order!"
    Examples: 
      | Product                  | Price  |
      | Sauce Labs Backpack      | $29.99 |
      | Sauce Labs Fleece Jacket | $49.99 |
      | Sauce Labs Backpack      | $29.99 |
      | Sauce Labs Fleece Jacket | $49.99 |
