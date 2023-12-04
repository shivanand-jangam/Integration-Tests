package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.CommonSeleniumActions;
import base.DriverManager;

public class CartPage extends CommonSeleniumActions {

	public CartPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	private String cartItemList = "//div[@class='cart_item']";

	@FindBy(xpath = "//button[text()='Remove']")
	private List<WebElement> removeButton;

	@FindBy(xpath = "//span[text()='Your Cart']")
	private WebElement cartPageTitle;

	public void verifyUserIsOnCartPage() {
		waitforTime(1);
		Assert.assertTrue(cartPageTitle.isDisplayed(),
				"User is not navigated to Cart Page. Please check the URL");
	}

	public void deleteAllProductFromCart() {
		if (removeButton.size() > 0) {
			for (WebElement element : removeButton) {
				clickOnElement(element);
			}
		}
	}

	public void verifyCartIsEmpty() {
		waitforTime(1);
		Assert.assertFalse(isElementDisplayed(cartItemList),
				"Cart is not Empty. Please check");
		waitforTime(1);
	}

}
