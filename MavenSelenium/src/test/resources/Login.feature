#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Login
Feature: Login into rediffmoney
  I want to login into rediffmoney account

  @Validation
  Scenario Outline: validate login page with different credentials
    Given To Open a firefox browser
    And URL is entered in the browser
    When I enter <username> and <password>
    And I click submit
    Then I verify the <status> of login

    Examples: 
      | username                        | password           | status  |
      | vallurisivarajesh@gmail.com     |     magnitia1@3    | PASS    |
      | abcd@gmaoil.com                 |     7              | FAIL    |
