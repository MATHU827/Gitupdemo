@New_Feature 
Feature: Guru99 website 

@tc01_LinkedIn
Scenario: 
	Learn cucumber framework with the help of guru99 website
	
	Given the user launched the chrome browser 
	When the user opens Linkedin homepage 
	And clicks signin
	Then the user should navigate to join page
	
@tc02_Google
Scenario: 
	Check that main elements on a google homepage are displayed

	Given launch an chrome browser 
	When the user opens google homepage 
	Then user opens linkedin page
	And clicks Join send keys
	
	