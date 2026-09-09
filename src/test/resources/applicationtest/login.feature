
Feature: Login Functionality 
Scenario: Login with valid credentials 
Given  user is on login page
When  user enters valid user name "standard_user"
And user enters valid password "secret_sauce"
And user click on login button 
Then user should be navigated to the product page


Scenario: Login with invalid Credentials
Given  user is on login page
When  user enters invalid user name "Minal"
And user enters invalid password "Minal@123"
And user click on login button 
Then user should get error message                          


