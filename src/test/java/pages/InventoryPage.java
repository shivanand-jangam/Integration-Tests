package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.CommonSeleniumActions;
import base.DriverManager;

public class InventoryPage extends CommonSeleniumActions {

	public InventoryPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	@FindBy(xpath = "//span[text()='Products']")
	private WebElement inventoryPageTitle;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement cartLink;

	public void verifyUserIsOnInventoryPage() {
		waitforTime(2);
		Assert.assertTrue(inventoryPageTitle.isDisplayed(),
				"User is not navigated to Inventory Page. Please check the Login URL");

	}

	public void clickOnCartIcon() {
		clickOnElement(cartLink);
	}
}
