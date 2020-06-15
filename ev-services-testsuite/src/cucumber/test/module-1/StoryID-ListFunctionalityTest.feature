Feature: Verify different GET operation using Rest-Assured
		
	@Debug
	Scenario: Perform POST request to create new list
		When I perform POST operation for "/list"
		Then I should see status code "201"
		And I should see message "The item/record was created successfully." in the response body
		
	@Debug
	Scenario: Perform GET request on List
		When I perform GET operation for "/list" with list id "145550"
		Then I should see status code "200"
		And I should see "145550" in the response body
			
	Scenario: Perform POST request on List to add items
		When I perform POST operation for "/list/ListID/items" with list id "145550"
		Then I should see status code "201"
		And I should see message "Success." in the response body
	
		
	Scenario: Perform GET request on List to clear items
		When I perform GET operation for "/list/145550/clear" with list id "145550"
		Then I should see status code "200"
		And I should see message "Success." in the response body