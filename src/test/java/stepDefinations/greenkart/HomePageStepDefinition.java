package stepDefinations.greenkart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.greenkart.HomePage;

public class HomePageStepDefinition {

	HomePage homePage = new HomePage();

	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() {
		homePage.verifyUserIsOnTheHomePage();
	}

	@When("the user types {string} in the search bar")
	public void the_user_types_in_the_search_bar(String product) {
		homePage.searchProductInTheSearchBar(product);
	}

	@When("the user clicks on the Add to Cart button for {string}")
	public void clicks_on_the_button_for(String product) {
		homePage.clickOnAddToCartButton(product);
	}

	@When("adds {string} quantity of {string} to the cart")
	public void adds_quantity_of_to_the_cart(String quantity, String product) {
		homePage.enterQuantityForGivenProduct(product, quantity);
	}

	@Then("the user should see that {string} is added to the cart")
	public void the_user_should_see_that_is_added_to_the_cart(String product) {
		homePage.verifyProductIsAddedToTheCart(product);
	}

}
