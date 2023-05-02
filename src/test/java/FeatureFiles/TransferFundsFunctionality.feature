Feature: Transfer Funds Functionality

  Background:
    Given User navigate to Zero Bank website
    When User enter credentials as "username" and "password"
    Then User click on Online Banking

    Scenario Outline: Transfer Funds Functionality
      When User click on Transfer Funds
      Then User select "1", "5" , "<Amount>" and "<Description>"
      Then User should see successfully transaction message

      Examples:
         | Amount | Description                   |
         | 100    | Transfer to my credit account |
