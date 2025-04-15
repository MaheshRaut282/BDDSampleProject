Feature: Contacts CRUD Management

@SmokeTest
Scenario: Create a new Contact
Given User is logged in
When User create a new Contact 

Scenario: View a Contact
Given User is logged in
When User viwes Contact details

Scenario: Delete a Contact
Given User is logged in
When User delete a Contact