Feature: Add New Payee Function

Background:
  Given User navigate to Zero Bank website
  When User enter credentials as "username" and "password"



   Scenario Outline: Add New Payee Positive Function
     When User click on Online Banking
     Then User click on Pay Bills
     And User click on Add New Payee and fill "<payeeName>" and "<payeeAddress>" and "<account>"
     Then Result should be displayed successfully



     Examples:
       | payeeName  | payeeAddress | account  |
       | Apple      | Chicago      | saving   |
       | Samsung    | Weston       |          |

