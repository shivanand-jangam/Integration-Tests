package pages.greenkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.CommonSeleniumActions;
import base.DriverManager;

public class HomePage extends CommonSeleniumActions {

	public HomePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	private static String ADD_TO_CART_BUTTON = "//h4[@class='product-name' and contains(text(),'%s')]/following-sibling::div/button";
	private static String QUANTITY_INPUT_FIELD = "//h4[@class='product-name' and contains(text(),'%s')]/following-sibling::div/input";

	@FindBy(xpath = "//div[@class='brand greenLogo']")
	private WebElement applicationLogo;

	@FindBy(xpath = "//input[@class='search-keyword']")
	private WebElement searchInputField;

	@FindBy(xpath = "//a[@class='cart-icon']")
	private WebElement cartIcon;

	@FindBy(xpath = "//div[@class='cart-preview active']/descendant::p[@class='product-name']")
	private WebElement cartProductNameText;

	public void verifyUserIsOnTheHomePage() {
		Assert.assertTrue(isElementDisplayed(applicationLogo),
				"User is not navigated to Home page. Please check the URL.");
	}

	public void searchProductInTheSearchBar(String product) {
		searchInputField.click();
		waitforTime(1);
		searchInputField.sendKeys(product);
		waitforTime(1);
	}

	public void clickOnAddToCartButton(String product) {
		DriverManager.getDriver()
				.findElement(
						By.xpath(String.format(ADD_TO_CART_BUTTON, product)))
				.click();
		waitforTime(1);
	}

	public void enterQuantityForGivenProduct(String product, String quantity) {
		waitforTime(1);
		DriverManager.getDriver()
				.findElement(
						By.xpath(String.format(QUANTITY_INPUT_FIELD, product)))
				.clear();
		waitforTime(1);
		DriverManager.getDriver()
				.findElement(
						By.xpath(String.format(QUANTITY_INPUT_FIELD, product)))
				.sendKeys(quantity);
		waitforTime(1);
	}

	public void verifyProductIsAddedToTheCart(String product) {
		cartIcon.click();
		waitforTime(1);
		Assert.assertTrue(cartProductNameText.getText().contains(product),
				"Given Product is not added to the cart");
	}

}
