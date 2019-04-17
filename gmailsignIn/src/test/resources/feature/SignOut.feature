Feature: User should login to his account and signOut

@signout
Scenario: Login to account then sign out

Given User should be on the login page account 
When user should enter the valid "Email" hidanjoniman@gmail.com 
Then user should click to next button
Then user should login seccsefuly
Then user should click on the account icon 
And user should click to sign in button and user should successfuly signout
