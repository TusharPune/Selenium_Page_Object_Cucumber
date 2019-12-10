Feature: Verify Email Content

Scenario Outline: Need to verify email quote mail
When title of login page is GMAIN
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then enter email subject
And click to search
Then Open search result mail
Then verify mail content 
Then Close the browser

	Examples: 
	| username | password |
	| naveenk  | test@123 |