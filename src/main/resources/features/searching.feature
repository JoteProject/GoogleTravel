Feature: Search for flight tickets

  Background:
    Given I navigate to Google Flights
    Then I should see Flights landing page

  @Positive
  Scenario: Validate cities and dates - Return Trip
    Then I enter Washington DC in the departure field
    Then I enter Miami in the destination field
    Then I select the departure date
    Then I select the return date
    Then I click search
    And I should see "Best departing flights"

  @Positive
  Scenario: Select expired dates
    Then I enter Washington DC in the departure field
    Then I enter Miami in the destination field
    And I shouldn't be able to click the left button on the departure date

  @Positive
  Scenario: Provide the same departure and destination city
    Then I enter Washington DC in the departure field
    Then I enter Washington DC in the destination field
    Then I click search
    And  I should see "Aw snap, no results."

  @Positive
  Scenario: Search without entering destination city
    Then I enter Washington DC in the departure field
    Then I click search
    And I should see the map

  @Positive
  Scenario: Validate cities and dates - One Way
    Then I enter Washington DC in the departure field
    Then I enter Miami in the destination field
    Then I select the departure date
    Then I click search
    And I should see "Best departing flights"