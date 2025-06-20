Feature: Validate Login Functionality for Demo Application Guru99

  Scenario Outline: To Validate the login functionality for Guru99 application
    Given User opens the demo application of guru99
    And the user will enter his username field as "<username>"
    And the user will enter his password field as "<password>"
    When user will click on the login button of the application after the fields
    Then user will be navigated to the demo application of guru99

    Examples: 
      | username   | password |
      | mngr625416 | pYtUzad  |
