package step_definitions;

import static genericLib.Utility.*;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;


public class Steps_Common {

	 private static JsonPath jsonPathEvaluator;
	 
	 @When("I perform POST operation for {string}")
	 public void i_perform_POST_operation_for(String string) {
		 performPostWithBodyParameter();
	 }

	 @Then("I should see status code {string}")
	 public void i_should_see_status_code(String statusCode) {
		 Assert.assertEquals(statusCode, Integer.toString(response.getStatusCode()));
		 System.out.println("Print status code: "+response.getStatusCode());
	 }

	 @Then("I should see message {string} in the response body")
	 public void i_should_see_message_in_the_response_body(String errorMessage) {
		 jsonPathEvaluator = response.jsonPath();
		 Assert.assertEquals(errorMessage, jsonPathEvaluator.get("status_message"));
		 System.out.println("Print response as string: "+jsonPathEvaluator.get("status_message"));
	 }
	 
	 @When("I perform GET operation for {string} with list id {string}")
	 public void i_perform_GET_operation_for_with_list_id(String string, String listID) {
		 performGetwithListId(listID);
	 }

	 @Then("I should see {string} in the response body")
	 public void i_should_see_in_the_response_body(String listID) {
		 jsonPathEvaluator = response.jsonPath();
		 Assert.assertEquals(listID, Integer.toString(jsonPathEvaluator.get("id")));
		 System.out.println("Print response as string: "+jsonPathEvaluator.get("id"));
	 }
}
