Feature: Amazon Search


@Smoke 
Scenario: Search a MacBook
Given I have a search field in Amazon Page  
When I search for a product with name "Apple MacBook Pro" and price 1000 
Then Product with name "Apple MacBook Pro" should be displayed


@Regression
Scenario: Search a iPhone
Given I have a search field in Amazon Page  
When I search for a product with name "Apple MacBook Pro" and price 1000 
Then Product with name "Apple MacBook Pro" should be displayed