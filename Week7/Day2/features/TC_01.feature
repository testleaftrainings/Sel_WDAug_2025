Feature: Login functionality for leaftaps application
#
#Given launch the browser and load the url
@SMOKE@regression
Scenario: login with valid credentials

When Enter the username as 'demosalesmanager'
When Enter the password as 'crmsfa'
And Click on the login button
Then homepage should be dispalyed


Scenario: login with invalid credentials

When Enter the username as 'demosales'
When Enter the password as 'crmsfa'
And Click on the login button
But Error msg is displayed
