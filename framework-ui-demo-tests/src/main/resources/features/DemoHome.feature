Feature: As a administrator of the puppy adoption site
  I want to access demo admin panel
  So i can update, delete and insert new puppy details

  Background:
    Given I am on the puppy adoption home page

  @Regression
  Scenario: Basic ui verification of the homepage
    When I should see page header title
    And I should see puppy view page button
    Then I make an error in page

  @Regression
  Scenario: Verify the puppy adoption complete flow
    When I should see page header title
    And I should see puppy view page button
    And I adopt selected puppy
    Then I continue adoption completion flow
    And I fill all necessary registration details
    Then I submit the place order

  @smoke @regression
  Scenario: Select a puppy
   When i go to the home page
   And i should verify the home page
   Then i select puppy


