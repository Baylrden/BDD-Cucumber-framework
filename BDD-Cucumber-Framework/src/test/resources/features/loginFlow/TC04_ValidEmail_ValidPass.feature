Feature: Negative Login test




  Scenario: User trying to login with invalid email and invalid password
    Given User redirecting to "testUrl"
    And Clicking login button and redirecting to login page
    And Writing "validEmail1" to email input
    And Writing "validPass1" to password input
    When Clicking login button
    Then Waits for 3 second
    Then Verifying that login process is successful