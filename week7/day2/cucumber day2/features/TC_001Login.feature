Feature: Login functionality of Leaftaps Application

#Background:
#Given Open the chrome browser
#And Load the url

@Smoke
Scenario: Login for positive credentials
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed

@Regression
Scenario: Login for invalid credentials
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsf'
When Click on Login button
But ErrorMessage should be displayed


