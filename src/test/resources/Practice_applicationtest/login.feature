
Feature: Login Functionality

Scenario: Login with valid credentials

Given user is on the login page
When user enters valid username "standard_user"
And user enters valid pswd "secret_sauce"
And user click on the login button
Then user should be navigated to the Product page 