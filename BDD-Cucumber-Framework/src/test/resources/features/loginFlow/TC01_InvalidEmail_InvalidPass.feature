Feature: Negative Login test


  Scenario: User trying to login with invalid email and invalid password
    Given User redirecting to "testUrl"
    And Clicking login button and redirecting to login page
    And Writing "invalidEmail1" to email input
    And Writing "invalidPass1" to password input
    When Clicking login button
    Then Verifying that login process is failed