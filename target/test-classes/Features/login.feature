@login
Feature: Login functionality
	@login
 	Scenario Outline: valid login
 		Given user is on Amazon home page
 		When user clicks on Sign In
  	When user enter "<email>" as username
  	And user click on Continue button
  	When user enter "<password>" as Password
  	Then user click on Signin button
  
		Examples:
		|email|password|
		|9260926982|mak123|
	
	@login
	Scenario Outline: invalid login
		Given user is on Amazon home page
		When user clicks on Sign In
		When user enter "<email>" as username
		Then user gets error message
		Examples:
		|email|
		|4256759087|
		

 		
 		
 
  