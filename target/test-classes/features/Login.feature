Feature: Login into Application
	Scenario Outline: Positive test validating login
	Given Initialize the browser with chrome
	And Navigate to "http://www.qaclickacademy.com/" site
	And Click on Login link in home page to land on Secure sign in page
	When User enters <username> and <password> and logs in
	Then Verify that user is succesfully logged in 
	Then Close browser
	
	Examples:
	|username                |password    |
	| aryanraza550@gmail.com | Jakirh641@ |
	|aryanraza5550@gmail.com  | Jakirh6641@ |