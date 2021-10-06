Feature: Uber

Scenario: Book a cab
Given user wants to select a car type "sedan" from uber app
#When user selects car "sedan" and pick up point "Bangalore" and drop location "Chennai" exit
Then driver starts the journey
And driver ends the journey
Then user pays 1000 USD