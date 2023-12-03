package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import base.DriverManager;

public class InventoryPage{

	public InventoryPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	@FindBy(xpath = "//span[text()='Products']")
	private WebElement inventoryPageTitle;

	public void verifyUserIsOnInventoryPage() {
		Assert.assertTrue(inventoryPageTitle.isDisplayed(),
				"User is not navigated to Inventory Page. Please check the Login URL");
	}

}
