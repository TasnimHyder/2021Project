Feature: WebMD Sign up Feature
	This feature is for WebMD sign up functionality
		
	@Sprint1 
	Scenario: Verify user is able to sign up using correct credentials
		Given I land on the WebMD homepage
		When I click on sign in
		And I click on sign up link
		And I enter correct email, password, dob
		And I click on sign up button
		Then I should be able to see my profile text
