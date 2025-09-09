Feature: Login functionality of Leaftaps application

#Background:
#Given Launch the browser and load the url
@Smoke@Regression
Scenario: Login with valid credentials

When Enter the username as 'demosalesmanager'
When Enter the password as 'crmsfa'
When click on login button
Then Homepage is displayed

@Sanity
Scenario: Login with invalid credentials

When Enter the username as 'demosales'
When Enter the password as 'crmsfa'
When click on login button
But Error msg is displayed