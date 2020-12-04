@login @regression
Feature: Login feature

  @validLogin @smoke
  Scenario: User is able to login using valid credentials
    When I enter dt@schl.com in email
      And I enter passw0rd in password
      And I click on Sign in button
    Then I verify I am on Welcome page

  @invalidLogin @sanity @smoke
  Scenario: User is not able to login using invalid credentials
    When I enter dt@schl.com in email
    And I enter passw0rd1 in password
    And I click on Sign in button
    Then I verify I get error message