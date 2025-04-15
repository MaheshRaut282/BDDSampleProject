Feature: User Login Funtion

#Scenario: Valid Login Admin
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPasswork!"
#Then Should display success message


Scenario Outline: Valid Login Admin
Given User is on Login Page
When User enters "<username>" and "<password>"
Then Should display success message

Examples:
	|	username	| password	|
	|	tomsmith	| SuperSecretPassword!	|
	|	tomsmith	| SuperSecretPassword12	|
	|	tomsmith12"	| "SuperSecretPassword!	|