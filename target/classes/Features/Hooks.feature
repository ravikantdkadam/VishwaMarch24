Feature: FreeCRM application Test 

@First
Scenario: Create Contact page Test

#Given user is on homepage
#|rvkadam25@gmail.com|Ravikant@25|
When user move and click on the contact tab 
Then user is on contact page 
Then Click on Create button 
Then Enter the following details and click on save Button 
|Prmila|Ajinky|Sutar|pramila1235@gmail.com|


@Second
Scenario: Create Deals page Test

#Given user is on dealshomepage
#|rvkadam25@gmail.com|Ravikant@25|
When userclick on deals tab
Then user is on deals page 
Then Click on dealsCreate button 
Then Enter the following deals details and click on save Button 
|Vishwatech|1000|50|


