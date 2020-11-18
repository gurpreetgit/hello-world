Feature: Verify Search News Articles

Background: User Logs Into Altoro Mutual
Given User should be on Login Page
When User should enter username and password and click on Login buton
|username|password|
|jsmith|demo1234|

@Smoke
Scenario: Search News Articles Verification
Given User is on HomePage
Then Home Page I want to Options should be displayed 
|iWantToOptions|
|View Account Summary|
|View Recent Transactions|
|Transfer Funds|
|Search News Articles|
|Customize Site Language|
When User clicks on Search news Articles Link
Then User should be navigated to search screen
When User searches for the news articles
|newsArticlesToBeSearched|
|Watchfire|
Then User should be able to successfully search the articles