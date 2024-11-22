Feature: Negative Login test


  @wip
  Scenario: User trying to login with google account
    Given User redirecting to "testUrl"
    And Clicking login button and redirecting to login page
    And waits for 3 second
    And Clicking "google" button
    Then waits for 3 second

