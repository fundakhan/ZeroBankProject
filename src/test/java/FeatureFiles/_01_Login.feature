Feature: Login Functionality

  Scenario: Login with valid username and password as positive test
    Given User navigate to Zero Bank website
    When User enter credentials as "username" and "password"
    Then User should login successfully
    Then User close the website

