Feature: SignIn using the right credential

@login
Scenario: login with valid credentials

Given I am on the login page  
When I fill in "Email" with "hidaanjoniman"
Then i fill in "Password" with "123Weare"
And I press the login button
Then I should be on the user home page 
And i should see "Login successful"
