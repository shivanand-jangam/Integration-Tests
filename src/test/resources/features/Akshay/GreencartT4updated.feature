Feature: Multiple Product Flow

  @SmokeTest @Regression @GKart
  Scenario Outline: Verify User able to add multiple product in the cart
    Given the user is on the homepage
    When User adds '<Products>' with quanity of '<Quanity>' product in the cart
    #Then Verify products '<Products>' are added into the cart
    
    
    Examples: 
      | Products                  | Quanity |
      | Beetroot, beans, tomato   |   1,2,3 |


