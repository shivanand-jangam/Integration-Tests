package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.DriverManager;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	@FindBy(id = "user-name")
	private WebElement usernameInputField;

	@FindBy(id = "password")
	private WebElement passwordInputField;

	@FindBy(id = "login-button")
	private WebElement loginButton;

	public void verifyUserIsOnLoginPage() {
		Assert.assertTrue(usernameInputField.isDisplayed(),
				"User is not navigated to login Page. Please check the URL");
	}

	public void enterUsername(String username) {
		usernameInputField.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordInputField.sendKeys(password);
	}

	public void loginButton() {
		loginButton.click();
	}

	public void loginIntoTheApplication(String username, String password) {
		usernameInputField.sendKeys(username);
		passwordInputField.sendKeys(password);
		loginButton.click();
	}

}
