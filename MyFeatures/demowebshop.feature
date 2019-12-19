Feature: my validation on online shopping

@Register
Scenario: user registration
Given DemoShop website is launched
And user clicks on register button
When user enters the proper data
Then clicks on register button to register

@Login
Scenario: user access to Login 
Given registered user clicks on login link 
Then user provides valid data for login input fields
And clicks on submit button for the login validation

@Search
Scenario: user search for the product
Given user is on home page
Then user clicks on search tab
And user searches for the product

@Cart
Scenario: user adds in the cart
Given the search product is available
Then user adds in the cart