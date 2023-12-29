package base;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.PropertyFileUtil;

public class RestAssuredUtil {

	// API Base URI -
	// Request Headers
	// Request Method
	// API / End point
	static PropertyFileUtil fileUtil = new PropertyFileUtil();

	static Response response;
	static String TOKEN;

	public RestAssuredUtil() {
		RestAssured.baseURI = fileUtil.getProperty("api.base.uri");
	}

	public static void triggerAPICall(String requestMethod, String endpoint,
			String body) {
		generateToken();
		if (requestMethod.equalsIgnoreCase("POST")) {
			System.out.println("Requesting a CALL for endpoint: " + endpoint);
			response = RestAssured.given().when()
					.header("Content-Type", ContentType.JSON)
					.header("Authorization", "token=" + TOKEN).body(body)
					.post(endpoint);
			System.out.println(response.asPrettyString());

		} else if (requestMethod.equalsIgnoreCase("PUT")) {
			System.out.println("Requesting a CALL for endpoint: " + endpoint);
			response = RestAssured.given().when()
					.header("Content-Type", ContentType.JSON)
					.header("Authorization", "token=" + TOKEN).body(body)
					.put(endpoint);
			System.out.println(response.asPrettyString());

		} else if (requestMethod.equalsIgnoreCase("PATCH")) {
			System.out.println("Requesting a CALL for endpoint: " + endpoint);
			response = RestAssured.given().when()
					.header("Content-Type", ContentType.JSON)
					.header("Authorization", "token=" + TOKEN).body(body)
					.patch(endpoint);
			System.out.println(response.asPrettyString());

		} else if (requestMethod.equalsIgnoreCase("GET")) {
			System.out.println("Requesting a CALL for endpoint: " + endpoint);
			response = RestAssured.given().when()
					.header("Content-Type", ContentType.JSON)
					.header("Authorization", "Bearer " + TOKEN).body(body)
					.get(endpoint);
			System.out.println(response.asPrettyString());

		} else if (requestMethod.equalsIgnoreCase("DELETE")) {
			System.out.println("Requesting a CALL for endpoint: " + endpoint);
			response = RestAssured.given().when()
					.header("Content-Type", ContentType.JSON)
					.header("Authorization", "token=" + TOKEN).body(body)
					.delete(endpoint);
			System.out.println(response.asPrettyString());
		}
	}
	
	public static void generateToken() {
		String endpoint = "/auth";
		String body = "{\"username\" : " + "\""
				+ fileUtil.getProperty("api.username") + "\""
				+ ",\"password\" : " + "\""
				+ fileUtil.getProperty("api.password") + "\"" + "}";
		response = RestAssured.given().when()
				.header("Content-Type", ContentType.JSON).body(body)
				.post(endpoint);
		Assert.assertEquals(response.getStatusCode(), 200);
		TOKEN = response.jsonPath().get("token");
		System.out.println(TOKEN);
	}

	public void verifyResonseCodeAs(int statusCode) {
		Assert.assertEquals(response.getStatusCode(), statusCode);
	}
	
	
	// public static void main(String[] args) {
		//
		// RestAssuredUtil assuredUtil = new RestAssuredUtil();
		//
		// assuredUtil.generateToken();
		//
		// String body2 =
		// "{\"firstname\":\"TestFname\",\"lastname\":\"TestLname\",\"totalprice\":252525,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2018-01-01\",\"checkout\":\"2019-01-01\"},\"additionalneeds\":\"Breakfast\"}";
		//
		// triggerAPICall("POST", "/booking", body2);
		//
		// Assert.assertEquals(response.getStatusCode(), 200);
		//
		// int bookingId = response.jsonPath().get("bookingid");
		// System.out.println(bookingId);
		//
		// triggerAPICall("GET", "/booking/" + bookingId, "");
		//
		// }

}
