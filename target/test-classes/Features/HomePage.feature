@Regression
Feature: 	Home Page Functionality
 Background:
 		Given user is on Amazon home page
 @Regression
 Scenario: User should see amazon logo on home page
 Then user should see amazon logo
 @Regression
 Scenario Outline: User should be able to search products
 	When user searches for "<product>" as product
 	Then search results are displayed for "<product>" as product
 	Examples:
 	| product |
 	| laptop |
 	| phones |
 	
 	
 	