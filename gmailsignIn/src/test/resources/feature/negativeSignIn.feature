Feature: User try to enter not the valid Email

@invalidEmail
Scenario: Try to login with invalid credential

Given user should be on the login page accout
When user should enter the invalid "Email" hidanjoniman@gmailcom
Then user should click to next button
Then user should the enter the valid email text 
