package stepDefinations.VitthalDominosSteps;

import io.cucumber.java.en.Given;
import pages.VitthalDominosPages.DominosHomePage;

public class DominosHomePageStepDefinition {

	DominosHomePage dominosHomePage = new DominosHomePage();

	@Given("User is on Dominos Home page")
	public void user_is_on_dominos_home_page() {
		dominosHomePage.verifyUserIsOnHomePage();
	}

	@Given("User click on OUR MENU")
	public void user_click_on() {
		dominosHomePage.clickOnOurMenuLink();
	}

}
