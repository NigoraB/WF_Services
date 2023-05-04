Feature: Account Page Feature

Background:
Given user has already logged in to application
|username|password|
|test@gmail.com|Selenium@12345|

@accounts
Scenario: Accounts page title
Given user is on Accounts page
When user gets the title of the Accounts page
Then Accounts page title should be "Account Summary - Wells Fargo"

@accounts
Scenario: Navigation Bar section count
Given user is on Accounts page
Then user gets Navigation Bar section
|Accounts|
|Brokerage|
|Transfer & Pay|
|Plan & Learn|
|Security & Support|
And Navigation Bar section count should be 5

