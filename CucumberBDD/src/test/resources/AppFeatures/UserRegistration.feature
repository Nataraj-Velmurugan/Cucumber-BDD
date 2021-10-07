Feature: Data Table

Scenario: Data Table 1
	Given user lands ion reg page
	When user enters the following details
		|alpha|0001|green|
		|beta|0002|red|
		|gama|0003|blue|
	Then user registered succesfully
	
Scenario: Data Table 2
	Given user lands ion reg page
	When user enters the following details as map
		|name|code|color|
		|alpha|0001|green|
		|beta|0002|red|
		|gama|0003|blue|
	Then user registered succesfully