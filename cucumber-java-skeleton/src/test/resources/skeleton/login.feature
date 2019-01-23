Feature: Login Feature
Background:
  Given The login URL of Demo workshop 

Scenario Outline: A Valid user for Demo Workshop
When  User Enters "abc@gmail.com" as Username
And  User enters "abc123" as password
And user clicks on login
Then user is valid



#Scenario Outline: A InValid user for Demo Workshop
#When  User Enters "abc@gmail.com" as Username
#And  User enters "abc123" as password
#And user clicks on login
#Then user is invalid

Examples:

|username|password|result|
|abc@gmail.com|abc123|valid|
|askmail@gmail.com|abc123|valid|