package stepDefinations;

import io.cucumber.java.en.Then;
import pages.InventoryPage;

public class InventoryPageStepDefination {

	InventoryPage inventoryPage = new InventoryPage();

	@Then("Verify user is logged in")
	public void verify_user_is_logged_in() {
		inventoryPage.verifyUserIsOnInventoryPage();
	}
}
