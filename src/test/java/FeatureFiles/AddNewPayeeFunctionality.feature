Feature: Add New Payee Function

Background:
  Given User navigate to Zero Bank website
  When User enter valid username and password



   Scenario Outline: Add New Payee Positive Function
     When User click on Online Banking
     Then User click on Pay Bills
     And User click on Add New Payee and fill "<payeeName>" and "<payeeAddress>" and "<account>"
     Then User should see successfully message
     Then Click on logout
     Then User SignIn again



#     When User click on Add New Payee and fill "<payeeName>" and "<payeeAddress>" and "<account>"
#     Then  User should see warning message






     Examples:
       | payeeName  | payeeAddress | account  |
       | Apple      | lakeview dr. | 552233   |
       | Samsung    | lake         | 112233   |

