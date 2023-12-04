package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.InventoryPage;

public class InventoryPageStepDefination {

	InventoryPage inventoryPage = new InventoryPage();

	@Then("Verify user is logged in")
	public void verify_user_is_logged_in() {
		inventoryPage.verifyUserIsOnInventoryPage();
	}
	
	@And("Navigate to the Cart Page")
	public void navigate_to_the_Cart_Page() {
		inventoryPage.clickOnCartIcon();
	}
	
}
