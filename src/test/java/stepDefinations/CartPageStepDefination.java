package stepDefinations;

import io.cucumber.java.en.And;
import pages.CartPage;

public class CartPageStepDefination {

	CartPage cartPage = new CartPage();

	@And("User Delete all products from Cart")
	public void user_delete_all_products_from_cart() {
		cartPage.deleteAllProductFromCart();
	}

	@And("Verify Cart Should be Empty")
	public void verify_cart_should_be_empty() {
		cartPage.verifyCartIsEmpty();
	}

}
