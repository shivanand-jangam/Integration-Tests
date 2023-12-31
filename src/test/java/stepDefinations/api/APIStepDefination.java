package stepDefinations.api;

import base.RestAssuredUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class APIStepDefination {

	RestAssuredUtil restAssuredUtil = new RestAssuredUtil();

	@Given("I have the API endpoint {string}")
	public void i_have_the_api_endpoint(String endpoint) {
		restAssuredUtil.setEndpoint(endpoint);
	}

	@When("I provided the body for create booking")
	public void i_provided_the_body_for_create_booking() {
		String body = "{\"firstname\":\"ApiFName\",\"lastname\":\"ApiLName\",\"totalprice\":656565,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2024-01-01\",\"checkout\":\"2024-01-01\"},\"additionalneeds\":\"Breakfast\"}";
		restAssuredUtil.setBody(body);
	}

	@When("I provided the content type as {string}")
	public void i_provided_the_content_type_as(String string) {
		restAssuredUtil.setHeaders("Content-Type", "application/json");
	}

	@When("I make a {string} request")
	public void i_make_a_request(String requestType) {
		restAssuredUtil.triggerAPICall(requestType);
	}

	@Then("the response status code should be {int}")
	public void the_response_status_code_should_be(Integer statucCode) {
		restAssuredUtil.verifyResonseCodeAs(statucCode);
	}

	@Then("the verify booking id is generated")
	public void the_verify_booking_id_is_generated() {
		restAssuredUtil.verifyBookingIdGenerated();
	}

}
