$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/cucumber/test/module-1/StoryID-ListFunctionalityTest.feature");
formatter.feature({
  "name": "Verify different GET operation using Rest-Assured",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Perform POST request to create new list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Debug"
    }
  ]
});
formatter.step({
  "name": "I perform POST operation for \"/list\"",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_perform_POST_operation_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see status code \"201\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_should_see_status_code(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see message \"The item/record was created successfully.\" in the response body",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_should_see_message_in_the_response_body(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Perform GET request on List",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Debug"
    }
  ]
});
formatter.step({
  "name": "I perform GET operation for \"/list\" with list id \"145550\"",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_perform_GET_operation_for_with_list_id(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see status code \"200\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_should_see_status_code(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"145550\" in the response body",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.Steps_Common.i_should_see_in_the_response_body(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});