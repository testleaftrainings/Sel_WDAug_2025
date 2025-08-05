Feature: Createlead for leaftaps application

#Background:
#Given launch the browser and load the url
@regression
Scenario Outline: createlead with multiple data
When Enter the username as 'demosalesmanager'
When Enter the password as 'crmsfa'
And Click on the login button
And Click on crmsfa link
And click on leads link
And click on createlead link
And Enter the company name as <Company name> 
And enter the first name as <first name>
And Enter the last name as <last name>
When click on the leads button
Then view leads page is displayed

Examples:
|Company name|first name|last name|
|testleaf|saranya|S|
|testleaf|vidya|R|
|qeagle|hari|R|

