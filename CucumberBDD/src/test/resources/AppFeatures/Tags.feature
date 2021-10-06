@All
Feature: Tag


@Smoke
Scenario: Book a cab sedan 
	Given user wants to select a car type from uber app as "sedan1"
	When user selects car pick up point 
	Then driver starts the journeys
	And driver ends the journeys
	Then user pays USD 1000


@Regression
Scenario: Book a cab SUV
	Given user wants to select a car type from uber app as "SUV"
	When user selects car pick up point 
	Then driver starts the journeys
	And driver ends the journeys
	Then user pays USD 1000


@Smoke @Regression
Scenario: Book a cab MUV
	Given user wants to select a car type from uber app as "MUV"
	When user selects car pick up point 
	Then driver starts the journeys
	And driver ends the journeys
	Then user pays USD 1000


@Prod
Scenario: Book a cab Bus
	Given user wants to select a car type from uber app as "Bus"
	When user selects car pick up point 
	Then driver starts the journeys
	And driver ends the journeys
	Then user pays USD 1000