Feature: Negative Login test



  Scenario: User trying to login with microsoft account
    Given User redirecting to "testUrl"
    And Clicking login button and redirecting to login page
    And Waits for 3 second
    And Clicking "microsoft" button
    Then Waits for 3 second
    And Filling email input in "microsoft" page
    And Waits for 3 second
    And Filling password input in "microsoft" page
    Then Verifying that login process is successful via title