Feature: Login functionality of Leaftaps Application

Background:
Given Open the chrome browser
And Load the url

Scenario Outline: Login for positive credentials
Given Enter the username as <userName>
And Enter the password as <passWord>
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
|userName|passWord|companyName|firstName|lastName|
|Demosalesmanager|crmsfa|TestLeaf|Subraja|Subi|
|DemoCSR|crmsfa|Qeagle|Vidhya|R|
