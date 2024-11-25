Feature: Negative Login test


@wip
  Scenario: User trying to login with invalid email and invalid password
    Given User redirecting to "testUrl"
    And Clicking login button and redirecting to login page
    And Waits for 3 second
    And Clicking Sign Up link
    And Waits for 3 second
    Then Verifying that user redirected to login page