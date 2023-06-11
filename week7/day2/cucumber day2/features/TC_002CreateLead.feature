Feature: CreateLead functionality of Leaftaps Application

#Background:
#Given Open the chrome browser
#And Load the url

@Smoke @Regression
Scenario Outline: CreateLead for multiple data
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed
When Click on crmsfa link
And Click on Leads Link
And Click on CreateLead Link
Given Enter the companyName as <companyName>
And Enter the firstname as <firstName>
And Enter the lastname as <lastName>
When Click on Submit button
Then ViewLeadsPage should be displayed as <companyName>


Examples:
|companyName|firstName|lastName|
|TestLeaf|Subraja|Subi|
|Qeagle|Vidhya|R|
