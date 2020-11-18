Feature: Apply For Altor Gold Visa

@Smoke
Scenario: Applying for Altoro Mutual Gold Visa
Given User should be on Login Page
When User should enter username and password and click on Login buton
|username|password|
|jsmith|demo1234|
Then User should be navigated to the main account page and Hello Name of the user is displayed there
|nameOnHomePage|
|John Smith|
When User clicks on the visa application link
And User enters the password and clicks on the submit button
Then User should be able to successfully apply for the visa
|successfulVisaApplicationMsg|
|a $10000 and 7.9%|


