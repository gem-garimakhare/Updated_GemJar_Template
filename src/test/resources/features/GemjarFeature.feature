Feature: Demo QA automation

  Scenario: Fill data in Demo QA app
    Given User is on the Demo QA app
    When User clicks on Elements
    And User clicks on Text box
    And User enter details in Text Box
    And User clicks on Submit
    Then User verifies if data is submitted or not
