Feature: Purchase Foreign Functionality

Background:
  Given User navigate to Zero Bank website
  When User enter credentials as "username" and "password"
  Then User click on Online Banking
  Then User click on Pay Bills

  Scenario Outline:  Purchase Foreign Functionality
      When User click on Purchase Foreign Currency
      Then User select the  "CAD" and fill "<amount>" and select the USD
      Then User should see successfully message

      Examples:
        | amount |
        | 200    |
        | 150    |