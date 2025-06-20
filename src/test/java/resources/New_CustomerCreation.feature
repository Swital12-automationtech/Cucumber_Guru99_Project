Feature: Creation of new customer for Guru99 application

  Background: 
    Given User opens the demo application of guru99
    And the user will enter his username field as "mngr625416"
    And the user will enter his password field as "pYtUzad"
    When user will click on the login button of the application after the fields
    Then user will be navigated to the demo application of guru99

  Scenario Outline: Creation of New Customer
    Given the user clicks on the new customer link in the application guru99
    And user enters the customer name in guru99 application as "<customer_name>"
    And user selects the gender in the page
    And user eters the date of birth in the field as "<date_birth>"
    And user enters the address in guru99 application as "<address>"

    Examples: 
      | customer_name | address  | date_birth |
      | abc           | vadodara | 21-07-2025 |
