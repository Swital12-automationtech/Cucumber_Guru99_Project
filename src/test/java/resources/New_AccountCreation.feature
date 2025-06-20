Feature: Creation of new account of customer for Guru99 application

  Background: 
    Given User opens the demo application of guru99
    And the user will enter his username field as "mngr625416"
    And the user will enter his password field as "pYtUzad"
    When user will click on the login button of the application after the fields
    Then user will be navigated to the demo application of guru99

  Scenario Outline: Creation of New Account
    Given the user clicks on the new account link in the application guru99
    And user enters the customer id in guru99 application as "<customer_id>"
    And user selects the account type in the page
    And user enter intial deposite as "<intial_deposite>"

    Examples: 
      | customer_id | intial_deposite |
      |         124 |             100 |
