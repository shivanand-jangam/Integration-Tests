package base;

import java.util.HashMap;
import java.util.Map;

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
	static String END_POINT;
	static Map<String, String> headers = new HashMap<>();
	static String REQUEST_BODY;

	public RestAssuredUtil() {
		RestAssured.baseURI = fileUtil.getProperty("api.base.uri");
	}

	public void setHeaders(String key, String value) {
		headers.put(key, value);
		headers.put("Authorization", "token=" + TOKEN);
	}

	public void setBody(String body) {
		REQUEST_BODY = body;
	}

	public void setEndpoint(String endpoint) {
		END_POINT = endpoint;
	}

	public static void triggerAPICall(String requestMethod, String endpoint,
			String body) {
		generateToken();
		if (requestMethod.equalsIgnoreCase("POST")) {
			System.out.println("Requesting a CALL for endpoint: " + endpoint);
			response = RestAssured.given().when().headers(headers).body(body)
					.post(endpoint);
			System.out.println(response.asPrettyString());

		} else if (requestMethod.equalsIgnoreCase("PUT")) {
			System.out.println("Requesting a CALL for endpoint: " + endpoint);
			response = RestAssured.given().when().headers(headers).body(body)
					.put(endpoint);
			System.out.println(response.asPrettyString());

		} else if (requestMethod.equalsIgnoreCase("PATCH")) {
			System.out.println("Requesting a CALL for endpoint: " + endpoint);
			response = RestAssured.given().when().headers(headers).body(body)
					.patch(endpoint);
			System.out.println(response.asPrettyString());

		} else if (requestMethod.equalsIgnoreCase("GET")) {
			System.out.println("Requesting a CALL for endpoint: " + endpoint);
			response = RestAssured.given().when().headers(headers).body(body)
					.get(endpoint);
			System.out.println(response.asPrettyString());

		} else if (requestMethod.equalsIgnoreCase("DELETE")) {
			System.out.println("Requesting a CALL for endpoint: " + endpoint);
			response = RestAssured.given().when().headers(headers).body(body)
					.delete(endpoint);
			System.out.println(response.asPrettyString());
		}
	}

	public void triggerAPICall(String requestMethod) {
		generateToken();
		if (requestMethod.equalsIgnoreCase("POST")) {
			System.out.println("Requesting a CALL for endpoint: " + END_POINT);
			response = RestAssured.given().when().headers(headers)
					.body(REQUEST_BODY).post(END_POINT);
			System.out.println(response.asPrettyString());

		} else if (requestMethod.equalsIgnoreCase("PUT")) {
			System.out.println("Requesting a CALL for endpoint: " + END_POINT);
			response = RestAssured.given().when().headers(headers)
					.body(REQUEST_BODY).put(END_POINT);
			System.out.println(response.asPrettyString());

		} else if (requestMethod.equalsIgnoreCase("PATCH")) {
			System.out.println("Requesting a CALL for endpoint: " + END_POINT);
			response = RestAssured.given().when().headers(headers)
					.body(REQUEST_BODY).patch(END_POINT);
			System.out.println(response.asPrettyString());

		} else if (requestMethod.equalsIgnoreCase("GET")) {
			System.out.println("Requesting a CALL for endpoint: " + END_POINT);
			response = RestAssured.given().when().headers(headers)
					.body(REQUEST_BODY).get(END_POINT);
			System.out.println(response.asPrettyString());

		} else if (requestMethod.equalsIgnoreCase("DELETE")) {
			System.out.println("Requesting a CALL for endpoint: " + END_POINT);
			response = RestAssured.given().when().headers(headers)
					.body(REQUEST_BODY).delete(END_POINT);
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
		System.out.println("Generated Token is : " + TOKEN);
	}

	public void verifyResonseCodeAs(int statusCode) {
		Assert.assertEquals(response.getStatusCode(), statusCode);
		System.out.println("Verified status code as: " + statusCode);
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
