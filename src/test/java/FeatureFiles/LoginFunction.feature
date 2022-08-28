Feature: Login Function

  Scenario: Login with valid username and password
    Given User navigate to Zero Bank website
    When User enter valid username and password
    Then User should login successfully