Feature: login feature
Scenario Outline: login with multiple data
Given login page is enabled
Then user has to enter username "<userName>"
And user has to enter password "<password>" 

  Examples:
 |useName|password|
 |diwakar|1234|
 |suma|4321|

