Feature: Negative Login test


  @wip
  Scenario: User trying to login with google account
    Given User redirecting to "testUrl"
    And Clicking login button and redirecting to login page
    And Waits for 3 second
    And Clicking "google" button
    Then Waits for 3 second
    And Filling email input in google page
    And Waits for 3 second
    And Filling password input in google page
    And Waits for 3 second
    Then Verifying that login process is successful via title