Feature: Amazon  Feature Test 

Scenario Outline: Amazon login Feature_Test 

	Given User is already on login page 
	When Title of login page is Amazon Sign In 
	Then Enter the username "<username>" 
	And User clicks on Continue button 
	Then User enter the password "<password>"
	And User click on signin Button 
	Then user should be avialble on homepage 
		
		
		#Examples keyword used with Scenario Outline
		
	Examples:
	 |username|password|
	 |9975674668|Ravikant@25|
	 |8329318994|Ravi@123|
	 |ravikant@gmail.com|Kadam@123|
	

	
	
