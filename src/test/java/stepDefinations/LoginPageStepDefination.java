package stepDefinations;

import base.BrowserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStepDefination {

	LoginPage loginPage = new LoginPage();
	BrowserFactory browserFactory = new BrowserFactory();

	@Given("User is on Swag Labs Login Page")
	public void user_is_on_swag_labs_login_page() {
		loginPage.verifyUserIsOnLoginPage();
	}

	@When("User enteres {string} details")
	public void user_enteres_details(String user) {
		loginPage.loginIntoTheApplication(user, "secret_sauce");
	}
}
