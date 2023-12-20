package pages.VitthalDominosPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.CommonSeleniumActions;
import base.DriverManager;

public class DominosHomePage extends CommonSeleniumActions {

	public DominosHomePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	@FindBy(xpath = "//a[@class='logo-image']")
	private WebElement dominosLogoImg;

	@FindBy(xpath = "//a[text()='OUR MENU']")
	private WebElement ourMenuLink;

	public void verifyUserIsOnHomePage() {
		waitforTime(3);
		Assert.assertTrue(isElementDisplayed(dominosLogoImg),
				"User is not navigated to Dominos home page. Please check the URL");
	}

	public void clickOnOurMenuLink() {
		ourMenuLink.click();
		waitforTime(3);
	}
}
