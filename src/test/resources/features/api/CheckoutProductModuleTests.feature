Feature: GreenKart Application checkout product scenarios
  I want to verify checkout product scenarios

@SmokeTest @Regression
  Scenario Outline: Verify user is able to checkout the given product
    Given User is on Greenkart page
    When User add "Beetroot" product in the cart
    And User click on Add To Cart button 
    Then Verify Items value showing as "1"
    When User Delete all products from Cart
    Then Verify Cart Should be Empty
    Then Verify Price displayed correctly
    When User click on Cart Icon
    Then Verify Cart Popup shows valid product details