Feature: log in amazon

Scenario: user enters credentials to login
Given user on log in page
When user enters following details
|diwakar@gmail.com|2312@hatch|london|
|prabhakat@gmail.com|2312@hatch|UK|
|sudakar@gmail.com|2312@hatch|Australia|
Then user clicks on login button



