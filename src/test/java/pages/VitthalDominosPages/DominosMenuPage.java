package pages.VitthalDominosPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.CommonSeleniumActions;
import base.DriverManager;

public class DominosMenuPage extends CommonSeleniumActions {

	public DominosMenuPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	private static String ORDER_NOW_BUTTON = "//a[text()='%s']/parent::h3/following-sibling::a";

	@FindBy(xpath = "//a[@title=\"Domino's\" and @class='hidden-xs']")
	private WebElement menuPageLogo;

	@FindBy(xpath = "//a[@title='veg pizzas']")
	private WebElement vegPizzaTab;

	@FindBy(xpath = "//input[@class='srch-cnt-srch-inpt']")
	private WebElement enterYourDeliveryAddressInputField;

	@FindBy(xpath = "//input[@placeholder='Enter Area / Locality']")
	private WebElement enterAreaInputField;

	@FindBy(xpath = "(//span[@class='lst-desc-main ellipsis'])[1]")
	private WebElement addressResultLink;

	@FindBy(xpath = "//span[text()='Your Cart is Empty']")
	private WebElement emptyCartText;

	public void verifyUserIsOnMenuPage() {
		waitforTime(3);
		Assert.assertTrue(isElementDisplayed(menuPageLogo),
				"User is not navigated to Dominos Menu page. Please check the URL");
	}

	public void clickOnVegPizzaTab() {
		waitforTime(3);
		clickOnElement(vegPizzaTab);
		waitforTime(3);
	}

	public void clickOnOrderNowButton(String product) {
		waitforTime(2);
		clickOnElement(String.format(ORDER_NOW_BUTTON, product));
		waitforTime(3);
	}

	public void enterDelivaryAddress() {
		waitforTime(2);
		clickOnElement(enterYourDeliveryAddressInputField);
		waitforTime(3);
		clickOnElement(enterAreaInputField);
		waitforTime(1);
		enterAreaInputField.sendKeys("Cozy Homes");
		waitforTime(2);
		addressResultLink.click();
	}

	public void verifyCartIsEmpty() {
		waitforTime(3);
		Assert.assertTrue(isElementDisplayed(emptyCartText),
				"Cart is not empty");
	}

}
