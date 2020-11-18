Feature: View Account Details 

Background: User Logs Into Altoro Mutual
Given User should be on Login Page
When User should enter username and password and click on Login buton
|username|password|
|jsmith|demo1234|

@Smoke
Scenario Outline: Account Details Verification
Given User is on HomePage
When User Selects the account and clicks on Go Button "<accountNumber>"
Then User should be navigated to Account History Page
And Correct Account Number should be displayed on Account History Page
Examples:
|accountNumber|
|800003 Checking|
|800002 Savings|
