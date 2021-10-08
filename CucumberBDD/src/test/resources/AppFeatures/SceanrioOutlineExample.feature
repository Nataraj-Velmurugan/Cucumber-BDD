Feature: login feature

Background:
 	Given user lands on login page

Scenario Outline: outline1
 	When user enters the username "<username>"
 	Then user enters the password "<password>"
 	And  user click login button
 	Then user finds the error message
 	
 	 Examples:
     	|username|password|
			|alpha   |0001    |
			|beta    |0002    |
			|gama    |0003    |

Scenario Outline: outline2
 	When user enters the username "<username>"
 	Then user enters the password "<password>"
 	And  user click login button
 	Then user finds the error message
 
 Examples:
     	|username|password|
			|alpha   |0001    |
			|beta    |0002    |
			|gama    |0003    |