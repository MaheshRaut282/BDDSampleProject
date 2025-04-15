Feature: Deals CRUD Management

@SmokeTest
Scenario: Create a new Deal
Given User is logged in
When User create a new Deal

@RegressionTest @SmokeTest
Scenario: View a Deal
Given User is logged in
When User veiws Deals details

Scenario: Delete a Deal
Given User is logged in
When User delete a Deals