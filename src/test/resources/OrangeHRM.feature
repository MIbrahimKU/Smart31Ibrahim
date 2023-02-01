@smokeTest
Feature: Verify login function in Orange HRM web application 
 
 Scenario: Sussessfully loging to Orange HRM web application 
    Given User go to Orange HRM home page
    And User click on the username field
    When User able to enter username on username field
    And User able to click on the password field
    And User able to Enter Password on password field
    Then User able to click on the login button
    And User verify the Text in HomePage "Dashboard"