@scenario1
Feature:Test the php travels application
Scenario:Test the registration Page with valid details
Given Open Chrome browser and url of the application
When Enter all elements details
Then click on registration button
 
 @scenario1
Scenario Outline:Test the login page with valid details 
Given Open chrome browser and url of the application
When Enter "<Email>" , "<password>" and click on login button
Then Success in login 

Examples:
|Email                     |password   |
|khedkarasha.chita         |Asha@123    |
