Feature: Login Functionality

Scenario: Valid Login

Given user is on login page
When user logs in with username "standard_user" and password "secret_sauce"
Then user should be redirected to product page

Scenario Outline: Invalid login

Given user is on login page
When user logs in with username "<username>" and password "<password>"
Then error message should appear

Examples:
|username     | password      |
|wrong_user   | secret_sauce  |
|standard_user| wrong_password|
|abc          | xyz           |
 