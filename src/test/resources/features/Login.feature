Feature: Login Functionality

  Scenario Outline: Verify User Login with valid credentials
    Given Navigate to the Application URL - "https://www.saucedemo.com/"
    When Enter <validUserName> and <validPassword>
    And Click on Login Button
    Then Verify that the user is logged in - "true"
    Examples:
      | validUserName | validPassword |
      | standard_user | secret_sauce  |
      | problem_user  | secret_sauce  |

  Scenario Outline: Verify User Login with Invalid credentials
    Given Navigate to the Application URL - "https://www.saucedemo.com/"
    When Enter <inValidUserName> and <inValidPassword>
    And Click on Login Button
    Then Verify that the user is logged in - "false"
    Examples:
      | inValidUserName | inValidPassword |
      | locked_out_user | secret_sauce    |




