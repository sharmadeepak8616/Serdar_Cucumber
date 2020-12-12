Feature: Landing Page
  # It is the section which is going to execute before every scenario
  Background:
    Given I am on hotels landing page

  # how to perform Data Driven testing(DDT) with Cucumber/BDD
  Scenario Outline: Verify correct number of dropdowns appears for children selected - <value>
    When I select <value> in children
    Then I see <value> age dropdown

    Examples:
      | value |
      | 0     |