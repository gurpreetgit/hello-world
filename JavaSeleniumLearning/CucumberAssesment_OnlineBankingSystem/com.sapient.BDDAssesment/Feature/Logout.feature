Feature: Succesful Logging Out from Altoro Mutual

Background: User Logs Into Altoro Mutual
Given User should be on Login Page
When User should enter username and password and click on Login buton
|username|password|
|jsmith|demo1234|

@Smoke
Scenario: Successful Logout
When User clicks on sign-out link
Then User should be logged out