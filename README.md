# UIAutomation
Assumption:

There is no authentication required to access the user account
There are 4 different WebPages at work here.
URL="modipayment.com"
if there is no bill to pay, page will not show any bill
customer will pay bill will billID
customer will get the appropriate message while creating account, while paying bill or while adding amount in wallet
if need in future the response can be updated in json response instead of static string response
Automation Tool and libraries: RestAssured, Cucumber, Junit, Tidy Gherkins, Maven, Git, extent reports Programming Language: Java, Gherkins

Framework structure

TestRunner class with use testNG runner to run the test cases
with multiple feature file and multiple step defination file we can control which test to run
using hook we will initalize the report creation using extent reports and launch URL from before hooks
we are creating reports using reporting with after class
we have also added capabilities to create log4j documentation if required in future

