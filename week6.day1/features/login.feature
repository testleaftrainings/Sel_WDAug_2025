Feature: Login functionality of Leaftaps application

Scenario: Login with valid credentials
Given Launch the browser and load the url
When Enter the username as 'demosalesmanager'
When Enter the password as 'crmsfa'
When click on login button
Then Homepage is displayed


Scenario: Login with invalid credentials
Given Launch the browser and load the url
When Enter the username as 'demosales'
When Enter the password as 'crmsfa'
When click on login button
But Error msg is displayed