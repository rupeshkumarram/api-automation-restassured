Feature: Verify different GET operation using Rest-Assured

	Background:
		Given I set list service api end point

	@Debug
	Scenario: I should search the list
		When I set request HEADER
		And Send a GET http request
		Then I should receive valid response
		And I should see "49592" in the list received
		
	
	Scenario: I should create the list
		When I set request HEADER
		And Send a GET http request
		Then I should receive valid response
		And I should see "" in the list received
		
	Scenario: I should add the items in the list
		When I set request HEADER
		And Send a GET http request
		Then I should receive valid response
		And I should see "" in the list received
		
	Scenario: I should see newly created list
		When I set request HEADER
		And Send a GET http request
		Then I should receive valid response
		And I should see "" in the list received
		
	Scenario: I should add the item in the list
		When I set request HEADER
		And Send a GET http request
		Then I should receive valid response
		And I should see "" in the list received
		
	Scenario: I should able to clear the list
		When I set request HEADER
		And Send a GET http request
		Then I should receive valid response
		And I should see "" in the list received
		
	Scenario: I should delete the list
		When I set request HEADER
		And Send a GET http request
		Then I should receive valid response
		And I should see "" in the list received
		
		