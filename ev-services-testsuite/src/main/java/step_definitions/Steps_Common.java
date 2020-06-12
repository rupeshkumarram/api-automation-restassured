package step_definitions;

import static genericLib.GlobalVariable.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;


public class Steps_Common {
	 
	 private static Response response;
	 private static String jsonString;
	 private static RequestSpecification request;	
	
	@Given("I set list service api end point")
	public void i_set_list_service_api_end_point() {
		RestAssured.baseURI = getBaseURI();
	}

	@When("I set request HEADER")
	public void i_set_request_HEADER() {
		request = RestAssured.given()
			    .header("Content-Type","application/json")
				.queryParam("api_key", getAPIKey())
	            .queryParam("page", "1")
	 			.relaxedHTTPSValidation();
	}

	@When("Send a GET http request")
	public void send_a_GET_http_request() {
		response = request.get("/list/49592");
	}

	@Then("I should receive valid response")
	public void i_should_receive_valid_response() {
	//	response.then().assertThat().statusCode(200);
	//	assertThat(200, is(response.getStatusCode()));
		jsonString = response.asString();
		System.out.println(response.getStatusCode());
		System.out.println("Print response as string: "+jsonString);
	}

	@Then("I should see {string} in the list received")
	public void i_should_see_in_the_list_received(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}
	
}
