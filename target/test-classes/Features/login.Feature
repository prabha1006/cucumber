Feature: Validation of login page

  Scenario Outline:Validate the orangehrm login with valid credentials
    Given launch the browser
    And open the orange hrm Application
    When enter the "<username>" and "<password>"
    And click the login button
    Then validate the login message
     And close the browser
     Examples:
            |username|password|
            |admin|admin123|
            |thillai|arasu|