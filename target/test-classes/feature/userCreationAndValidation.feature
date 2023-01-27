Feature: Add user and pay bill



Scenario Outline: Creating User account using Add user API
Given Enter user Email ID to create user using <emailID> 
When Click on create user button with 
Then Proper <Message> should be displayed

 
Examples:
|emailID			|Message			|
|"test99@gmail.com"	|"wallet is created and registered for the customer"|
|"test99@gmail.com"	|"wallet is already registered"|
|"failegmailcom"	|"ID is not valid"|
