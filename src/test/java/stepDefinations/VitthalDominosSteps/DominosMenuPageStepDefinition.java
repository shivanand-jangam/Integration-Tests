package stepDefinations.VitthalDominosSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.VitthalDominosPages.DominosMenuPage;

public class DominosMenuPageStepDefinition {

	DominosMenuPage dominosMenuPage = new DominosMenuPage();

	@Then("Verify User Navigates to menu page")
	public void verify_user_nvigates_to_menu_page() {
		dominosMenuPage.verifyUserIsOnMenuPage();
	}

	@When("User click on veg pizzas")
	public void user_click_on_veg_pizzas() {
		dominosMenuPage.clickOnVegPizzaTab();
	}

	@When("User click on Order now for {string}")
	public void user_click_on_order_now(String product) {
		dominosMenuPage.clickOnOrderNowButton(product);
	}

	@When("User enter the delivery location")
	public void user_enter_the_delivery_location() {
		dominosMenuPage.enterDelivaryAddress();
	}

	@When("Verify Cart is Empty")
	public void verify_cart_Is_empty() {
		dominosMenuPage.verifyCartIsEmpty();
	}

}
